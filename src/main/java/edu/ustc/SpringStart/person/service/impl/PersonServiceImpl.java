package edu.ustc.SpringStart.person.service.impl;

import edu.ustc.SpringStart.person.POJO.Person;
import edu.ustc.SpringStart.person.dao.IPersonDao;
import edu.ustc.SpringStart.person.service.IPersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "personService")
public class PersonServiceImpl implements IPersonService {

    @Resource(name = "personDao")
    private IPersonDao personDao;

    @Override
    public List<Person> queryPerson(Person person) throws Exception {
        return personDao.queryPerson(person);
    }

    @Override
    public int addPerson(Person person) throws Exception {
        return personDao.addPerson(person);
    }

    @Override
    public int updatePersonById(Person person) throws Exception {
        return personDao.updatePersonById(person);
    }

    @Override
    public int deletePersonById(int id) throws Exception {
        return personDao.deletePersonById(id);
    }
}
