package com.ljf.tmall.service;

import com.ljf.tmall.pojo.Review;

import java.util.List;

/**
 * Created by lujiafeng on 2018/8/29.
 */
public interface ReviewService {

    void add(Review c);
    void delete(int id);
    void update(Review c);
    Review get(int id);

    List list(int pid);
    int getCount(int pid);
}
