package com.educandoWeb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoWeb.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	

}
