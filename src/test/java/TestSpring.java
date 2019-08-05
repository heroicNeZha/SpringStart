import edu.ustc.SpringStart.service.PersonService;
import edu.ustc.SpringStart.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testIOC() {
        //加载spring配置文件，根据创建对象
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        PersonService personService = (PersonService) factory.getBean("personService");
        personService.call();
    }

    //通过加载两个配置文件实现失败？？
//    @Test
//    public void testAnno() {
//        //通过注解方式创建对象
//        ApplicationContext factory = new ClassPathXmlApplicationContext("spring/AnnoContext.xml");
//        PersonService personService = (PersonService) factory.getBean("personService");
//        personService.call();
//    }
//
//    @Test
//    public void testAOP() {
//        ApplicationContext factory = new ClassPathXmlApplicationContext("spring/spring-aop.xml");
//        PersonService personService = (PersonService) factory.getBean("personService");
//        personService.call();
//    }
}
