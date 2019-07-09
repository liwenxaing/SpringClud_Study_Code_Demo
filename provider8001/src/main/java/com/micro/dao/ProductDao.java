package com.micro.dao;

import com.micro.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@Mapper
public interface ProductDao {

     List<Product> findAllType(Integer parentId);

}
