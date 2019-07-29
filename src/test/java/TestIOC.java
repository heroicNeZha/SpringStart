import edu.ustc.SpringStart.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    @Test
    public void testUser() {
        //加载spring配置文件，根据创建对象
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
//        //得到配置创建的对象
//        User user11 = (User) factory.getBean("user");
//        User user12 = (User) factory.getBean("user");
//        System.out.println(user11);
//        System.out.println(user12);
//
//        //得到Factory静态方法创建的对象
//        Bean bean = (Bean)factory.getBean("bean");
//        bean.call();
//
//        //得到Factory实例方法创建的对象
//        Bean2 bean2 = (Bean2)factory.getBean("bean2");
//        bean2.call();
//
//        //注入属性
//        User user2 = (User) factory.getBean("user2");
//        user2.call();
//
//        User user3 = (User) factory.getBean("user3");
//        user3.call();

        UserService userService = (UserService) factory.getBean("userService");
        userService.call();
    }
}
