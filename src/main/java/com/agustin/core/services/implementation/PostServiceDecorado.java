package com.agustin.core.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agustin.core.model.Post;
import com.agustin.core.services.PostService;

@Service("serviceDecorado")
public class PostServiceDecorado implements PostService{

	@Autowired
	private PostServiceImpl postServiceImpl;
	
	@Autowired
	private PostServiceImplDos postServiceImplDos;
	
	@Override
	public List<Post> validation(List<Post> posts) {
		posts = postServiceImpl.validation(posts);
		posts = postServiceImplDos.validation(posts);
		
		for(Post post:posts) {
			if(post.getDescription() == null) {
				throw new NullPointerException("La descripcion es nula");
			}
			if(post.getFecha() == null) {
				throw new NullPointerException("La fecha es nula");
			}
		}
		System.out.println("Esta es la clase decorada");
		
		return posts;
	}

	@Override
	public void addClass(Class clazz) {
		System.out.println(clazz.getName());		
	}

	
}
