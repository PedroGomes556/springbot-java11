package com.pjappsandgames.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjappsandgames.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	
}
