package com.example.wathchshopapi.Model.SystemParameter.response;

import com.example.wathchshopapi.Model.Base.response.BaseWatchShopResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "system_parameters")
@Entity
public class SystemParamResponseDto extends BaseWatchShopResponse {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CATEGORIES")
    private String categories;

    @Column(name = "DESCRIPTIONS")
    private Integer descriptions;
}
