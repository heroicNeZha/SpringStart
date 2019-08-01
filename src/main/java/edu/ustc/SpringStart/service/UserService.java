package edu.ustc.SpringStart.service;

import edu.ustc.SpringStart.dao.UserDao;

public class UserService {

    private UserDao userDao;

    public void call() {
        System.out.println("service...");
        userDao.call();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }
}
