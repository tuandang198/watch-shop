package com.example.wathchshopapi.Service;

import com.example.wathchshopapi.Model.Product.response.ProductResponseDto;
import com.example.wathchshopapi.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public ProductResponseDto getProductById(Long id) {
        return Optional.ofNullable(productRepository.getById(id))
                .orElseThrow(()->new RuntimeException("Khong tim thay id."));
    }
}
