package kodlamaio.dataAccess;

import kodlamaio.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) 
       { System.out.println("Kategori hibernate ile veritabanına eklendi " + category.getCategoryname());}		
	
	@Override
	public void update(Category category) 
		{System.out.println("Kategori hibernate ile güncellendi "+ category.getCategoryname());}
	
	@Override
	public void delete(Category category)
	{System.out.println("Kategori hibernate ile veritabanından silindi " + category.getCategoryname());}
	
	

}
