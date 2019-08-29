package edu.ustc.SpringStart.tmall.mapper;

import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.util.Page;

import java.util.List;

public interface CategoryMapper {
    int total();

    List<Category> list(Page page);

    int add(Category category);

    int delete(Category category);

    Category query(Category category);

    int update(Category category);

}
