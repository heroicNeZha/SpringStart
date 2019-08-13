package edu.ustc.SpringStart.person.service.impl;

import edu.ustc.SpringStart.person.POJO.Person;
import edu.ustc.SpringStart.person.dao.IPersonDao;
import edu.ustc.SpringStart.person.service.IPersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("personService")
public class PersonServiceImpl implements IPersonService {

    @Resource(name = "personDao")
    private IPersonDao personDao;

    @Override
    public List<Person> show() throws Exception {
        return null;
    }

    @Override
    public Person selectPersonByName(String name) throws Exception {
        return personDao.selectPersonByName(name);
    }
}
