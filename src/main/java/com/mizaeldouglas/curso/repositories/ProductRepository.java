package com.mizaeldouglas.curso.repositories;

import com.mizaeldouglas.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
