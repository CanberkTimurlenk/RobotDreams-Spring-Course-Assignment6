package com.robotdreams.assignment6.repository;


import com.robotdreams.assignment6.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}