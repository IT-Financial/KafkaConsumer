package com.hyp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author zjm
 * @Description: 用一句话描述这个类的作用
 * @Date: 2019-04-02 19:13
 */

@Service("testDao")
public class TestDaoImpl implements ITestDao{

    @Autowired
    private JdbcTemplate template;

    @Override
    public void testInseryt(String name) {
        String sql = "insert into test(name) values('"+name+"')";
        System.out.println("进来了");
        template.execute(sql);
        System.out.println("出去");
    }
}
