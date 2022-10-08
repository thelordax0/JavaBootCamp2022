package kodlamaio.dataAccess.abstracts;

import kodlamaio.entitiees.Instructor;

public interface InstructorDao {
	void addInstructor(Instructor instructor);
	void deleteInstructor(Instructor instructor);
	void updateInstructor(Instructor instructor);
	Instructor getInstructorById(int id);
}
