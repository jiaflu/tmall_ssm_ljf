package com.ljf.tmall.service;

import com.ljf.tmall.pojo.Property;

import java.util.List;

/**
 * Created by lujiafeng on 2018/8/19.
 */

public interface PropertyService {
    void add(Property c);

    void delete(int id);

    void update(Property c);

    Property get(int id);

    List list(int cid);
}
