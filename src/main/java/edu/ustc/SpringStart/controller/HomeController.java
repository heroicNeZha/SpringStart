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
    private ApplicationContext factory = new ClassPathXmlApplicationContext("spring/spring-aop.xml");
    private ApplicationContext factory2 = new ClassPathXmlApplicationContext("spring/AnnoContext.xml");

    @RequestMapping("index")
    public String index() {
        PersonService personService = (PersonService) factory.getBean("personService");
        personService.call();
        logger.info("the first jsp pages");
        return "index";
    }

}
