package com.Projspring.Projspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Projspring.Projspring.dao.CourseDao;
import com.Projspring.Projspring.entities.Course;


@Service
public class CourseServiceimpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
	public CourseServiceimpl() {
		
//		list=new ArrayList<Course>();
//		list.add(new Course(145,"Java Crash Course","this course contains basics of Java"));
//		list.add(new Course(4343,"Spring Boot Course","learning spring boot"));
//	
	}

	
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}


	public Course getCourse(long courseId) {
		
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}


	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}


	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;				
	}


	
	public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
	

}
