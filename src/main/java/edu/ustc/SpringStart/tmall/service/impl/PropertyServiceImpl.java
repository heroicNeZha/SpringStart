package edu.ustc.SpringStart.tmall.service.impl;

import edu.ustc.SpringStart.tmall.mapper.CategoryMapper;
import edu.ustc.SpringStart.tmall.mapper.PropertyMapper;
import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.pojo.Property;
import edu.ustc.SpringStart.tmall.pojo.PropertyExample;
import edu.ustc.SpringStart.tmall.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    PropertyMapper propertyMapper;

    @Override
    public List<Property> list(int cid) {
        PropertyExample example = new PropertyExample();
        PropertyExample.Criteria criteria = example.createCriteria();
        criteria.andCidEqualTo(cid);
        return propertyMapper.selectByExample(example);
    }

    @Override
    public int add(Property property) {
        return propertyMapper.insert(property);
    }

    @Override
    public int delete(Property property) {
        return 0;
    }

    @Override
    public Property query(Property property) {
        return null;
    }

    @Override
    public int update(Property property) {
        return 0;
    }
}
