package com.project.demo.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {

	private int categoryId;
	
	@NotBlank
	@Size(min=4, message="Min size of title is 4")
	private String categoryTitle;
	
	@NotBlank
	@Size(min=10)
	private String categoryDescription;
	
}
