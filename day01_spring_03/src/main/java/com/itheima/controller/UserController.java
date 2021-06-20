package com.itheima.controller;

import com.itheima.service.UserService;

/**
 * 包名:com.itheima.controller
 *
 * @author Leevi
 * 日期2020-08-09  12:05
 * 给对象的属性赋值的方式
 * 1. 有参构造
 * 2. set方法
 *
 * 注入的属性类型:
 * 1. 对象(spring核心容器中的)类型：使用ref="对象的id"
 *
 */
public class UserController{
    private UserService userService;

    public UserController() {
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String getName(){
        return userService.getName();
    }
}
