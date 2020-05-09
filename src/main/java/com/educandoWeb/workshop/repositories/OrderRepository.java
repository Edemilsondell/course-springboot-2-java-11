package com.educandoWeb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoWeb.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
