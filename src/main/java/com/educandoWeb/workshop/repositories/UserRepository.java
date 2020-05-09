package com.educandoWeb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoWeb.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
