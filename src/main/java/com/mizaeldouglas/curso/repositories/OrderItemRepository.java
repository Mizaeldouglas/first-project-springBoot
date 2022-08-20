package com.mizaeldouglas.curso.repositories;

import com.mizaeldouglas.curso.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
