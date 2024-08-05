package com.lokeshji.product_catalog_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lokeshji.product_catalog_service.entity.Product;
import com.lokeshji.product_catalog_service.service.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class ProductController
{

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Product> saveProduct(@RequestBody Product product)
    {
        return productService.save(product);
    }

    @PostMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

}