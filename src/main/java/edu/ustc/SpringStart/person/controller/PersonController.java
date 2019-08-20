package edu.ustc.SpringStart.person.controller;

import edu.ustc.SpringStart.person.POJO.Person;
import edu.ustc.SpringStart.person.service.IPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/person")
public class PersonController {
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Resource(name = "personService")
    private IPersonService personService;

    @RequestMapping("/index")
    public String index() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
//        PersonServiceImpl personService = (PersonServiceImpl) factory.getBean("personService");
//        personService.call();
        logger.info("the first jsp pages");
        return "index";
    }

    @RequestMapping("/")
    public ModelAndView person() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("person/list");
        try {
            List<Person> people = personService.queryAll();
            modelAndView.addObject("people", people);
        } catch (Exception e) {
            System.out.println("PersonController:");
            e.printStackTrace();
        }
        return modelAndView;
    }

    @RequestMapping("/search")
    public ModelAndView search(String name) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("person/list");
        try {
            List<Person> people = personService.queryPersonByName(name);
            modelAndView.addObject("people", people);
        } catch (Exception e) {
            System.out.println("PersonController:");
            e.printStackTrace();
        }
        return modelAndView;
    }

    @RequestMapping("/person")
    public ModelAndView search(int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("person/list");
        try {
            Person person = personService.queryPersonById(id);
            List<Person> people = new ArrayList<>();
            people.add(person);
            modelAndView.addObject("people", people);
        } catch (Exception e) {
            System.out.println("PersonController:");
            e.printStackTrace();
        }
        return modelAndView;
    }

    @RequestMapping("/init")
    public ModelAndView init(Person person) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("person/init");
        if (person.getId() != 0) {
            try {
                Person person1 = personService.queryPersonById(person.getId());
                modelAndView.addObject("person", person1);
            } catch (Exception e) {
                System.out.println("PersonController:");
                e.printStackTrace();
            }
        }
        return modelAndView;
    }

    @RequestMapping("/save")
    @ResponseBody
    public Map<String, Object> saveOrUpdatePerson(Person person) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        try {
            if (person.getId() > 0) {
                int flag = personService.updatePersonById(person);
                if (flag > 0) {// 保存成功
                    modelMap.put("success", true);
                } else {
                    modelMap.put("success", false);
                    modelMap.put("data", "保存失败，错误码:" + flag);
                }
            } else {
                int flag = personService.addPerson(person);
                if (flag > 0) {// 保存成功
                    modelMap.put("success", true);
                } else {
                    modelMap.put("success", false);
                    modelMap.put("data", "保存失败，错误码:" + flag);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
            modelMap.put("data", e.getMessage());
        }
        return modelMap;

    }

    @RequestMapping("/delete")
    @ResponseBody
    public Map<String, Object> deletePerson(int id) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        try {
            if (id > 0) {
                int flag = personService.deletePersonById(id);
                if (flag > 0) {// 保存成功
                    modelMap.put("success", true);
                } else {
                    modelMap.put("success", false);
                    modelMap.put("data", "保存失败，错误码:" + flag);
                }
            } else {
                modelMap.put("success", false);
                modelMap.put("data", "保存失败, 未选中Person");
            }

        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
            modelMap.put("data", e.getMessage());
        }
        return modelMap;

    }

}
