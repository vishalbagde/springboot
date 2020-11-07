package com.spring.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>  {
	
	

}
