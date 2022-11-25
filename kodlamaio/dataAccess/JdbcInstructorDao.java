package kodlamaio.dataAccess;

import kodlamaio.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) 
		{System.out.println("Eğitmen jdbc ile veritabanına eklendi " + instructor.getFirstName() +" "+ instructor.getLastName());}
	

	@Override
	public void update(Instructor instructor) 
		{System.out.println("Eğitmen jdbc ile güncellendi " + instructor.getFirstName() +" "+ instructor.getLastName());}	
	

	@Override
	public void delete(Instructor instructor) 
		{System.out.println("Eğitmen jdbc ile veritabanından silindi " + instructor.getFirstName() +" "+ instructor.getLastName());}
	

}
