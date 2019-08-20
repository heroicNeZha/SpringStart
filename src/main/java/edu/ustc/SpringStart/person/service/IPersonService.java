package edu.ustc.SpringStart.person.service;


import edu.ustc.SpringStart.person.POJO.Person;

import java.util.List;

public interface IPersonService {
    List<Person> queryAll() throws Exception;

    List<Person> queryPersonByName(String name) throws Exception;

    Person queryPersonById(int id) throws Exception;

    int addPerson(Person person) throws Exception;

    int updatePersonById(Person person) throws Exception;

    int deletePersonById(int id) throws Exception;
}

