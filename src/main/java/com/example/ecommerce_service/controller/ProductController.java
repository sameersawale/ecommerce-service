package com.example.ecommerce_service.controller;

import com.example.ecommerce_service.entity.Product;
import com.example.ecommerce_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
