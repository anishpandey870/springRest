package com.springrest.Controller;


import com.springrest.Entity.Course;
import com.springrest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }
   //get courses
    @GetMapping("/course")
    public List<Course> getCourse(){
      return this.courseService.getCourse();
    }
    //here getting course by field
    @GetMapping("/course/{courseId}")
    public Course getOneCourse(@PathVariable long courseId){
         return this.courseService.getOneCourse(courseId);
    }
    //here Adding course
    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.AddCourse(course);
    }
    //here updating course
    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

}
