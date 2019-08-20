package edu.ustc.SpringStart.person.dao;

import edu.ustc.SpringStart.person.POJO.Person;

import java.util.List;

public interface IPersonDao {
    Person queryPersonById(int id) throws Exception;

    List<Person> queryPersonByName(String name) throws Exception;

    int addPerson(Person person) throws Exception;

    int updatePersonById(Person person) throws Exception;

    int deletePersonById(int id) throws Exception;

    List<Person> queryAll() throws Exception;
}
