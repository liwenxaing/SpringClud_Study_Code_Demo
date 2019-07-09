package com.micro.controller;

import com.micro.entity.Dept;
import com.micro.entity.Product;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptConsumerController {

    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String RIBBON_REST_URL_PREFIX = "http://provider-8001";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/consumer/dept/get/{id}",method= RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return this.restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/ribbon/get/{id}",method= RequestMethod.GET)
    public Dept ribbon(@PathVariable("id") Long id){
        return this.restTemplate.getForObject(RIBBON_REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/getAllType",method= RequestMethod.GET)
    public List<Product> findAllType(Integer parentId){
        return this.restTemplate.getForObject(RIBBON_REST_URL_PREFIX+"/product/getAllType?parentId="+parentId,List.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list",method= RequestMethod.GET)
    public List<Dept> list(){
        return this.restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public boolean get(Dept dept){
        return this.restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    /**
     * 服务发现
     * @param id
     * @return
     */
    @RequestMapping(value = "/consumer/dept/get/service/{id}",method= RequestMethod.GET)
    public Dept get_service(@PathVariable("id") Long id){
        ServiceInstance serviceInstance = loadBalancerClient.choose("provider-8001");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://").append(serviceInstance.getHost()).append(":").append(serviceInstance.getPort()).
                append("/dept/get/"+id);
        return this.restTemplate.getForObject(stringBuilder.toString(),Dept.class);
    }
}
