package com.example.wathchshopapi.Model.Product.response;

import com.example.wathchshopapi.Model.Base.response.BaseWatchShopResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "products")
@Entity
public class ProductResponseDto implements Serializable {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
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
