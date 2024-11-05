package com.kodilla.ecommercee.controller;


import com.kodilla.ecommercee.domain.dto.CartDto;
import com.kodilla.ecommercee.domain.dto.CartItemDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/carts")
public class CartController {

    @GetMapping
    public List<CartDto> getCarts(){
        return new ArrayList<>();
    }

    @GetMapping("/{cartId}")
    public CartDto getCart(@PathVariable Long cartId){
        return new CartDto(1L,2L,true,new BigDecimal(20));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addCart(@RequestBody CartDto cartDto){
        return ResponseEntity.ok().build();
    }

    @PutMapping (consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateCart(@RequestBody CartDto cartDto){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{cartId}")
    public ResponseEntity<Void> deleteCart(@PathVariable Long cartId){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{cartId}/items")
    public List<CartItemDto> getCartItems(@PathVariable Long cartId){
        return new ArrayList<>();
    }

    @PostMapping(value = "/{cartId}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addItem(@PathVariable Long cartId, @RequestBody CartItemDto cartItemDto){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/{cartId}/{cartItemId}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long cartId, @PathVariable Long cartItemId){
        return ResponseEntity.ok().build();
    }
    @GetMapping("/{cartId}/createorder")
    public ResponseEntity<Void> createOrder(@PathVariable Long cartId){
        return ResponseEntity.ok().build();
    }
}
