package edu.ustc.SpringStart.tmall.service;

import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.util.Page;

import java.util.List;

public interface CategoryService {

    List<Category> list();

    int add(Category category);

    int delete(Category category);

    Category get(int id);

    int update(Category category);
}
