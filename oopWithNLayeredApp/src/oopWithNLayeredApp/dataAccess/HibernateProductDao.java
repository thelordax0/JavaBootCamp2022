package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		//sadece db erişim kodları buraya yazılır;SQL
		System.out.println("Jdbc ile veritabanına eklendi");
	}

	
}
