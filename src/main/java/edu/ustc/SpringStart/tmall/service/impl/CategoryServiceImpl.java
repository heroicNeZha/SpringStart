package edu.ustc.SpringStart.tmall.service.impl;

import edu.ustc.SpringStart.tmall.mapper.CategoryMapper;
import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.pojo.CategoryExample;
import edu.ustc.SpringStart.tmall.service.CategoryService;
import edu.ustc.SpringStart.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        CategoryExample example = new CategoryExample();
        example.setOrderByClause("id desc");
        return categoryMapper.selectByExample(example);
    }

    @Override
    public int add(Category category) {
        return categoryMapper.insertSelective(category);
    }

    @Override
    public int delete(Category category) {
        return categoryMapper.deleteByPrimaryKey(category.getId());
    }

    @Override
    public Category query(Category category) {
        CategoryExample example = new CategoryExample();

        return categoryMapper.selectByExample(example).get(0);
    }

    @Override
    public int update(Category category) {
        return categoryMapper.updateByPrimaryKeySelective(category);
    }


}
