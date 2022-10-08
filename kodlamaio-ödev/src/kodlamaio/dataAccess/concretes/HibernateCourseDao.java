package kodlamaio.dataAccess.concretes;

import java.util.List;

import kodlamaio.dataAccess.abstracts.CourseDao;
import kodlamaio.entitiees.Course;


public class HibernateCourseDao implements CourseDao{

	@Override
	public void addCourse(Course course) {
		//Hibernate sql queries
		
	}

	@Override
	public void deleteCourse(Course course) {
		//Hibernate sql queries
		
	}

	@Override
	public void updateCourse(Course course) {
		//Hibernate sql queries
		
	}

	@Override
	public Course getCourseById(int id) {
		//Hibernate sql queries
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		
		return null;
	}

}
