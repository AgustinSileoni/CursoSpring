package com.agustin.core.model;

import java.util.Date;
import java.util.ArrayList;

public class Post {
	private int id;
	private String description;
	private String urlImg;
	private Date fecha;
	private String name;
	private String secondName;
	private ArrayList<String> urlImagesInd;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setArrayUrlImgInd(ArrayList<String> array) {
		this.urlImagesInd = array;
	}
	public ArrayList<String> getArraryUrlImgInd(){
		return urlImagesInd;
	}

	public Post(int id, String description, String urlImg, Date fecha, String name,String secondName) {
		this.id = id;
		this.description = description;
		this.urlImg = urlImg;
		this.fecha = fecha;
		this.name = name;
		this.secondName = secondName;
	}
	public Post() {
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	
	
}
