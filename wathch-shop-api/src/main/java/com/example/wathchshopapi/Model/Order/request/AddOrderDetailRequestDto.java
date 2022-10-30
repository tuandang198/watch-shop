package com.example.wathchshopapi.Model.Order.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Getter;

@Getter
public class AddOrderDetailRequestDto {
    @JsonIgnore
    private Long fkOrderId;

    @NotNull
    private Long fkProductId;

    private Integer quantity;

    @NotNull
    private Long price;
}
