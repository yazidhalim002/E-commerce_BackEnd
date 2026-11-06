package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.CategoryDto;
import com.ecommerce.ecommerce.Service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatergoryServiceImpl implements CategoryService {

    @Override
    public List<CategoryDto> getAllCategories() {
        return List.of();
    }

    @Override
    public CategoryDto getCategoryById(Long id) {
        return null;
    }

    @Override
    public CategoryDto addCategory(CategoryDto CategoryDTO) {
        return null;
    }

    @Override
    public CategoryDto updateCategory(Long id, CategoryDto CategoryDTO) {
        return null;
    }

    @Override
    public void deleteCategory(Long id) {

    }
}
