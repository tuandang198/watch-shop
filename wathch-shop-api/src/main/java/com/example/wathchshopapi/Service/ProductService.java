package com.example.wathchshopapi.Service;

import com.example.wathchshopapi.Mapper.ProductMapper;
import com.example.wathchshopapi.Model.Product.request.AddProductRequestDto;
import com.example.wathchshopapi.Model.Product.request.GetListProductRequestDto;
import com.example.wathchshopapi.Model.Product.response.ListProductResponseDto;
import com.example.wathchshopapi.Model.Product.response.ProductResponseDto;
import com.example.wathchshopapi.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    public ProductResponseDto getProductById(Long id) {
        return Optional.ofNullable(productRepository.getById(id))
                .orElseThrow(() -> new RuntimeException("Khong tim thay id."));
    }

    public ProductResponseDto addProduct(AddProductRequestDto requestDto) {
        ProductResponseDto productResponseDto = productMapper.productRequestToDb(requestDto);
        return productRepository.save(productResponseDto);
    }

    public ListProductResponseDto getListProduct(GetListProductRequestDto requestDto) {
        Pageable pageable = PageRequest.of(requestDto.getPage(), requestDto.getSize());
        ListProductResponseDto listProductResponseDto = new ListProductResponseDto();
        listProductResponseDto.setProductList(productRepository.findAll(pageable));
        return listProductResponseDto;
    }
}
