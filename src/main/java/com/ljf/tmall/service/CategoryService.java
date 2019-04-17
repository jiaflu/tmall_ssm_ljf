package com.ljf.tmall.service;

import com.ljf.tmall.pojo.Category;
import com.ljf.tmall.util.Page;

import java.util.List;

/**
 * Created by lujiafeng on 2018/8/15.
 */
public interface CategoryService {
    //int total();

    //List<Category> list(Page page);
    List<Category> list();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);

}
