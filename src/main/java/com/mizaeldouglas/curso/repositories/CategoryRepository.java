package com.mizaeldouglas.curso.repositories;

import com.mizaeldouglas.curso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
