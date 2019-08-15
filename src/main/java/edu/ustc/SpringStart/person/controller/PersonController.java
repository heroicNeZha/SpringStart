package edu.ustc.SpringStart.person.controller;

import edu.ustc.SpringStart.person.POJO.Person;
import edu.ustc.SpringStart.person.service.IPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
            Person person = personService.queryPersonByName(name);
            List<Person> people = new ArrayList<>();
            people.add(person);
            modelAndView.addObject("people", people);
        } catch (Exception e) {
            System.out.println("PersonController:");
            e.printStackTrace();
        }
        return modelAndView;
    }

}
