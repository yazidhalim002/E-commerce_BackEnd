package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.CategoryDto;
import com.ecommerce.ecommerce.Service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatergoryServiceImpl implements CategoryService {
    @Override
    public List<CategoryDto> getAllProducts() {
        return List.of();
    }

    @Override
    public CategoryDto getProductById(Long id) {
        return null;
    }

    @Override
    public CategoryDto addProduct(CategoryDto CategoryDTO) {
        return null;
    }

    @Override
    public CategoryDto updateProduct(Long id, CategoryDto CategoryDTO) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
