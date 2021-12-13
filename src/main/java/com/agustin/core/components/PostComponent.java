package com.agustin.core.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.agustin.core.model.ImagesAssignament;
import com.agustin.core.model.Post;

@Component("com.agustin.core.components.PostComponent")
public class PostComponent {
	
	private ImagesAssignament images = new ImagesAssignament();
	
	public List<Post> getPosts(){
		ArrayList<Post> post = new ArrayList<>();
		
		post.add(new Post(1,"Goalkeeper",
				"https://api.sofascore.app/api/v1/player/158263/image",
				new Date(),"Emiliano","Martinez"));
		post.add(new Post(2,"Defender",
				"https://api.sofascore.app/api/v1/player/833956/image",
				new Date(),"Matty","Cash"));		
		post.add(new Post(3,"Algo ha despertado en Runaterra. Algo ancestral. Algo terrible. ",
				"https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Fiddlesticks_0.jpg",
				new Date(),"Fiddlesticks","fiddlesticks"));
		post.add(new Post(4,"Xin Zhao es un guerreo decidido y valiente, leal a la dinastía Escudo de Luz.",
				"https://ddragon.leagueoflegends.com/cdn/img/champion/splash/XinZhao_0.jpg",
				new Date(),"Xin Zhao","xin Zhao"));
		post.add(new Post(5,"Aatrox y sus hermanos, acabarían convirtiéndose en una amenaza aún mayor para Runaterra.",
				"https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Aatrox_0.jpg",
				new Date(),"Aatrox","aatrox"));
		post.add(new Post(6,"Ahri es una vastaya conectada de forma innata al poder latente de Runaterra.",
				"https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ahri_0.jpg",
				new Date(),"Ahri","ahri"));
		post.add(new Post(7,"Tras abandonar la orden de los Kinkou y su título de Puño de la Sombra, Akali actúa ahora en solitario.",
				"https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Akali_0.jpg",
				new Date(),"Akali","akali"));
		post.add(new Post(8,"Impávido ante el peligro, Akshan combate el mal con carisma, ganas de impartir venganza y una falta de camisetas.",
				"https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Akshan_0.jpg",
				new Date(),"Akshan","akshan"));
		post.add(new Post(9,"Un poderoso guerrero con una reputación temible, busca venganza por la muerte de su clan a manos del imperio noxiano.",
				"https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Alistar_0.jpg",
				new Date(),"Alistar","alistar"));
		post.add(new Post(10,"Cuenta la leyenda que es un alma solitaria y melancólica de la vieja Shurima que vaga por el mundo buscando un amigo.",
				"https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Amumu_0.jpg",
				new Date(),"Amumu","amumu"));
		post.add(new Post(11,"Es un espíritu alado benevolente que soporta ciclos interminables de vida, muerte y nacimiento para proteger Freljord.",
				"https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Anivia_0.jpg",
				new Date(),"Anivia","anivia"));
		post.get(1).setArrayUrlImgInd(images.gravesImages());
		post.get(0).setArrayUrlImgInd(images.ekkoImages());
		return post;
	}
	
}
