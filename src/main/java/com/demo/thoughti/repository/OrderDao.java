package com.demo.thoughti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.thoughti.entities.Order;

@Repository
public interface OrderDao extends JpaRepository<Order,Integer> {
		
	
}
