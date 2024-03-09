package com.robotdreams.assignment6.repository;

import com.robotdreams.assignment6.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
