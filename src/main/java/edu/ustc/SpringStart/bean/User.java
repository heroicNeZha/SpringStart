package edu.ustc.SpringStart.bean;

public class User {


    private String username;

    public User(String username) {
        this.username = username;
    }

    public User() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void call() {
        System.out.println("IOC入门" + username);
    }
}
