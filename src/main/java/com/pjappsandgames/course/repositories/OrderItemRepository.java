package com.pjappsandgames.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjappsandgames.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
	
}
