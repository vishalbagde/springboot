package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.CourseRepo;
import com.spring.boot.entity.Course;

@Component
@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepo courseRepo;
	
	@Override
	public Course add(Course course) {
		// TODO Auto-generated method stub
		Course c=courseRepo.save(course);
		return c;
	}
	
	@Override
	public void deleteCourseById(int id) {
		Course c=courseRepo.getOne(id);
		courseRepo.delete(c);
		
	}
	
	@Override
	public List<Course> findAll() {
		return courseRepo.findAll();
	}
	
	@Override
	public Course getCourseById(int id) {
		Course c=courseRepo.findAll().stream().filter(e->e.getId()==id).findFirst().get();
		return c;
	}
	
	@Override
	public Course updateCourseById(int id, Course course) {
		Course c=courseRepo.getOne(id);
		c.setUserid(course.getUserid());
		c.setTitle(course.getTitle());
		c.setDetails(course.getDetails());
		courseRepo.save(c);
		return c;
	}

}
