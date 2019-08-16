package edu.ustc.SpringStart.person.dao.impl;

import edu.ustc.SpringStart.person.POJO.Person;
import edu.ustc.SpringStart.person.dao.IPersonDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

public class PersonDaoImpl implements IPersonDao {
    @Override
    public Person queryPersonById(int id) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        String statement = "mapper.personMapper.queryPersonById";
        Person person = session.selectOne(statement, id);
        return person;
    }

    @Override
    public Person queryPersonByName(String name) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        String statement = "mapper.personMapper.queryPersonByName";
        Person person = session.selectOne(statement, name);
        return person;
    }

    @Override
    public int addPerson(Person person) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        String statement = "mapper.personMapper.addPerson";
        int val = session.insert(statement, person);
        session.commit();
        return val;
    }

    @Override
    public int updatePersonById(Person person) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        String statement = "mapper.personMapper.updatePersonById";
        int val = session.update(statement, person);
        session.commit();
        return val;
    }

    @Override
    public int deletePersonById(int id) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        String statement = "mapper.personMapper.deletePersonById";
        int val = session.delete(statement, id);
        session.commit();
        return val;
    }

    @Override
    public List<Person> queryAll() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        String statement = "mapper.personMapper.queryAll";
        List<Person> persons = session.selectList(statement);
        return persons;
    }
}
