package com.lsp.dao;

import com.lsp.entity.User;

public interface UserDao {
    User findUserById(int id);
}
