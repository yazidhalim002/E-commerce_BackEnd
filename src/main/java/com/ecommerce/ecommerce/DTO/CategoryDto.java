package com.ecommerce.ecommerce.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private Long id;
    @NotBlank
    private String name;
    private String description;
}
