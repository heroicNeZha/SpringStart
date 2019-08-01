package edu.ustc.SpringStart.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDao {
    private String[] arrs;
    private List<String> list;
    private Map<String, String> map;
    private Properties properties;

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void callList() {
        call();
        System.out.println(arrs.toString());
        System.out.println(list);
        System.out.println(map);
        System.out.println(properties);
    }

    public void call() {
        System.out.println("dao...");
    }
}
