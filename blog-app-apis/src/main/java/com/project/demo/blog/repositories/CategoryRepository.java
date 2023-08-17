package com.project.demo.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.blog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
