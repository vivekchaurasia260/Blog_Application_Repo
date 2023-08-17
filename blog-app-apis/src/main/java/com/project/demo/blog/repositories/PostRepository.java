package com.project.demo.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.blog.entities.Category;
import com.project.demo.blog.entities.Post;
import com.project.demo.blog.entities.User;

public interface PostRepository extends JpaRepository<Post, Integer>{

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
}
