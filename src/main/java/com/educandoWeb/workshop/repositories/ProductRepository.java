package com.educandoWeb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoWeb.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
