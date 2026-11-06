package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.ProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductDto> getAllProducts();

    Optional<ProductDto> getProductById(Long id);

    ProductDto addProduct(ProductDto productDTO);

    ProductDto updateProduct(Long id, ProductDto productDTO);

    void deleteProduct(Long id);
}
