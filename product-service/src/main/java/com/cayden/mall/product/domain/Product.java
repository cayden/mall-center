package com.cayden.mall.product.domain;

import lombok.Data;

import java.io.Serializable;
@Data
public class Product implements Serializable {

    private int id;

    private String name;

    private float price;

    private int store;

    public Product(){}

    public Product(int id,String name,float price,int store){
        this.id=id;
        this.name=name;
        this.price=price;
        this.store=store;
    }


}
