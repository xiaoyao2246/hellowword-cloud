package com.xiaojian.cloud.service;

import com.xiaojian.cloud.bean.Dept;

import java.util.List;

public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
