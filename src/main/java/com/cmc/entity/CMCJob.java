package com.cmc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tiepnv
 */
@Entity
@Table(name="CMCJob")
public class CMCJob {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	@Column(name = "JobName",nullable=false, length=120)
	private String jobName;
	
	@Column(name = "LinkContent",nullable=false)
	private String linkContent;
	
	@Column(name = "Status",nullable=false, length=20)
	private String status;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getLinkContent() {
		return linkContent;
	}

	public void setLinkContent(String linkContent) {
		this.linkContent = linkContent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

	@Column(name = "IsShow")
	private boolean isShow;
}
