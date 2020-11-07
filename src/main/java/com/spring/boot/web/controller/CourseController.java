package com.spring.boot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Course;
import com.spring.boot.service.CourseService;

@CrossOrigin
@RestController
public class CourseController {

	@Autowired
	CourseService courseService;

	@GetMapping(value= "/courses")
	public List<Course> getCourse() {
		return courseService.findAll();
	}

	@GetMapping(value="/course/{id}")
	public Course getCourse(@PathVariable("id") int id) {
		System.out.println("this is call");
		Course c= courseService.getCourseById(id);
		return c;
	}

	@PostMapping(value = "/course")
	public Course addCourse(@RequestBody Course course) {
		System.out.println("post maping call");
		return courseService.add(course);
	}

	@DeleteMapping(value = "/course/{id}")
	public Course deleteCourse(@PathVariable("id") int id) {
		Course course = courseService.getCourseById(id);
		courseService.deleteCourseById(id);
		return course;
	}

	@PutMapping(value = "/course/{id}")
	public Course upCourse(@PathVariable("id") int id) {
		Course course = courseService.getCourseById(id);
		Course c = courseService.updateCourseById(id, course);
		return c;
	}
}
