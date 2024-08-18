package com.lokeshji.product_catalog_service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.lokeshji.product_catalog_service.entity.Product;
import com.lokeshji.product_catalog_service.service.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class ProductController
{
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Product> saveProduct(@RequestBody Product product)
    {
        log.info("Saving product {}", product);
        return productService.save(product);
    }

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Product> getAllProducts()
    {
        log.info("Getting all products");
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Mono<Product> getProductById(@PathVariable Long id) {
        log.info("Getting product {}", id);
        return productService.getProductById(id);
    }
}