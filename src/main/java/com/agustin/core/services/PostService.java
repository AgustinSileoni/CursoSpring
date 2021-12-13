package com.agustin.core.services;

import java.util.List;

import com.agustin.core.model.Post;

public interface PostService {
	public List<Post> validation(List<Post> posts);
	public void addClass(Class clazz);
}
