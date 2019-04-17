package com.ljf.tmall.service;

import com.ljf.tmall.pojo.Category;
import com.ljf.tmall.pojo.Product;

import java.util.List;

/**
 * Created by lujiafeng on 2018/8/20.
 */
public interface ProductService {

    void add(Product product);
    void delete(int id);
    void update(Product product);
    //根据product的id获得该product（包含具体属性）
    Product get(int id);
    //根据Category id 获得该分类下所有的product
    List list(int cid);
    void setFirstProductImage(Product p);


    //为多个分类填充产品集合
    void fill(List<Category> cs);
    void fill(Category c);
    //为多个分类填充推荐产品集合
    void fillByRow(List<Category> cs);

    //增加为产品设置销售量和评价数量的方法
    void setSaleAndReviewNumber(Product p);
    void setSaleAndReviewNumber(List<Product> ps);

    List<Product> search(String keyword);
}
