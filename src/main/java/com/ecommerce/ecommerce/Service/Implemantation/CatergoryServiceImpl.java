package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.CategoryDto;
import com.ecommerce.ecommerce.Model.Category;
import com.ecommerce.ecommerce.Model.Product;
import com.ecommerce.ecommerce.Repository.CategoryRepository;
import com.ecommerce.ecommerce.Service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CatergoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CatergoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    //convert from entity to Dto
    private CategoryDto convertToDTO(Category category) {

        CategoryDto dto = new CategoryDto();

        dto.setId(category.getId());
        dto.setName(category.getName());
        dto.setDescription(category.getDescription());

        dto.setProductIds(
                category.getProducts()
                        .stream()
                        .map(Product::getId)
                        .collect(Collectors.toList())
        );

        return dto;
    }

    private Category convertToEntity(CategoryDto dto) {

        Category category = new Category();

        category.setId(dto.getId());
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());

        return category;
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDto getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .map(this::convertToDTO)
                .orElseThrow(()->new RuntimeException("Category not found"));
    }

    @Override
    public CategoryDto addCategory(CategoryDto categoryDto) {
        Category category = convertToEntity(categoryDto);

        Category savedCategory = categoryRepository.save(category);

        return convertToDTO(savedCategory);
    }

    @Override
    public CategoryDto updateCategory(Long id, CategoryDto categoryDto) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());

        Category updatedCategory = categoryRepository.save(category);

        return convertToDTO(updatedCategory);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);

    }
}
