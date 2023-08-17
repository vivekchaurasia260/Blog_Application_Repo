package com.project.demo.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.blog.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
