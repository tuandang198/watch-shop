package com.example.wathchshopapi.Model.Product.response;

import com.example.wathchshopapi.Model.Base.response.BasePageableResponseDto;
import lombok.Data;
import org.springframework.data.domain.Page;

@Data
public class ListProductResponseDto extends BasePageableResponseDto {
    Page<ProductResponseDto> productList;
}
