package com.example.wathchshopapi.Model.Order.response;

import com.example.wathchshopapi.Model.Base.response.BaseWatchShopResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "ORDER_DETAILS")
@Entity
public class OrderDetailResponseDto extends BaseWatchShopResponse {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "FK_ORDER_STATE")
    private Long fkOrderState;

    @Column(name = "FK_ORDER_ID")
    private Long fkOrderId;

    @Column(name = "FK_PRODUCT_ID")
    private Long fkProductId;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "ORDER_PRICE")
    private Long orderPrice;
}
