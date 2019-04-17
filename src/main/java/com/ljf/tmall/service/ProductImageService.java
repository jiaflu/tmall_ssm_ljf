package com.ljf.tmall.service;

import com.ljf.tmall.pojo.ProductImage;

import java.util.List;

/**
 * Created by lujiafeng on 2018/8/21.
 */
public interface ProductImageService {
    String type_single = "type_single";
    String type_detail = "type_detail";

    void add(ProductImage pi);
    void delete(int id);
    void update(ProductImage pi);
    ProductImage get(int id);
    List list(int pid, String type);
}
