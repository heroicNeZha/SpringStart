package edu.ustc.SpringStart.dao;

public class PersonDao {

    private String pname;

    public void call() {
        System.out.println(pname);
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
