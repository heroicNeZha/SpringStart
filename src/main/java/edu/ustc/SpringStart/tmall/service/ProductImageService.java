package edu.ustc.SpringStart.tmall.service;

import edu.ustc.SpringStart.tmall.pojo.ProductImage;

import java.util.List;

public interface ProductImageService {

    public String type_single = "type_single";
    public String type_detail = "type_detail";

    void add(ProductImage pi);

    void delete(int id);

    void update(ProductImage pi);

    ProductImage get(int id);

    List<ProductImage> list(int pid, String type);
}
