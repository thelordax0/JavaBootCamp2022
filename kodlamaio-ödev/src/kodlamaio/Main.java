package kodlamaio;




import kodlamaio.bussiness.concretes.CategoryManager;
import kodlamaio.bussiness.concretes.InstructorManager;
import kodlamaio.bussiness.concretes.LogManager;
import kodlamaio.core.utilities.loggers.DatabaseLogger;
import kodlamaio.dataAccess.concretes.HibernateCategoryDao;
import kodlamaio.dataAccess.concretes.JdbcInstructorDao;
import kodlamaio.entitiees.Category;

import kodlamaio.entitiees.Instructor;

public class Main {

	public static void main(String[] args) {
		
		InstructorManager im=new InstructorManager(new JdbcInstructorDao());
		im.addInstructor(new Instructor(0, null, null, 0));
		CategoryManager cm=new CategoryManager(new HibernateCategoryDao());
		cm.deleteCategory(new Category(0, null, null));
		
		
		LogManager lm=new LogManager(new DatabaseLogger());
		
		lm.log("sistem düzgün çalışıyor");
	}

}
