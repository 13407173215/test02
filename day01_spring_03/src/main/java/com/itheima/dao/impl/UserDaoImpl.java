package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

import java.util.Arrays;
import java.util.Map;

/**
 * 包名:com.itheima.dao.impl
 *
 * @author Leevi
 * 日期2020-08-09  12:05
 */
public class UserDaoImpl implements UserDao{
    private String username;
    private Integer age;

    private String[] stringArray;

    private Map map;

    public void setMap(Map map) {
        this.map = map;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getName() {
        System.out.println("年龄是:" + age);

        System.out.println("数组stringArray:" + Arrays.toString(stringArray));

        System.out.println("map的值为：" + map);
        //模拟调用数据库方法获取name
        return username;
    }
}
