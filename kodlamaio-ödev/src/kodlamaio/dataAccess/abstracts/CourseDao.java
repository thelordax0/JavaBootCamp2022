package kodlamaio.dataAccess.abstracts;

import java.util.List;

import kodlamaio.entitiees.Course;

public interface CourseDao {
	void addCourse(Course course);
	void deleteCourse(Course course);
	void updateCourse(Course course);
	Course getCourseById(int id);
	List<Course> getAllCourses();
}
