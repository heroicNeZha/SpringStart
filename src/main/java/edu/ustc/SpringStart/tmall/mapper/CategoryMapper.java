package edu.ustc.SpringStart.tmall.mapper;

import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.util.Page;

import java.util.List;

public interface CategoryMapper {
    int total();
    List<Category> list(Page page);
}
