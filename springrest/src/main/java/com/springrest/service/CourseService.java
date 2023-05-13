package com.springrest.service;

import com.springrest.Entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourse();

    public Course getOneCourse(long courseId);

    //here Adding the course

    public Course AddCourse(Course course);

    public Course updateCourse(Course course);

}