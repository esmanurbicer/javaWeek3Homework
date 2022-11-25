package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public class HibernateCoruseDao implements ICourseDao {

	@Override
	public void add(Course course) 
		{System.out.println("Kurs hibernate ile veritabanına eklendi " + course.getCourseName());}
	

	@Override
	public void update(Course course) 
		{System.out.println("Kurs hibernate ile güncellendi " + course.getCourseName());}	
	
	
	@Override
	public void delete(Course course) 
		{System.out.println("Kurs hibernate ile veritabanından silindi " + course.getCourseName());}
	

}
