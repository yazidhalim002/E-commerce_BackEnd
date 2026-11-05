package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();

    ProductDto getProductById(Long id);

    ProductDto addProduct(ProductDto productDTO);

    ProductDto updateProduct(Long id, ProductDto productDTO);

    void deleteProduct(Long id);
}
