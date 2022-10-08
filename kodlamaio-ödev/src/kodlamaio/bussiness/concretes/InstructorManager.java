package kodlamaio.bussiness.concretes;

import kodlamaio.bussiness.abstracts.InstructorService;
import kodlamaio.dataAccess.abstracts.InstructorDao;
import kodlamaio.entitiees.Instructor;

public class InstructorManager implements InstructorService{
	private InstructorDao instructorDao;
	
	
	
	
	public InstructorManager(InstructorDao instructorDao) {
		super();
		this.instructorDao = instructorDao;
	}

	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println("Eğitmen eklendi");
		instructorDao.addInstructor(instructor);
	}

	@Override
	public void deleteInstructor(Instructor instructor) {
		System.out.println("Eğitmen silindi");
		instructorDao.deleteInstructor(instructor);
		
	}

	@Override
	public void updateInstructor(Instructor instructor) {
		System.out.println("Eğitmen güncellendi");
		instructorDao.updateInstructor(instructor);
		
	}

	@Override
	public Instructor getInstructorById(int id) {
		System.out.println("Eğitmen getirildi");
		
		return instructorDao.getInstructorById(id);
	}

}
