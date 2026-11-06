package com.ecommerce.ecommerce.DTO;

import com.ecommerce.ecommerce.Model.Product;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private Long id;
    @NotBlank
    private String name;
    private String description;
    private List<Long> productIds;
}
