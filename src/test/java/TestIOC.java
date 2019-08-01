import edu.ustc.SpringStart.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    @Test
    public void testUser() {
        //加载spring配置文件，根据创建对象
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserService userService = (UserService) factory.getBean("userService");
        userService.call();
    }
}
