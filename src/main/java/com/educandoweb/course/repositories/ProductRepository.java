package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Product;

//não esquece que o jpa é uma interface também 
@Repository // mas não precisa por a extends JpaRepository ja tem 
public interface ProductRepository extends JpaRepository<Product, Long> {
	/*Essa classe serve para fazer os comando para salvar
	 * os dados da classe Product(entities) e fazer outros comandos com 
	 * banco de dados*/

}
