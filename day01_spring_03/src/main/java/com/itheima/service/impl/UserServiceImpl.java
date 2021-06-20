package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

/**
 * 包名:com.itheima.service.impl
 *
 * @author Leevi
 * 日期2020-08-09  12:05
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    public UserServiceImpl() {
    }
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String getName() {
        return userDao.getName();
    }
}
