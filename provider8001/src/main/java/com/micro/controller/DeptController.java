package com.micro.controller;

import com.micro.entity.Dept;
import com.micro.service.DeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {

        @Resource
        DeptService deptService;

        @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
        public Dept get(@PathVariable("id") Long id){
            return this.deptService.get(id);
        }

        @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
        public List<Dept> list(){
            return this.deptService.list();
        }

        @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
        public boolean add(@RequestBody Dept dept){
            return this.deptService.add(dept);
        }
}
