package edu.ustc.SpringStart.person.dao.impl;

import edu.ustc.SpringStart.person.POJO.Person;
import edu.ustc.SpringStart.person.dao.IPersonDao;
import edu.ustc.SpringStart.person.mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

public class PersonDaoImpl implements IPersonDao {

    @Override
    public List<Person> queryPerson(Person person) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        PersonMapper personMapper = session.getMapper(PersonMapper.class);
        List<Person> persons = personMapper.queryPersonByPerson(person);
        return persons;
    }

    @Override
    public int addPerson(Person person) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        PersonMapper personMapper = session.getMapper(PersonMapper.class);
        personMapper.addPerson(person);
        session.commit();
        return 1;
    }

    @Override
    public int updatePersonById(Person person) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        PersonMapper personMapper = session.getMapper(PersonMapper.class);
        personMapper.updatePersonById(person);
        session.commit();
        return 1;
    }

    @Override
    public int deletePersonById(int id) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        PersonMapper personMapper = session.getMapper(PersonMapper.class);
        personMapper.deletePersonById(id);
        session.commit();
        return 1;
    }
}
