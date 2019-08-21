package edu.ustc.SpringStart.person.mapper;

import edu.ustc.SpringStart.person.POJO.Person;

import java.util.List;
import java.util.Map;

public interface PersonMapper {
    List<Person> queryPersonByName(String name);

    Person queryPersonById(int id);

    List<Person> queryPersonByAge(Map<String,Object> params);

    void addPerson(Person person);

    void updatePersonById(Person person);

    void deletePersonById(int id);

    List<Person> queryAll();
}
