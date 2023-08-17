package com.project.demo.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.blog.entities.Post;
import com.project.demo.blog.payloads.PostDto;
import com.project.demo.blog.services.PostService;

@RestController
@RequestMapping("/api/")
public class PostController {
	
	@Autowired
	private PostService postService;

	@RequestMapping("/user/{userId}/category/{categoryId}/posts")
	public ResponseEntity<PostDto> createPost(
			@RequestBody PostDto postDto, 
			@PathVariable("userId") int uId, 
			@PathVariable("categoryId") int cId) {
		
		PostDto createPost = this.postService.createPost(postDto, uId, cId);
		
		return new ResponseEntity<PostDto>(createPost, HttpStatus.CREATED);
	}
}
