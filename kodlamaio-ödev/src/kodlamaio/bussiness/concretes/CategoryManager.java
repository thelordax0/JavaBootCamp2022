package kodlamaio.bussiness.concretes;

import java.util.List;

import kodlamaio.bussiness.abstracts.CategoryService;
import kodlamaio.core.utilities.validators.CategoryValidator;
import kodlamaio.dataAccess.abstracts.CategoryDao;
import kodlamaio.entitiees.Category;

public class CategoryManager implements CategoryService{
	
	private CategoryDao categoryDao;
	
	
	
	
	
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public void addCategory(Category category) {
		
		if(CategoryValidator.isValid(category, this.getAllCategories())) {
			System.out.println("Categori eklendi");
			categoryDao.addCategory(category);
		}else {
			System.out.println("Category kurallara uymuyor");
		}
		
		
	}

	@Override
	public void deleteCategory(Category category) {
		System.out.println("Categori silindi");
		categoryDao.deleteCategory(category);
	}

	@Override
	public void updateCategory(Category category) {
		System.out.println("Categori güncellendi");
		categoryDao.updateCategory(category);
	}

	@Override
	public List<Category> getAllCategories() {
		System.out.println("tüm categoriler getirildi");
		return categoryDao.getAllCategories();
	}

}
