package com.project.demo.blog.services;

import java.util.List;

import com.project.demo.blog.payloads.CategoryDto;

public interface CategoryService {
	
	// create
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	// update
	public CategoryDto updateCategory(CategoryDto categoryDto, int categoryId);
	
	// delete
	public void deleteCategory(int id);
	
	// get by id
	public CategoryDto getCategoryById(int categoryId);
	
	// Get All
	public List<CategoryDto> getCategories();
}
