package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllCategories();

    CategoryDto getCategoryById(Long id);

    CategoryDto addCategory(CategoryDto CategoryDTO);

    CategoryDto updateCategory(Long id, CategoryDto CategoryDTO);

    void deleteCategory(Long id);
}
