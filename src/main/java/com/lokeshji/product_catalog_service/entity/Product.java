package com.lokeshji.product_catalog_service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product
{
    @Id
    private Long id;
    private String name;
    private String description;
    private Long price;
    private Integer quantity;
    private String url;
}
