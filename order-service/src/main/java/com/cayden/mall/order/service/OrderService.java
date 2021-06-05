package com.cayden.mall.order.service;

import com.cayden.mall.order.domain.ProductOrder;

public interface OrderService {

    ProductOrder save(int userId,int productId);

}
