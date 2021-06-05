package com.cayden.mall.product.service.impl;

import com.cayden.mall.product.domain.Product;
import com.cayden.mall.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<Integer,Product> daoMap=new HashMap<>();

    static{
        Product p1=new Product(1,"iPhoneX",10000,9999);
        Product p2=new Product(2,"洗衣机",3899,9999);
        Product p3=new Product(3,"彩电",10000,9999);
        Product p4=new Product(4,"冰箱",2899,9999);
        Product p5=new Product(5,"空调",1899,9999);

        daoMap.put(p1.getId(),p1);
        daoMap.put(p2.getId(),p2);
        daoMap.put(p3.getId(),p3);
        daoMap.put(p4.getId(),p4);
        daoMap.put(p5.getId(),p5);
    }

    @Override
    public List<Product> listProduct() {
        Collection<Product> product=daoMap.values();
        List<Product> list=new ArrayList<>(product);
        return list;
    }

    @Override
    public Product findById(int id) {
        return daoMap.get(id);
    }
}
