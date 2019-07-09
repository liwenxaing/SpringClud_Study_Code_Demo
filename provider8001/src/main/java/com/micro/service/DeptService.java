package com.micro.service;


import com.micro.entity.Dept;

import java.util.List;

public interface DeptService {

    Dept get(Long id);

    List<Dept> list();

    boolean add(Dept dept);
}
