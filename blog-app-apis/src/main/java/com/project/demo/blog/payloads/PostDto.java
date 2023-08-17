package com.project.demo.blog.payloads;

import java.util.Date;

import com.project.demo.blog.entities.Category;
import com.project.demo.blog.entities.User;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class PostDto {

	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addedDate;
	
	private Category category;
	
	private User user;
}
