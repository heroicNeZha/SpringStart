package edu.ustc.SpringStart.tmall.service;

import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.util.Page;

import java.util.List;

public interface CategoryService {
    int total();

    List<Category> list(Page page);

    int add(Category category);

    int delete(Category category);
}
