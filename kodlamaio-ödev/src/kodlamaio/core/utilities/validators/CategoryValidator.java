package kodlamaio.core.utilities.validators;

import java.util.List;

import kodlamaio.entitiees.Category;

public class CategoryValidator {
	public static boolean isValid(Category category,List<Category> categories) {
		if(categories != null) {
			for(Category c:categories) {
				if(category.getName().equals(c.getName())) {
				return false;
				}
			}
		}
		
		
		return true;
	}
}
