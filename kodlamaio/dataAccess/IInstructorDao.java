package kodlamaio.dataAccess;

import kodlamaio.entities.Instructor;

public interface IInstructorDao {
	
	public void add(Instructor instructor);
	public void update(Instructor instructor);
	public void delete(Instructor instructor);

}
