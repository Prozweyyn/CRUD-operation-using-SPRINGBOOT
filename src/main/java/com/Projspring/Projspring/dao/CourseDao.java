package com.Projspring.Projspring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projspring.Projspring.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long> {

}
