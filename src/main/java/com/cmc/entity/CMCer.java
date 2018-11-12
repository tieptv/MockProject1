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
@Table(name="CMCer")
public class CMCer {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	@Column(name = "Title",nullable=false, length=20)
	private String title;
	
	@Column(name = "Img",nullable=false, length=225)
	private String img;
	
	@Column(name = "IconImg",nullable=false, length=225)
	private String iconImg;
	
	@Column(name = "EmployeeName",nullable=false, length=100)
	private String employeeName;
	
	@Column(name = "EmployeePosition",nullable=false, length=160)
	private String employeePosition;
	
	@Column(name = "Comment",nullable=false, length=215)
	private String comment;
	
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

	public String getIconImg() {
		return iconImg;
	}

	public void setIconImg(String iconImg) {
		this.iconImg = iconImg;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}
	
}
