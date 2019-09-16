package edu.ustc.SpringStart.tmall.service.impl;

import edu.ustc.SpringStart.tmall.mapper.OrderItemMapper;
import edu.ustc.SpringStart.tmall.pojo.Order;
import edu.ustc.SpringStart.tmall.pojo.OrderItem;
import edu.ustc.SpringStart.tmall.pojo.OrderItemExample;
import edu.ustc.SpringStart.tmall.pojo.Product;
import edu.ustc.SpringStart.tmall.service.OrderItemService;
import edu.ustc.SpringStart.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    OrderItemMapper orderItemMapper;
    @Autowired
    ProductService productService;

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
        OrderItemExample example = new OrderItemExample();
        example.setOrderByClause("id desc");
        return orderItemMapper.selectByExample(example);
    }

    @Override
    public void fill(List<Order> orders) {
        for (Order order : orders) {
            fill(order);
        }
    }

    @Override
    public void fill(Order order) {
        OrderItemExample example = new OrderItemExample();
        example.createCriteria().andOidEqualTo(order.getId());
        List<OrderItem> orderItems = orderItemMapper.selectByExample(example);
        setProduct(orderItems);

        float total = 0;
        int totalNumber = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getNumber() * orderItem.getProduct().getPromotePrice();
            totalNumber += orderItem.getNumber();
        }
        order.setTotal(total);
        order.setTotalNumber(totalNumber);

        order.setOrderItems(orderItems);
    }

    public void setProduct(List<OrderItem> orderItems) {
        for (OrderItem orderItem : orderItems) {
            setProduct(orderItem);
        }
    }

    private void setProduct(OrderItem orderItem) {
        orderItem.setProduct(productService.get(orderItem.getPid()));
    }
}
