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

@Controller
public class PersonController {
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Resource(name = "personService")
    private IPersonService personService;

    @RequestMapping("index")
    public String index() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
//        PersonServiceImpl personService = (PersonServiceImpl) factory.getBean("personService");
//        personService.call();
        logger.info("the first jsp pages");
        return "index";
    }

    @RequestMapping("person")
    public ModelAndView person(String name) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        try {
            Person person = personService.selectPersonByName(name);
            modelAndView.addObject("person",person);
        } catch (Exception e) {
            System.out.println("PersonController:");
            e.printStackTrace();
        }
        return modelAndView;
    }

}
