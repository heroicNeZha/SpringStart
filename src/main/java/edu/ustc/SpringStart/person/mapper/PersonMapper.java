package edu.ustc.SpringStart.person.mapper;

import edu.ustc.SpringStart.person.POJO.Person;

import java.util.List;
import java.util.Map;

public interface PersonMapper {

    List<Person> queryPersonByPerson(Person person);

    void queryPersonByAge(Map<String,Object> params);

    void addPerson(Person person);

    void updatePersonById(Person person);

    void deletePersonById(int id);
}
