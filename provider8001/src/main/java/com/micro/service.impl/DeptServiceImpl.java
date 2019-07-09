package com.micro.service.impl;

import com.micro.dao.DeptDao;
import com.micro.entity.Dept;
import com.micro.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    DeptDao deptDao;

    @Override
    public Dept get(Long id) {
        return this.deptDao.findOneDept(id);
    }

    @Override
    public List<Dept> list() {
        return this.deptDao.findAllDept();
    }

    @Override
    public boolean add(Dept dept) {
        return this.deptDao.insertDept(dept);
    }


}
