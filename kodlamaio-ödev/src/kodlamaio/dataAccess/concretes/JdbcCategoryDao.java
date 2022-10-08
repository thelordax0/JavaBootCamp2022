package kodlamaio.dataAccess.concretes;

import java.util.List;

import kodlamaio.dataAccess.abstracts.CategoryDao;
import kodlamaio.entitiees.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void addCategory(Category category) {
		//Jdbc sql queries
	}

	@Override
	public void deleteCategory(Category category) {
		//Jdbc sql queries
		
	}

	@Override
	public void updateCategory(Category category) {
		//Jdbc sql queries
		
	}

	@Override
	public List<Category> getAllCategories() {
		//Jdbc sql queries
		return null;
	}

}
