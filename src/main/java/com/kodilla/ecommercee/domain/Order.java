package com.kodilla.ecommercee.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID",unique = true, nullable = false, updatable = false)
    private Long id;

    @NotNull
    @Column(name="STATUS")
    private String status;

    @NotNull
    @Column(name="ORDER_DATE")
    private LocalDate orderDate;

    @NotNull
    @OneToOne
    @JoinColumn(name="CART_ID")
    private Cart cart;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name="USER_ID")
    private User user;

    public Order(Cart cart, User user) {
        this.cart = cart;
        this.user = user;
        this.orderDate = LocalDate.now();
        this.status = "CREATED";
    }

    public Order(Cart cart) {
        this.cart = cart;
        this.user = cart.getUser();
        this.orderDate = LocalDate.now();
        this.status = "CREATED";
    }

    public void changeStatus(String status) {
        this.status = status;
    }
}
