package com.ljf.tmall.service;

import com.ljf.tmall.pojo.Order;
import com.ljf.tmall.pojo.OrderItem;

import java.util.List;

/**
 * Created by lujiafeng on 2018/8/23.
 */
public interface OrderItemService {
    void add(OrderItem c);
    void delete(int id);
    void update(OrderItem c);
    OrderItem get(int id);
    List list();

    void fill(List<Order> os);

    void fill(Order o);

    //增加根据产品获取销售量的方法
    int getSaleCount(int pid);

    List<OrderItem> listByUser(int uid);
}
