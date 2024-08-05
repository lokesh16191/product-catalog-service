package com.lokeshji.product_catalog_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lokeshji.product_catalog_service.entity.Product;
import com.lokeshji.product_catalog_service.repository.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductRepository repository;

    @Override
    public Mono<Product> save(Product product)
    {
        return repository.save(product);
    }

    @Override
    public Flux<Product> getAllProducts()
    {
        return repository.findAll();
    }

}
