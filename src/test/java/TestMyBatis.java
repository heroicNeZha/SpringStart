import edu.ustc.SpringStart.person.POJO.Person;
import edu.ustc.SpringStart.person.mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMyBatis {
    @Test
    public void testConnection() throws IOException {
        //加载配置文件
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        Person person = new Person();
//        person.setName("wyl");
//        person.setAge(18);
//        person.setSex(false);
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("start_age", 1);
        map.put("end_age", 20);
        mapper.queryPersonByAge(map);
        System.out.println(map.get("p_count"));
//        mapper.addPerson(person);
//        System.out.println(mapper.queryAll());
//        sqlSession.commit();
//        System.out.println(mapper.queryAll());
        sqlSession.close();
    }

    @Test
    public void testDynamicSQL() throws IOException {
        //加载配置文件
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Person person = new Person();
        person.setName("lzw");
        person.setSex(true);
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        List<Person> persons = mapper.queryPersonByPerson(person);
        System.out.println(persons);
        sqlSession.close();
    }
}
