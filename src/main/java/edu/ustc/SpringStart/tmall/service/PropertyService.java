package edu.ustc.SpringStart.tmall.service;

import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.pojo.Property;

import java.util.List;

public interface PropertyService {

    List<Property> list(int cid);

    int add(Property property);

    int delete(Property property);

    Property get(int id);

    int update(Property property);
}
