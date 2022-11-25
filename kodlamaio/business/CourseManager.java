package kodlamaio.business;

import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.ICourseDao;
import kodlamaio.entities.Course;

   public class CourseManager{
	    private ICourseDao icourseDao;
	    private Logger[] loggers;
	    private List<Course> courses;
		
			
   public CourseManager(ICourseDao icourseDao, Logger[] loggers, List<Course> courses) 
    {	
	this.icourseDao = icourseDao;
	this.loggers = loggers;
	this.courses = courses;
	}

   public void add(Course course) throws Exception {
    for(Course coursen : courses) {
       if(coursen.getCourseName() == course.getCourseName()) 
		 {throw new Exception("Bu kurs ismi zaten bulunmakta. Başka bir isim deneyiniz.");}}
		
    for(Course coursep : courses) {
       if(coursep.getCoursePrice()== course.getCoursePrice())
		 {throw new Exception("Kurs fiyatı 0' dan küçük olamaz");}}
  
    icourseDao.add(course);
     for(Logger logger: loggers)
        {logger.log(); }}
			
  
    public void update(Course course) {
	icourseDao.update(course);
	  for(Logger logger: loggers)
	     {logger.log(); }}
  
    public void delete(Course course) {
	icourseDao.delete(course);
	  for(Logger logger: loggers)
	     {logger.log(); }}
	  
  
		}


