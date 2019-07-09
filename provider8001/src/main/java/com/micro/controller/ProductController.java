package com.micro.controller;

import com.micro.entity.Product;
import com.micro.service.ProductService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

            @Autowired
            private ProductService productService;

            @RequestMapping(value = "/getAllType",method = RequestMethod.GET)
            public List<Product> findAllType(Integer parentId){
                   return this.productService.findAllType(parentId);
            }
}
