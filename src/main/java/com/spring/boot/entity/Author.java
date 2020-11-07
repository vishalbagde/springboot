package com.spring.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String fname;
	String lname;
	String lang;
	
	
	public Author(String fname, String lname, String lang) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.lang = lang;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int id, String fname, String lname, String lang) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.lang = lang;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", fname=" + fname + ", lname=" + lname + ", lang=" + lang + "]";
	}
	
	
	
	
}
