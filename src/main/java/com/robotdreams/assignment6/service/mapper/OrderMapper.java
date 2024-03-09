package com.robotdreams.assignment6.service.mapper;

import com.robotdreams.assignment6.dto.OrderRequestDto;
import com.robotdreams.assignment6.entity.Order;
import com.robotdreams.assignment6.entity.Product;
import org.mapstruct.Context;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrderMapper {
    Order OrderRequestDtoToOrder(OrderRequestDto orderRequestDto);
}
