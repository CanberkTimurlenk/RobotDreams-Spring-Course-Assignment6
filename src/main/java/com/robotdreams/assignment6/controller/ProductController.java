package com.robotdreams.assignment6.controller;


import com.robotdreams.assignment6.dto.ProductRequestDto;
import com.robotdreams.assignment6.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseBody
    public String create(@RequestBody ProductRequestDto productRequestDto) {
        return productService.create(productRequestDto)
                ? "Successfully Created!"
                : "An unexpected error occured!";
    }

    @GetMapping
    public void findAll() {
         var products = productService.findAll();
    }
}