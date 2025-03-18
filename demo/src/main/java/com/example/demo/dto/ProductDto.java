package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class ProductDto {
    private Long id;
    @NotBlank(message = "Product name is req ")
    private String name;
    @NotBlank(message = "Product des is req")
    private String description;
    @Positive(message = "Cannot Be negative")
    private BigDecimal price;
    @PositiveOrZero(message = "Cannot be negative")
    private Integer quantity;
    private List<CommentDTO> comments;
}
