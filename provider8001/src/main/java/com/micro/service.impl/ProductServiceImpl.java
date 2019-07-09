package com.micro.service.impl;

import com.micro.dao.ProductDao;
import com.micro.entity.Product;
import com.micro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService {

    @Resource
    ProductDao productDao;

    @Override
    public List<Product> findAllType(Integer parentId) {
        return this.productDao.findAllType(parentId);
    }
}
