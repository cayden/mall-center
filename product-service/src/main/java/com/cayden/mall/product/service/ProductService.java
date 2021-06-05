package com.cayden.mall.product.service;

import com.cayden.mall.product.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProduct();

    Product findById(int id);
}

