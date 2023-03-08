package com.example.wathchshopapi.Model.SystemParameter.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddSystemParamRequestDto {
    private String name;
    private String categories;
    private Integer descriptions;
}
