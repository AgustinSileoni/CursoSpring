package com.agustin.core.model;

import java.util.ArrayList;

public class ImagesAssignament {

	
	public ImagesAssignament() {

	}
	
	
	public ArrayList<String> ekkoImages(){
		ArrayList<String> images = new ArrayList<String>();
		for(Integer i = 1; i<13;i++) {
			images.add("https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ekko_"+i.toString()+".jpg");
		}
		return images;
	}
	
	public ArrayList<String> gravesImages(){
		ArrayList<String> images = new ArrayList<String>();
		for(Integer i = 1; i<6;i++) {
			images.add("https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Graves_"+i.toString()+".jpg");
		}
		return images;
	}
	
	
}
