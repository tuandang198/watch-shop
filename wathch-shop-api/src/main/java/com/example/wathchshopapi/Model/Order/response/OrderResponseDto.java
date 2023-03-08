package com.example.wathchshopapi.Model.Order.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "ORDERS")
@Entity
public class OrderResponseDto {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DESCRIPTIONS")
    private String descriptions;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "TOTAL_PRICE")
    private Long totalPrice;

    @Transient
    private List<OrderDetailResponseDto> orderDetailResponseDtos;
}
