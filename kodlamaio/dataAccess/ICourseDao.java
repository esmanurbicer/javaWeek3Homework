package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public interface ICourseDao {
	
	public void add(Course course);
	public void update(Course course);
	public void delete(Course course);

}
