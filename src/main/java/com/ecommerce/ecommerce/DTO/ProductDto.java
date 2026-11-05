package com.ecommerce.ecommerce.DTO;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Data
public class ProductDto {
    @NotBlank
    private String name;

    private String description;

    @NotNull
    @DecimalMin(value = "0.01")
    private BigDecimal price;

    @NotNull
    @PositiveOrZero
    private Integer stockQuantity;

    @NotNull
    private Long categoryId;
}
