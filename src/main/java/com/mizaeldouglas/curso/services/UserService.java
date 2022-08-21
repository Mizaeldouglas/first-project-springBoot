package com.mizaeldouglas.curso.services;

import com.mizaeldouglas.curso.entities.User;
import com.mizaeldouglas.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll(){
		return  repository.findAll();
	}

	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

	public User insert(User obj) {
		return repository.save(obj);
	}

	public  void delete(long id) {
		repository.deleteById(id);
	}

}
