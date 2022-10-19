package com.example.wathchshopapi.Model.Product.response;

import com.example.wathchshopapi.Model.Base.response.BaseWatchShopResponse;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
public class ProductResponseDto extends BaseWatchShopResponse {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private Integer fkBrand;

    @Column
    private Integer fkGender;

    @Column
    private String country;

    @Column
    private Integer fkColor;

    @Column
    private String imageLink;

    @Column
    private Integer quantity;

    @Column
    private Long price;
}
