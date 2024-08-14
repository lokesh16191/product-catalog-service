package com.lokeshji.product_catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@EnableDiscoveryClient
public class ProductCatalogServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ProductCatalogServiceApplication.class, args);
    }

}
