package com.hyp.entity;

import java.io.Serializable;

/**
 * @author zjm
 * @Description: 用一句话描述这个类的作用
 * @Date: 2019-04-02 19:13
 */
public class Test implements Serializable {

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
