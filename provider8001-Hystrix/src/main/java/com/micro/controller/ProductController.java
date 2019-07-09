package com.micro.controller;

import com.micro.entity.Product;
import com.micro.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

            @Autowired
            private ProductService productService;

            @RequestMapping(value = "/product/getAllType/{pid}")
            @HystrixCommand(fallbackMethod = "handler")
            public List<Product> findAllType(@PathVariable("pid") Integer parentId){
                 if (parentId > 5){
                     throw new  RuntimeException();
                 }
                return this.productService.findAllType(parentId);
            }

            public List<Product>  handler(@PathVariable("pid")Integer parentId){
                return Arrays.asList(new Product().setId(parentId).setName("出错误了"));
            }
}
