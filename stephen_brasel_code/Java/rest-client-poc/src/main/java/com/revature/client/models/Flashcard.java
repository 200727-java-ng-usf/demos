package com.revature.client.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Data @NoArgsConstructor
@AllArgsConstructor
public class Flashcard {

	private int id;
	private String question;
	private String answer;
	private Set<Category> categories;

	public void addCategories(Category... categories) {
		if (this.categories == null) this.categories = new HashSet<>();
		this.categories.addAll(Arrays.asList(categories));
	}
}
