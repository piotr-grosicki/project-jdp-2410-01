package com.kodilla.ecommercee.controller;


import com.kodilla.ecommercee.domain.dto.OrderDto;
import jakarta.persistence.GeneratedValue;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {
    @GetMapping
    public List<OrderDto> getAllOrders(){
        return new ArrayList<>();
    }

    @GetMapping("/{orderId}")
    public OrderDto getOrderById(@PathVariable Long orderId){
        return new OrderDto(1L,"In delivery",2L, LocalDate.of(2024,8,15),12L);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addOder(@RequestBody OrderDto orderDto){
        return ResponseEntity.ok().build();
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateOrder(@RequestBody OrderDto orderDto){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long orderId){
        return ResponseEntity.ok().build();
    }

}
