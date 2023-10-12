package com.workshop.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
