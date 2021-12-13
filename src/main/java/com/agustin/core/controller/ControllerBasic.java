package com.agustin.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.agustin.core.components.PostComponent;
import com.agustin.core.configuration.Paginas;
import com.agustin.core.model.Post;

import java.util.List;


@Controller
@RequestMapping("/home")
public class ControllerBasic {	
	
	@Autowired
	private PostComponent _postComponent;
	
	@GetMapping(path= {"/",})
	public ModelAndView saludar() {
		ModelAndView modelAndView = new ModelAndView(Paginas.HOME);
		modelAndView.addObject("posts", this._postComponent.getPosts());
		return modelAndView;
	}
	
	@GetMapping(path={"/form"})
	public ModelAndView formulario() {
		ModelAndView modelAndView = new ModelAndView(Paginas.FORMULARIO);
		modelAndView.addObject("posts", this._postComponent.getPosts());
		return modelAndView;
	}
	
	@GetMapping(path= {"/postNew"})
	public ModelAndView getForm() {
		return new ModelAndView("form").addObject("post",new Post());
	}
	
	@PostMapping("/addNewPost")
	public String addNewPost(Post post, Model model) {
		List<Post> posts = this._postComponent.getPosts();
		posts.add(post);
		model.addAttribute("posts",posts);
		return "index";
	}
	
	@GetMapping(path={"/putear"})
	public ModelAndView putear() {
		ModelAndView modelAndView = new ModelAndView(Paginas.PUTEAR);
		modelAndView.addObject("posts", this._postComponent.getPosts());
		return modelAndView;
	}
	
	@GetMapping(path= {"/ekko"})
	public ModelAndView ekko(){
		ModelAndView modelAndView = new ModelAndView(Paginas.INDIVIDUAL);
		return modelAndView;
	}
	
	@GetMapping(path= {"/graves"})
	public ModelAndView graves(){
		ModelAndView modelAndView = new ModelAndView(Paginas.INDIVIDUAL);
		return modelAndView;
	}
	
	@GetMapping(path= {"/post","post/{post}"})
	public ModelAndView getPostIndividual(
			@PathVariable(required=true, name="post") 	int id) {
		ModelAndView modelAndView = new ModelAndView(Paginas.INDIVIDUAL);
		Post post = this._postComponent.getPosts().stream()
												.filter( (p)-> {
													return p.getId()==id;
													}).findFirst().get();

		modelAndView.addObject("posts",post);
		return modelAndView;
	}
}
