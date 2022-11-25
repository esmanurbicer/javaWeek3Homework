package kodlamaio.business;


import java.util.List;
import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.ICategoryDao;
import kodlamaio.entities.Category;



public class CategoryManager {
	private ICategoryDao icategoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	public CategoryManager(ICategoryDao icategoryDao, Logger[] loggers, List<Category> categories) 
	{	
		this.icategoryDao = icategoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	
	public void add(Category category) throws Exception {
	
		for(Category category1: categories) {
			if(category1.getCategoryname()== category.getCategoryname()) 
			  {throw new Exception("Bu kategori ismi zaten bulunmakta. Lütfen başka bir isim giriniz.");}
			}
		
		
	icategoryDao.add(category);
	    for(Logger logger: loggers) 
		   { logger.log(); }
	}

	 public void update(Category category) {
	    for(Logger logger: loggers) 
	       {logger.log(); }
	 }

     public void delete(Category category) {
    	 for(Logger logger : loggers) {
    		 logger.log();
    	 }
     }


}
	
	
	
	
	
	
	
	
	
	
	

	


