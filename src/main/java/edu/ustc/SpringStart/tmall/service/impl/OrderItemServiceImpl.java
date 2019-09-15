package edu.ustc.SpringStart.tmall.service.impl;

import edu.ustc.SpringStart.tmall.mapper.OrderItemMapper;
import edu.ustc.SpringStart.tmall.pojo.Order;
import edu.ustc.SpringStart.tmall.pojo.OrderItem;
import edu.ustc.SpringStart.tmall.pojo.OrderItemExample;
import edu.ustc.SpringStart.tmall.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    OrderItemMapper orderItemMapper;

    @Override
    public int add(OrderItem orderItem) {
        return orderItemMapper.insert(orderItem);
    }

    @Override
    public int delete(int id) {
        return orderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(OrderItem orderItem) {
        return orderItemMapper.updateByPrimaryKeySelective(orderItem);
    }

    @Override
    public OrderItem get(int id) {
        return orderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list() {
        return null;
    }

    @Override
    public void fill(List<Order> os) {

    }

    @Override
    public void fill(Order o) {

    }
}
