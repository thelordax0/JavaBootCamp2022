package kodlamaio.bussiness.abstracts;

import kodlamaio.entitiees.Instructor;

public interface InstructorService {
	void addInstructor(Instructor instructor);
	void deleteInstructor(Instructor instructor);
	void updateInstructor(Instructor instructor);
	Instructor getInstructorById(int id);
}
