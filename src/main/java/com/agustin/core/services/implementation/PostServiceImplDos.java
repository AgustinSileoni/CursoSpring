package com.agustin.core.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agustin.core.model.Post;
import com.agustin.core.services.PostService;

@Service
public class PostServiceImplDos implements PostService {

	@Override
	public List<Post> validation(List<Post> posts) {
		for(Post post : posts) {
			if(post.getId()== 0) {
				throw new NullPointerException("El id es 0");
			}
		}
		System.out.println("Segundo Servicio");
		return posts;
	}

	@Override
	public void addClass(Class clazz) {
		System.out.println(clazz.getName());		
	}
	
	
}
