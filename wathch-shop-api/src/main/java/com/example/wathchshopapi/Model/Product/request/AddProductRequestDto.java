package com.example.wathchshopapi.Model.Product.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddProductRequestDto {
    private String name;

    private Integer fkBrand;

    private Integer fkGender;

    private String country;

    private Integer fkColor;

    private String imageLink;

    private Integer quantity;

    private Long price;
}
