package com.spring.boot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.entity.Course;


public interface CourseService  {
	
	  	public List<Course> findAll();
	    public Course add(Course course);
	    public Course getCourseById(int id);
	    public void deleteCourseById(int id);
	    public Course updateCourseById(int id,Course course);

}
