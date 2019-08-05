package edu.ustc.SpringStart.controller;

import edu.ustc.SpringStart.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("index")
    public String index() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        PersonService personService = (PersonService) factory.getBean("personService");
        personService.call();
        logger.info("the first jsp pages");
        return "index";
    }

}
