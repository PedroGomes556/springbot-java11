package com.pjappsandgames.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjappsandgames.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
