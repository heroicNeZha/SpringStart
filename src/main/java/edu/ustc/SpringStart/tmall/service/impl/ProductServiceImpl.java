package edu.ustc.SpringStart.tmall.service.impl;

import edu.ustc.SpringStart.tmall.mapper.CategoryMapper;
import edu.ustc.SpringStart.tmall.mapper.ProductImageMapper;
import edu.ustc.SpringStart.tmall.mapper.ProductMapper;
import edu.ustc.SpringStart.tmall.pojo.*;
import edu.ustc.SpringStart.tmall.service.OrderItemService;
import edu.ustc.SpringStart.tmall.service.ProductImageService;
import edu.ustc.SpringStart.tmall.service.ProductService;
import edu.ustc.SpringStart.tmall.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    OrderItemService orderItemService;
    @Autowired
    ReviewService reviewService;


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

    @Override
    public void fill(List<Category> cs) {
        for (Category c : cs) {
            fill(c);
        }
    }

    @Override
    public void fill(Category c) {
        List<Product> products = list(c.getId());
        c.setProducts(products);
    }

    @Override
    public void fillByRow(List<Category> cs) {
        int productNumberEachRow = 8;
        for (Category c : cs) {
            List<Product> products = c.getProducts();
            List<List<Product>> productsByRow = new ArrayList<>();
            for (int start = 0; start < products.size(); start += productNumberEachRow) {
                int end = start + productNumberEachRow;
                end = Math.min(end, products.size());
                List<Product> productsOfEachRow = products.subList(start, end);
                productsByRow.add(productsOfEachRow);
            }
            c.setProductsByRow(productsByRow);
        }
    }

    @Override
    public void setSaleAndReviewNumber(Product p) {
        p.setSaleCount(orderItemService.getSaleCount(p.getId()));

        p.setReviewCount(reviewService.getCount(p.getId()));
    }

    @Override
    public void setSaleAndReviewNumber(List<Product> ps) {
        for (Product product : ps) {
            setSaleAndReviewNumber(product);
        }
    }
}
