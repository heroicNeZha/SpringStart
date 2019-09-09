package edu.ustc.SpringStart.tmall.service.impl;

import edu.ustc.SpringStart.tmall.mapper.ProductMapper;
import edu.ustc.SpringStart.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.PrimitiveIterator;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;


}
