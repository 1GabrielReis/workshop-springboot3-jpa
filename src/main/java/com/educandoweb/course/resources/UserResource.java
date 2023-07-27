package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController
@RequestMapping(value = "/users")// nome da pagina localhost:8080/user
public class UserResource {
	/*classe Resource serve para fazer conexão
	 * entre a class entidade(user) com a web*/
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> finnAll(){
		List<User> list= service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj= service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
