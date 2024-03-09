package com.robotdreams.assignment6.service.mapper;

import com.robotdreams.assignment6.dto.ProductDetailRequestDto;
import com.robotdreams.assignment6.dto.ProductRequestDto;
import com.robotdreams.assignment6.entity.Product;
import com.robotdreams.assignment6.entity.ProductDetail;
import org.aspectj.lang.annotation.After;
import org.mapstruct.*;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductMapper {

    @Mapping(target = "productDetail", source = "productDetail", qualifiedByName = "mapToProductDetail")
    Product mapToProduct(ProductRequestDto dto);

    @Named("mapToProductDetail")
    default ProductDetail mapToProductDetail(ProductDetailRequestDto dto) {
        return ProductDetailMapper.INSTANCE.mapToProductDetail(dto);
    }

    @AfterMapping
    default void afterMapping(@MappingTarget Product product) {
        var detail = product.getProductDetail();
        detail.setProduct(product);
    }

}
