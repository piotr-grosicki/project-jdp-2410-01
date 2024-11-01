package com.kodilla.ecommercee.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class ProductDto {
    private Long id;
    private Long groupId;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
}
