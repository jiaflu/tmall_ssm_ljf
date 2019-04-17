package com.ljf.tmall.service;

import com.ljf.tmall.pojo.Order;
import com.ljf.tmall.pojo.OrderItem;
import org.aspectj.weaver.ast.Or;

import java.util.List;

/**
 * Created by lujiafeng on 2018/8/23.
 */
public interface OrderService {
    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);

    float add(Order c, List<OrderItem> ois);

    void delete(int id);
    void update(Order c);
    Order get(int id);
    List list();

    List list(int uid, String excludedStatus);

}
