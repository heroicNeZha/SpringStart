package edu.ustc.SpringStart.tmall.service;

import edu.ustc.SpringStart.tmall.pojo.Order;
import edu.ustc.SpringStart.tmall.pojo.OrderItem;

import java.util.List;

public interface OrderItemService {
    int add(OrderItem orderItem);

    int delete(int id);

    int update(OrderItem orderItem);

    OrderItem get(int id);

    List list();

    void fill(List<Order> os);

    void fill(Order o);
}
