package kodlamaio.dataAccess;

import kodlamaio.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {
	
	
	@Override
	public void add(Category category) 
		{System.out.println("Kategori jdbc ile veritabanına eklendi " + category.getCategoryname());}
		
	@Override
	public void update(Category category) 
		{System.out.println("Kategori jdbc ile güncellendi " + category.getCategoryname());}
	
	@Override
	public void delete(Category category)
	{System.out.println("Kategori jdbc ile veritabanından silindi " + category.getCategoryname());}


}
