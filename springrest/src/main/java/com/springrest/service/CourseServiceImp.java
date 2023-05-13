package com.springrest.service;

import com.springrest.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImp implements CourseService{
    List<Course> list;
    public CourseServiceImp(){
        list =new ArrayList<>();
        list.add(new Course(1234L,"Java","This is core java course"));
        list.add(new Course(5678l,"SpringBoot","This is java framework course"));
    }
    @Override
    public List<Course> getCourse() {
        return list;
    }

    @Override
    public Course getOneCourse(long courseId) {
        Course c=null;
        for(Course course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }

        return c;
    }

    @Override
    public Course AddCourse(Course course) {
        list.add(course);
        return course;
    }
    public Course updateCourse(Course course){
        list.forEach(e ->{
            if(e.getId()==course.getId()){
                e.setTitle(course.getTitle());
                e.setDescription(course.getDescription());
            }
        });
        return course;
    }

}
