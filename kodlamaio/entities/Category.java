package kodlamaio.entities;

public class Category {
	
	private int categoryId;
	private String categoryname;
	
	public Category() {}
		
	public Category(int categoryId, String categoryname)
	{
		super();
		this.categoryId = categoryId;
		this.categoryname = categoryname;
	}

	public int getCategoryId() 
		{return categoryId;}
	
	public void setCategoryId(int categoryId) 
		{this.categoryId = categoryId;}
	
	public String getCategoryname() 
		{return categoryname;}
	
	public void setCategoryname(String categoryname) 
		{this.categoryname = categoryname;}
	
}	  


