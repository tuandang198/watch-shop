package com.example.wathchshopapi.Model.Product.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetListProductRequestDto {
    private Integer page;
    private Integer size;
}
