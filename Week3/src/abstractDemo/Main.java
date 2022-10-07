package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		//Configurasyon
		customerManager.databaseManager=new SqlServerDatabaseManager();
		customerManager.getCustomers();

	}

}
