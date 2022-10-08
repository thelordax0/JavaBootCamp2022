package kodlamaio.dataAccess.abstracts;

import java.util.List;

import kodlamaio.entitiees.Category;

public interface CategoryDao {
	void addCategory(Category category);
	void deleteCategory(Category category);
	void updateCategory(Category category);
	List<Category> getAllCategories();
}
