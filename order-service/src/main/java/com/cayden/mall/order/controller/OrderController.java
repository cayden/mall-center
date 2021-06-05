package com.cayden.mall.order.controller;

import com.cayden.mall.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/order/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("save")
    public Object save(@RequestParam("userId") int userId,@RequestParam("productId") int productId){

        return orderService.save(userId,productId);
    }
}
