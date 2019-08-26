package edu.ustc.SpringStart.tmall.service.impl;

import edu.ustc.SpringStart.tmall.mapper.CategoryMapper;
import edu.ustc.SpringStart.tmall.pojo.Category;
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
    public int total() {
        return categoryMapper.total();
    }

    @Override
    public List<Category> list(Page page) {
        return categoryMapper.list(page);
    }
}
