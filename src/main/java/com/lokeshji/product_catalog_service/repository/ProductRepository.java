package com.lokeshji.product_catalog_service.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.lokeshji.product_catalog_service.entity.Product;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Long>
{
}
