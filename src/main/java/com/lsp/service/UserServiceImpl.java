package com.lsp.service;

import com.lsp.dao.UserDao;
import com.lsp.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User findUserByid(int tid) {
        return userDao.findUserById(tid);
    }
}
