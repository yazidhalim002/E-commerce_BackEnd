package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllProducts();

    CategoryDto getProductById(Long id);

    CategoryDto addProduct(CategoryDto CategoryDTO);

    CategoryDto updateProduct(Long id, CategoryDto CategoryDTO);

    void deleteProduct(Long id);
}
