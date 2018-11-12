package com.cmc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tiepnv
 *
 */
@Entity
@Table(name="SlideBar")
public class SlideBar {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	@Column(name = "Img",nullable=false, length=225)
	private String img;
	
	@Column(name = "Slogan",nullable=false, length=260)
	private String slogan;
	
	@Column(name = "Title",nullable=false, length=60)
	private String title;
	
	@Column(name = "IsShow")
	private boolean isShow;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}
	
	
}
