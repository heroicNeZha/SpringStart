package edu.ustc.SpringStart.person.dao;

import edu.ustc.SpringStart.person.POJO.Person;

import java.util.List;

public interface IPersonDao {
    Person queryPersonByName(String name) throws Exception;

    Person addPerson(Person person) throws Exception;

    Person updatePersonById(Person person) throws Exception;

    Person deletePersonById(int id) throws Exception;

    List<Person> queryAll() throws Exception;
}
