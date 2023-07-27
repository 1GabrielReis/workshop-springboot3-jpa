package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.User;

//não esquece que o jpa é uma interface também  
@Repository // mas não precisa por a extends JpaRepository ja tem 
public interface UserRepository extends JpaRepository<User, Long>{
	/*Essa classe serve para fazer os comando para salvar
	 * os dados da classe user(entities) e fazer outros comandos com 
	 * banco de dados*/

}
