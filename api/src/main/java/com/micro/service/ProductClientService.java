package com.micro.service;

import com.micro.entity.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("provider-8001")
public interface ProductClientService {

    @RequestMapping(value = "/product/getAllType/{pid}",method= RequestMethod.GET)
    List<Product> findAllType(@PathVariable("pid")Integer parentId);

}
