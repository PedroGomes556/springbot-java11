package com.pjappsandgames.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjappsandgames.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
	
}
