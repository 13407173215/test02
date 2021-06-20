package com.itheima.test;

import com.itheima.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 包名:com.itheima.test
 *
 * @author Leevi
 * 日期2020-08-09  12:08
 */
public class TestSpring {
    @Test
    public void test01(){
        ApplicationContext act = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //1. 获取UserController对象
        UserController userController = (UserController) act.getBean("userController");
        //2. 调用UserController对象的getName()方法
        String name = userController.getName();
        System.out.println("获取到的name为" + name);
    }
}
