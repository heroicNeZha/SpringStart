package edu.ustc.SpringStart.person.service;


import edu.ustc.SpringStart.person.POJO.Person;

import java.util.List;

public interface IPersonService {
    List<Person> queryAll() throws Exception;

    Person queryPersonByName(String name) throws Exception;
}

