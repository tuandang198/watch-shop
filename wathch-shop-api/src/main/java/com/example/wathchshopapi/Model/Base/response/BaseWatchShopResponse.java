package com.example.wathchshopapi.Model.Base.response;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table
public class BaseWatchShopResponse {
    @Column
    private String createdUser;

    @Column
    private Date createdTime;

    @Column
    private String updatedUser;

    @Column
    private Date updatedTime;

    @Column
    private Integer isDeleted;
}
