package com.robotdreams.assignment6.service.mapper;

import com.robotdreams.assignment6.dto.OrderRequestDto;
import com.robotdreams.assignment6.entity.Order;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import com.robotdreams.assignment6.dto.OrderResponseDto;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrderMapper {
    Order OrderRequestDtoToOrder(OrderRequestDto orderRequestDto);

    OrderResponseDto orderToOrderResponseDto(Order order);
}
