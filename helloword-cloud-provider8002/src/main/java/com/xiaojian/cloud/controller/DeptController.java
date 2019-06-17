package com.xiaojian.cloud.controller;


import com.xiaojian.cloud.bean.Dept;
import com.xiaojian.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> serviceList = discoveryClient.getServices();
        System.out.println("ListService:" + serviceList);

        List<ServiceInstance> serList = discoveryClient.getInstances("helloword-cloud-provider");
        for (ServiceInstance element : serList) {
            System.out.println(element.getHost());
            System.out.println(element.getPort());
            System.out.println(element.getServiceId());
            System.out.println(element.getUri());
        }
        return this.discoveryClient;
    }
}
