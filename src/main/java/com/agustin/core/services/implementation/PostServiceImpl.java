package com.agustin.core.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agustin.core.model.Post;
import com.agustin.core.services.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Override
	public List<Post> validation(List<Post> posts) {
		for(Post post : posts) {
			if(post.getName()== null) {
				throw new NullPointerException("El titulo es nulo");
			}
		}
		System.out.println("Primer Servicio");
		return posts;
	}
	
	@Override
	public void addClass(Class clazz) {
		System.out.println(clazz.getName());		
	}

	
}
