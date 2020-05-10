package com.educandoWeb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoWeb.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
