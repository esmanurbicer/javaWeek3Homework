package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) 
	{System.out.println("Kurs jdbc ile veritabanına eklendi " + course.getCourseName());}

	@Override
	public void update(Course course) 
	{System.out.println("Kurs jdbc ile güncellendi " + course.getCourseName());}	
	

	@Override
	public void delete(Course course) 
	{System.out.println("Kurs jdbc ile veritabanından silindi " + course.getCourseName());}

}
