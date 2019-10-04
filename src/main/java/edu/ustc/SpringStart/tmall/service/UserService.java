package edu.ustc.SpringStart.tmall.service;

import edu.ustc.SpringStart.tmall.pojo.User;

import java.util.List;

public interface UserService {

    void add(User c);

    void delete(int id);

    void update(User c);

    User get(int id);

    List<User> list();

    boolean isExist(String name);

    User get(String name, String password);

}
