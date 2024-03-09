package com.robotdreams.assignment6.repository;

import com.robotdreams.assignment6.entity.OrderProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductRepository extends CrudRepository<OrderProduct, Long> {

}
