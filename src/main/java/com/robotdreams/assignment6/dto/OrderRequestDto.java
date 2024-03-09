package com.robotdreams.assignment6.dto;

import java.io.Serializable;

public class OrderRequestDto implements Serializable {
    private Long productId;
    private String description;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
