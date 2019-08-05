package edu.ustc.SpringStart.service;

import edu.ustc.SpringStart.dao.PersonDao;
import org.aspectj.lang.annotation.Pointcut;

import javax.annotation.Resource;

//@Service(value = "personService")
public class PersonService {

//    //自动装配
//    @Autowired
//    private PersonDao personDao;
//    //注解方式不需要set方法

    //name属性是创建dao对象的value值
    @Resource(name = "personDao")
    private PersonDao personDao;
    @Pointcut
    public void call() {
        personDao.call();
        System.out.println("personService...");
    }
}
