package edu.ustc.SpringStart.person.service;


import edu.ustc.SpringStart.person.POJO.Person;

import java.util.List;

public interface IPersonService {
    List<Person> show() throws Exception;

    Person selectPersonByName(String name) throws Exception;
}

