package com.lokeshji.product_catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class ProductCatalogServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ProductCatalogServiceApplication.class, args);
    }

}
