package kodlamaio.bussiness.abstracts;

import java.util.List;

import kodlamaio.entitiees.Course;


public interface CourseService {
	void addCourse(Course course);
	void deleteCourse(Course course);
	void updateCourse(Course course);
	Course getCourseById(int id);
	List<Course> getAllCourses();
}
