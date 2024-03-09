package com.robotdreams.assignment6.controller;


import com.robotdreams.assignment6.dto.OrderRequestDto;
import com.robotdreams.assignment6.entity.Order;
import com.robotdreams.assignment6.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    @ResponseBody
    public String create(@RequestBody OrderRequestDto orderRequestDto) {
        return orderService.save(orderRequestDto)
                ? "Successfully Created!"
                : "An unexpected error occured!";
    }

    @GetMapping
    public Iterable<Order> findAll() {
       return orderService.findAll();
    }

    @DeleteMapping
    public void delete(@RequestParam long orderId) {
        orderService.delete(orderId);
    }
}
