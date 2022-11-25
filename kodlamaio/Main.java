package kodlamaio;

import java.util.ArrayList;


import java.util.List;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.business.InstructorManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.HibernateCoruseDao;
import kodlamaio.dataAccess.HibernateInstructorDao;
import kodlamaio.dataAccess.JdbcCategoryDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception  {

		Logger[] loggers = {new FileLogger() , new DatabaseLogger()} ;
		
		Instructor instructor1= new Instructor(3 , "'Engin", "Demiroğ'");
	
		InstructorManager instructorManager= new InstructorManager(new HibernateInstructorDao(), loggers);
		
		System.out.println("EĞİTMEN YÖNETİCİSİ");
		System.out.println(" ");
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.update(instructor1);
		System.out.println(" ");
		
		////////////////////////////////////////////////////////////////////////////////////////
		Category category = new Category(3 ,"'Programlama'" );
		Category category1 = new Category(4, "'Tümü'");
		
		List<Category> categories = new ArrayList<>() ;
		
		CategoryManager categoryManager= new CategoryManager (new JdbcCategoryDao(), loggers, categories);
	
		System.out.println("KATEGORİ YÖNETİCİSİ");
		System.out.println(" ");
		categoryManager.add(category);
		categoryManager.add(category1);
		System.out.println(" ");
		
		///////////////////////////////////////////////////////////////////////////////////////
		Course course1= new Course( 3 ,"'Java'",  "Engin Demiroğ", 350);
		
		List<Course> courses = new ArrayList<>() ;
	
		CourseManager courseManager= new CourseManager(new HibernateCoruseDao(), loggers, courses);
	
		System.out.println("KURS YÖNETİCİSİ");
		System.out.println(" ");
		courseManager.add(course1);
		courseManager.delete(course1);
		courseManager.update(course1);	
	}

}
