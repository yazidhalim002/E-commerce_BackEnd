package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.ProductDto;
import com.ecommerce.ecommerce.Service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductDto> getAllProducts() {
        return List.of();
    }

    @Override
    public ProductDto getProductById(Long id) {
        return null;
    }

    @Override
    public ProductDto addProduct(ProductDto productDTO) {
        return null;
    }

    @Override
    public ProductDto updateProduct(Long id, ProductDto productDTO) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
