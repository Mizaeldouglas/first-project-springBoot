package com.mizaeldouglas.curso.repositories;

import com.mizaeldouglas.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
