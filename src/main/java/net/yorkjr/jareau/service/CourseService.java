package net.yorkjr.jareau.service;

import net.yorkjr.jareau.pojo.Course;

import java.util.List;

/**
 * Created by lijunbo on 15/1/17.
 */
public interface CourseService {
    Course getCourse(int courseId);
    List<Course> getAllCourses();
}
