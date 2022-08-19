package com.mizaeldouglas.curso.services;

import com.mizaeldouglas.curso.entities.Order;
import com.mizaeldouglas.curso.entities.User;
import com.mizaeldouglas.curso.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll(){
		return  repository.findAll();
	}

	public Order findById(Long id){
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
