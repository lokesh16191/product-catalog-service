package com.lokeshji.product_catalog_service.service;

import com.lokeshji.product_catalog_service.entity.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService
{

    Mono<Product> save(Product product);

    Flux<Product> getAllProducts();

}
