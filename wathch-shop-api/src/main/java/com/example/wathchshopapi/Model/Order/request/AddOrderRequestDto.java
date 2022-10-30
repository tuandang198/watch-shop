package com.example.wathchshopapi.Model.Order.request;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AddOrderRequestDto {
    @NotNull
    private String customerName;

    @NotNull
    private String address;

    private String descriptions;

    @NotNull
    private String phone;

    private List<AddOrderDetailRequestDto> orderDetailRequestDtos;
}
