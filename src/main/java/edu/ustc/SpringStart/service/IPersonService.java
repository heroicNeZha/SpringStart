package edu.ustc.SpringStart.service;


import edu.ustc.SpringStart.POJO.Person;

import java.util.List;

public interface IPersonService {
    List<Person> show() throws Exception;

    Person selectPersonByName(String name) throws Exception;
}

