package com.spring.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String userid;
	String title;
	String details;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", userid=" + userid + ", title=" + title + ", details=" + details + "]";
	}
	public Course(int id, String userid, String title, String details) {
		super();
		this.id = id;
		this.userid = userid;
		this.title = title;
		this.details = details;
	}
	public Course(String userid, String title, String details) {
		super();
		this.userid = userid;
		this.title = title;
		this.details = details;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		

}
