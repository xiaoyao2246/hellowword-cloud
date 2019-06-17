package com.xiaojian.cloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 部门实体
 */
//@AllArgsConstructor//生成全参构造函数
@NoArgsConstructor//空参构造函数
@Data//生成set/get方法
@Accessors(chain = true)
public class Dept implements Serializable {

    private static final long serialVersionUID = -1321875525321689155L;

    //主键
    private Long deptno;

    //部门名称
    private String dname;

    //来自哪个数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
