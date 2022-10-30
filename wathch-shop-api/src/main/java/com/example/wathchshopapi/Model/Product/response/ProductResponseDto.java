package com.example.wathchshopapi.Model.Product.response;

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

    @Column(name = "FK_BRAND")
    private Integer fkBrand;

    @Column(name = "FK_GENDER")
    private Integer fkGender;

//    @Column(name = "BRAND_TEXT")
//    private Integer brandText;
//
//    @Column(name = "GENDER_TEXT")
//    private Integer genderText;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "FK_COLOR")
    private Integer fkColor;

//    @Column(name = "COLOR_TEXT")
//    private Integer colorText;

    @Column(name = "IMAGE_LINK")
    private String imageLink;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "PRICE")
    private Long price;
}
