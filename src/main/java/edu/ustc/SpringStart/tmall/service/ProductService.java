package edu.ustc.SpringStart.tmall.service;

import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.pojo.Product;

import java.util.List;

public interface ProductService {
    Product get(int id);

    List<Product> list(int cid);

    int add(Product product);

    int delete(Product product);

    int update(Product product);

    //前台展示
    void fill(List<Category> cs);

    void fill(Category c);

    void fillByRow(List<Category> cs);

    void setSaleAndReviewNumber(Product p);

    void setSaleAndReviewNumber(List<Product> ps);

}
