package com.example.wathchshopapi.Repository;

import com.example.wathchshopapi.Model.Product.response.ProductResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<ProductResponseDto, Long> {
    ProductResponseDto getById(Long id);

    Page<ProductResponseDto> findAll(Pageable pageable);

}
