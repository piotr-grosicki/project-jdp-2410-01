package com.kodilla.ecommercee.repository;


import com.kodilla.ecommercee.domain.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface CartItemRepository extends CrudRepository<CartItem, Long> {
    @Override
    List<CartItem> findAll();
    List<CartItem> findCartItemByCartId(Long cartId);
}
