package com.ljf.tmall.service.impl;

import com.ljf.tmall.mapper.CategoryMapper;
import com.ljf.tmall.pojo.Category;
import com.ljf.tmall.pojo.CategoryExample;
import com.ljf.tmall.service.CategoryService;
import com.ljf.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lujiafeng on 2018/8/15.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        CategoryExample example = new CategoryExample();
        example.setOrderByClause("id desc");
        //传递一个example对象，这个对象指定按照id倒排序来查询
        return categoryMapper.selectByExample(example);
    }


    @Override
    public void add(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public void delete(int id) {
        categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Category get(int id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
    }
}
