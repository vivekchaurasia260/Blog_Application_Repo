package com.project.demo.blog.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.blog.entities.Category;
import com.project.demo.blog.entities.Post;
import com.project.demo.blog.entities.User;
import com.project.demo.blog.exceptions.ResourceNotFoundException;
import com.project.demo.blog.payloads.PostDto;
import com.project.demo.blog.repositories.CategoryRepository;
import com.project.demo.blog.repositories.PostRepository;
import com.project.demo.blog.repositories.UserRepository;
import com.project.demo.blog.services.PostService;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public PostDto createPost(PostDto postDto, int userId, int categoryId) {
		
		User user = this.userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "user id", userId));
		Category category = this.categoryRepository.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category", "category id", categoryId));
		
		Post createdPost = this.modelMapper.map(postDto, Post.class);
		createdPost.setImageName("default.png");
		createdPost.setAddedDate(new Date());
		createdPost.setUser(user);
		createdPost.setCategory(category);
		
		Post newPost = this.postRepository.save(createdPost);
		
		return this.modelMapper.map(newPost, PostDto.class);
	}	

	@Override
	public Post updatePost(PostDto postDto, int postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePost(int postId) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPostById(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getPostsByCategory(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getPostsByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> searchPosts(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
