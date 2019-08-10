package edu.ustc.SpringStart.service.impl;

import edu.ustc.SpringStart.POJO.Person;
import edu.ustc.SpringStart.dao.IPersonDao;
import edu.ustc.SpringStart.dao.impl.PersonDaoImpl;
import edu.ustc.SpringStart.service.IPersonService;
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
