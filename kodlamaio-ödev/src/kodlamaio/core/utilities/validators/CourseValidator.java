package kodlamaio.core.utilities.validators;

import java.util.List;

import kodlamaio.entitiees.Course;

public class CourseValidator {

	public static boolean isValid(Course course,List<Course> courses) {
		if(courses != null) {
			for(Course c:courses) {
				if(course.getName().equals(c.getName())) {
				return false;
				}
			
			
				if(course.getPrice()<0) {
				return false;
				}
			
			}
		}
		return true;
	}
}
