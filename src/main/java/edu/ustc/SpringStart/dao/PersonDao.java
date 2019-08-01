package edu.ustc.SpringStart.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "personDao")
@Scope(value = "prototype")
public class PersonDao {

    public void call() {
        System.out.println("personDao");
    }
}
