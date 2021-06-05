package com.cayden.mall.product.controller;

import com.cayden.mall.product.domain.Product;
import com.cayden.mall.product.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("list")
    public Object list(){
        return productService.listProduct();
    }

    @RequestMapping("find")
    public Object findId(@RequestParam("id") int id){
        Product product=productService.findById(id);
        Product p= new Product();
        BeanUtils.copyProperties(product,p);
        p.setName(p.getName()+" from port:"+port);
        return p;
    }
}
