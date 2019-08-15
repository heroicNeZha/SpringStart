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
    public List<Person> queryAll() throws Exception {
        return personDao.queryAll();
    }

    @Override
    public Person queryPersonByName(String name) throws Exception {
        return personDao.queryPersonByName(name);
    }
}
