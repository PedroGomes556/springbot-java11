package com.pjappsandgames.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjappsandgames.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
