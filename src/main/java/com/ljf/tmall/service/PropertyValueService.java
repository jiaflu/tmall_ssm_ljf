package com.ljf.tmall.service;

import com.ljf.tmall.pojo.Product;
import com.ljf.tmall.pojo.ProductImage;
import com.ljf.tmall.pojo.PropertyValue;

import java.util.List;

/**
 * Created by lujiafeng on 2018/8/22.
 */
public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}
