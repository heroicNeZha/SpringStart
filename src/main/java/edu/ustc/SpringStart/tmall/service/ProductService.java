package edu.ustc.SpringStart.tmall.service;

import edu.ustc.SpringStart.tmall.pojo.Product;

import java.util.List;

public interface ProductService {
    Product query(Product product);

    List<Product> list(int cid);

    int add(Product product);

    int delete(Product product);

    int update(Product product);

}
