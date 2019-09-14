package edu.ustc.SpringStart.tmall.service;

import edu.ustc.SpringStart.tmall.pojo.Product;
import edu.ustc.SpringStart.tmall.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {

    void init(Product p);

    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);

    List<PropertyValue> list(int pid);
}
