package com.micro.service;

import com.micro.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllType(Integer parentId);
}
