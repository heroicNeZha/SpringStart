package edu.ustc.SpringStart.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.ustc.SpringStart.tmall.pojo.Order;
import edu.ustc.SpringStart.tmall.service.OrderItemService;
import edu.ustc.SpringStart.tmall.service.OrderService;
import edu.ustc.SpringStart.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/tmall")
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderItemService orderItemService;

    @RequestMapping("/admin_order_list")
    public String list(Model model, Page page) {
        PageHelper.offsetPage(page.getStart(), 5);
        List<Order> orderList = orderService.list();
        page.setTotal((int) new PageInfo<>(orderList).getTotal());

        orderItemService.fill(orderList);
        
        model.addAttribute("orderList", orderList);
        model.addAttribute("page", page);
        return "admin/listOrder";
    }

    @RequestMapping("admin_order_delivery")
    public String delivery(Order order) throws IOException {
        order.setDelivery_date(new Date());
        order.setStatus(OrderService.waitConfirm);
        orderService.update(order);
        return "redirect:admin_order_list";
    }

}
