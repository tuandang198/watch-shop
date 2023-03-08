package com.example.wathchshopapi.Mapper;

import com.example.wathchshopapi.Model.Product.request.AddProductRequestDto;
import com.example.wathchshopapi.Model.Product.response.ProductResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductResponseDto productRequestToDb(AddProductRequestDto dto);
}
