package kodlamaio.bussiness.abstracts;

import java.util.List;

import kodlamaio.entitiees.Category;

public interface CategoryService {
	void addCategory(Category category);
	void deleteCategory(Category category);
	void updateCategory(Category category);
	List<Category> getAllCategories();
}
