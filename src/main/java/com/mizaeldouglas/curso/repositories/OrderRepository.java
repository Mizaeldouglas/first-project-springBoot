package com.mizaeldouglas.curso.repositories;

import com.mizaeldouglas.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
