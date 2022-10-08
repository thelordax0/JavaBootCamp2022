package kodlamaio.bussiness.concretes;

import java.util.List;

import kodlamaio.bussiness.abstracts.CourseService;
import kodlamaio.core.utilities.validators.CourseValidator;
import kodlamaio.dataAccess.abstracts.CourseDao;
import kodlamaio.entitiees.Course;

public class CourseManager implements CourseService{

	private CourseDao courseDao;
	
	
	
	
	
	public CourseManager(CourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	
	
	@Override
	public void addCourse(Course course) {
		if(CourseValidator.isValid(course, this.getAllCourses())) {
			System.out.println("Kurs eklendi ");
			courseDao.addCourse(course);
		}else {
			System.out.println("Kurs kurallara uymuyor");
		}
		
	}

	@Override
	public void deleteCourse(Course course) {
		System.out.println("Kurs silindi ");
		courseDao.deleteCourse(course);
	}

	@Override
	public void updateCourse(Course course) {
		System.out.println("Kurs güncellendi ");
		courseDao.updateCourse(course);
	}

	@Override
	public Course getCourseById(int id) {
		System.out.println("Kurs getirildi ");
		return courseDao.getCourseById(id);
	}



	@Override
	public List<Course> getAllCourses() {
		System.out.println("Tüm kurslar getirildi");
		return null;
	}

}
