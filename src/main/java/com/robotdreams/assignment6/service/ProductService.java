package com.robotdreams.assignment6.service;

import com.robotdreams.assignment6.dto.ProductRequestDto;
import com.robotdreams.assignment6.dto.ProductResponseDto;
import com.robotdreams.assignment6.entity.Product;
import com.robotdreams.assignment6.repository.ProductRepository;
import com.robotdreams.assignment6.service.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

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

    public Optional<List<ProductResponseDto>> findAll() {
        var responseDtos = StreamSupport.stream(productRepository.findAll().spliterator(), false)
                .map(mapper::productToProductResponseDto).toList();

        return Optional.of(responseDtos);
    }

    public Product findById(long id) {
        return productRepository.findById(id).get();
    }
}
