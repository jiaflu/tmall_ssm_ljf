package com.ljf.tmall.service;

import com.ljf.tmall.pojo.User;

import java.util.List;

/**
 * Created by lujiafeng on 2018/8/22.
 */
public interface UserService {
    void add(User c);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();

    boolean isExist(String name);

    User get(String name, String password);
}
