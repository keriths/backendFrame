package com.krs.backend.dto;

import java.math.BigDecimal;

/**
 * Created by fanshuai on 17/3/31.
 */
public class ProjectVO {
    private Integer id = 1;
    private String name = "aa";
    private BigDecimal price = new BigDecimal("456");

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
