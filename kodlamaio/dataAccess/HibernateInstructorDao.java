package kodlamaio.dataAccess;

import kodlamaio.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		{System.out.println("Eğitmen hibernate ile veritabanına eklendi " + instructor.getFirstName() +" "+instructor.getLastName());}
	}

	@Override
	public void update(Instructor instructor) {
		{System.out.println("Eğitmen hibernate ile güncellendi " + instructor.getFirstName() +" "+ instructor.getLastName());}
	}

	@Override
	public void delete(Instructor instructor) {
		{System.out.println("Eğitmen hibernate ile veritabanından silindi " + instructor.getFirstName() +" "+ instructor.getLastName());}
	}

}
