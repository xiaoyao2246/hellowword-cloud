package com.xiaojian.cloud.service;

import com.xiaojian.cloud.bean.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 部门客户端(基于Feign)
 */
@FeignClient(value = "HELLOWORD-CLOUD-PROVIDER")
public interface DeptClient {

    /**
     * 获取部门信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

}
