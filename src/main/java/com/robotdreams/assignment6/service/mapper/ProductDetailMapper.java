package com.robotdreams.assignment6.service.mapper;

import com.robotdreams.assignment6.dto.ProductDetailRequestDto;
import com.robotdreams.assignment6.entity.Product;
import com.robotdreams.assignment6.entity.ProductDetail;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductDetailMapper {
    ProductDetailMapper INSTANCE = Mappers.getMapper(ProductDetailMapper.class);

    ProductDetail mapToProductDetail(ProductDetailRequestDto dto);
}
