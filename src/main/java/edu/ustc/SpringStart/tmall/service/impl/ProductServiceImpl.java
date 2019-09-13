package edu.ustc.SpringStart.tmall.service.impl;

import edu.ustc.SpringStart.tmall.mapper.CategoryMapper;
import edu.ustc.SpringStart.tmall.mapper.ProductImageMapper;
import edu.ustc.SpringStart.tmall.mapper.ProductMapper;
import edu.ustc.SpringStart.tmall.pojo.Category;
import edu.ustc.SpringStart.tmall.pojo.Product;
import edu.ustc.SpringStart.tmall.pojo.ProductExample;
import edu.ustc.SpringStart.tmall.pojo.ProductImage;
import edu.ustc.SpringStart.tmall.service.ProductImageService;
import edu.ustc.SpringStart.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.PrimitiveIterator;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;
    @Autowired
    CategoryMapper categoryMappers;
    @Autowired
    ProductImageService productImageService;


    @Override
    public Product get(int id) {
        Product p = productMapper.selectByPrimaryKey(id);
        setCategory(p);
        setFirstProductImage(p);
        return p;
    }

    public void setCategory(Product p) {
        int cid = p.getCid();
        Category c = categoryMappers.selectByPrimaryKey(cid);
        p.setCategory(c);
    }

    public void setCategory(List<Product> ps) {
        for (Product p : ps)
            setCategory(p);
    }

    public void setFirstProductImage(Product p) {
        List<ProductImage> productImages = productImageService.list(p.getId(), ProductImageService.type_single);
        if (!productImages.isEmpty()) {
            p.setFirstProductImage(productImages.get(0));
        }
    }

    public void setFirstProductImage(List<Product> ps) {
        for (Product p : ps) {
            setFirstProductImage(p);
        }
    }


    @Override
    public List<Product> list(int cid) {
        ProductExample example = new ProductExample();
        example.createCriteria().andCidEqualTo(cid);
        example.setOrderByClause("id desc");
        List<Product> products = productMapper.selectByExample(example);
        setCategory(products);
        setFirstProductImage(products);
        return products;
    }

    @Override
    public int add(Product product) {
        return productMapper.insertSelective(product);
    }

    @Override
    public int delete(Product product) {
        return productMapper.deleteByPrimaryKey(product.getId());
    }

    @Override
    public int update(Product product) {
        return productMapper.updateByPrimaryKeySelective(product);
    }
}
