package com.mizaeldouglas.curso.services;

import com.mizaeldouglas.curso.entities.Product;
import com.mizaeldouglas.curso.entities.User;
import com.mizaeldouglas.curso.repositories.ProductRepository;
import com.mizaeldouglas.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll(){
		return  repository.findAll();
	}

	public Product findById(Long id){
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
