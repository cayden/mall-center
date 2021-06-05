package com.cayden.mall.order.domain;



import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ProductOrder implements Serializable {
    private int id;

    private String productName;

    private String tradeNo;

    private float price;

    private Date creatreTime;

    private int userId;

    private String userName;


}
