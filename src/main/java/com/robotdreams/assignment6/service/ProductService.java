package com.robotdreams.assignment6.service;

import com.robotdreams.assignment6.dto.ProductRequestDto;
import com.robotdreams.assignment6.entity.Product;
import com.robotdreams.assignment6.repository.ProductRepository;
import com.robotdreams.assignment6.service.mapper.ProductMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository productRepository
            , ProductMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    public boolean create(ProductRequestDto createProductRequestDto) {
        Product product = mapper.mapToProduct(createProductRequestDto);
        return productRepository.save(product).getId() > 0;
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(long id) {
        return productRepository.findById(id).get();
    }
}
