package kodlamaio.entities;

public class Course {

	private int courseId;
	private String courseName;
	private String courseInstructor;
	private double coursePrice;
	
	public Course() {}
	
	
	public Course(int courseId, String courseName, String courseInstructor, double coursePrice) 
	{
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.coursePrice = coursePrice;
	}
	
	public int getCourseId() 
		{return courseId;}
	
	public void setCourseId(int courseId)
	    {this.courseId = courseId;}
	
	public String getCourseName() 
	    {return courseName;}
	
	public void setCourseName(String courseName) 
		{this.courseName = courseName;}
	
	public String getCourseInstructor() 
		{return courseInstructor;}
	
	public void setCourseInstructor(String courseInstructor) 
		{this.courseInstructor = courseInstructor;}
	
	public double getCoursePrice() 
		{return coursePrice;}
	
	public void setCoursePrice(double coursePrice) 
		{this.coursePrice = coursePrice;}
	
}
