package com.cayden.mall.order.service.impl;

import com.cayden.mall.order.domain.ProductOrder;
import com.cayden.mall.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.UUID;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ProductOrder save(int userId, int productId) {

        Object obj= restTemplate.getForObject("http://product-service/api/v1/product/find?id="+productId,Object.class);
        System.out.println(obj);
        ProductOrder order=new ProductOrder();
        order.setCreatreTime(new Date());
        order.setUserId(userId);
        order.setTradeNo(UUID.randomUUID().toString());
        return order;
    }
}
