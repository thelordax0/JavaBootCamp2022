package kodlamaio.dataAccess.concretes;

import java.util.List;

import kodlamaio.dataAccess.abstracts.CourseDao;
import kodlamaio.entitiees.Course;


public class JdbcCourseDao implements CourseDao{

	@Override
	public void addCourse(Course course) {
		// Jdbc sql queries
		
	}

	@Override
	public void deleteCourse(Course course) {
		// Jdbc sql queries
		
	}

	@Override
	public void updateCourse(Course course) {
		// Jdbc sql queries
		
	}

	@Override
	public Course getCourseById(int id) {
		// Jdbc sql queries
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
