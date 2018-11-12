package com.cmc.mockproject1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CMCLife")
public class CMCLife {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	@Column(name = "Title",nullable=false, length=255)
	private String title;
	
	@Column(name = "Img",nullable=false, length=255)
	private String img;
	
	@Column(name = "CMCLifeContent",nullable=false, length=255)
	private String content;
	
	
	@Column(name = "IsShow")
	private boolean isShow;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public boolean isShow() {
		return isShow;
	}


	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}


	
}
