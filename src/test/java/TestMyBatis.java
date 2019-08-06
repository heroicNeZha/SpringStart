import edu.ustc.SpringStart.dao.Person;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

public class TestMyBatis {
    @Test
    public void testConnection() throws IOException {
        //加载配置文件
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String statement = "edu.ustc.SpringStart.dao.Person.queryPersonById";
        Person person = sqlSession.selectOne(statement,1);
        System.out.println(person);
        sqlSession.close();
    }
}
