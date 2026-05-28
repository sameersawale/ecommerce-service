package com.example.ecommerce_service.service;

import com.example.ecommerce_service.entity.Product;
import com.example.ecommerce_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public String addProduct(Product product){
        productRepository.save(product);
        return product.toString();
    }

    public List<Product> getAllProducts(){
        List<Product> products=productRepository.findAll();
        return products;
    }
}
