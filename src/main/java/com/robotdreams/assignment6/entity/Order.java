package com.robotdreams.assignment6.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Table(name = "Orders")
@Entity
public class Order extends BaseEntity implements Serializable {

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Set<OrderProduct> orderProducts;


    private String description;

    public Set<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(Set<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
