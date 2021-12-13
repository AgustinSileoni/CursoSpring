package com.agustin.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.agustin.core.components.PostComponent;
import com.agustin.core.model.Conexion;
import com.agustin.core.services.PostService;

@SpringBootApplication
public class CursoSpringApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier("beanConexion")
	private Conexion conexion = new Conexion();
	
	@Autowired
	@Qualifier("com.agustin.core.components.PostComponent")
	public PostComponent postComponent;

	public PostService postService;

	@Autowired
	@Qualifier("serviceDecorado")
	public void setPostService(PostService postService) {
		this.postService = postService;
		this.postService.addClass(CursoSpringApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CursoSpringApplication.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception{
		postService.validation(postComponent.getPosts())
		.forEach((post)-> {
			System.out.println(post.getName());
		});
	}

}
