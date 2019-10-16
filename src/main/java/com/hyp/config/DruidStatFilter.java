package com.hyp.config;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import com.alibaba.druid.support.http.WebStatFilter;

/**
 * @author zjm
 * @Description: 用一句话描述这个类的作用
 * @Date: 2019-04-02 18:18
 */

@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
        initParams={
        @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*") })
public class DruidStatFilter extends WebStatFilter{
}
