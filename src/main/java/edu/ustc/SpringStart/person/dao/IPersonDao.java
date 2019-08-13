package edu.ustc.SpringStart.person.dao;

import edu.ustc.SpringStart.person.POJO.Person;

public interface IPersonDao {
    Person selectPersonByName(String name) throws Exception;
}
