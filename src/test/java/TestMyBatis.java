import edu.ustc.SpringStart.person.POJO.Person;
import edu.ustc.SpringStart.person.mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class TestMyBatis {
    @Test
    public void testConnection() throws IOException {
        //加载配置文件
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Person person = new Person();
        person.setName("wyl");
        person.setAge(18);
        person.setSex(false);
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        mapper.addPerson(person);
        System.out.println(mapper.queryAll());
        sqlSession.commit();
        System.out.println(mapper.queryAll());
        sqlSession.close();
    }
}
