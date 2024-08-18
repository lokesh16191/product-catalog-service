package com.lokeshji.product_catalog_service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lokeshji.product_catalog_service.entity.Product;
import com.lokeshji.product_catalog_service.repository.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService
{
    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    private ProductRepository repository;

    @Override
    public Mono<Product> save(Product product)
    {
        log.info("Saving product : {}", product);
        return repository.save(product);
    }

    @Override
    public Flux<Product> getAllProducts()
    {
        log.info("Getting all products");
        return repository.findAll();
    }

    @Override
    public Mono<Product> getProductById(Long id) {
        log.info("Getting product by id : {}", id);
        return repository.findById(id);
    }

}
