package edu.ustc.SpringStart.controller;

import edu.ustc.SpringStart.service.IPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String person(String name) {
        try {
            System.out.println(name);
            System.out.println(personService.selectPersonByName(name));
        } catch (Exception e) {
            System.out.println("PersonController:");
            e.printStackTrace();
        }
        return "index";
    }

}
