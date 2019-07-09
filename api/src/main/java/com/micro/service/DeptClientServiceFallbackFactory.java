package com.micro.service;

import com.micro.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            @Override
            public Dept get(Long id) {
                return new Dept().setD_name("服务已经关闭");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
