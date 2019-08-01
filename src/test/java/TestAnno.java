import edu.ustc.SpringStart.dao.UserDao;
import edu.ustc.SpringStart.service.PersonService;
import edu.ustc.SpringStart.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
    @Test
    public void Test() {
        //通过注解方式创建对象
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring/AnnoContext.xml");
        PersonService personService = (PersonService) factory.getBean("personService");
        personService.call();
    }
}
