package edu.ustc.SpringStart.dao.impl;

import edu.ustc.SpringStart.POJO.Person;
import edu.ustc.SpringStart.dao.IPersonDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class PersonDaoImpl implements IPersonDao {
    @Override
    public Person selectPersonByName(String name) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        String statement = "mapper.personMapper.selectPersonByName";
        Person person = session.selectOne(statement,name);
        return person;
    }
}
