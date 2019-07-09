package com.micro.dao;

import com.micro.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

      Dept findOneDept(Long id);

      List<Dept> findAllDept();

      boolean insertDept(Dept dept);



}
