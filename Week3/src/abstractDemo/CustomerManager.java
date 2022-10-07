package abstractDemo;

public class CustomerManager {
	//Strategy patternini uyguluyoruz
	BaseDatabaseManager databaseManager;
	public void getCustomers() {
		databaseManager.getData();
	}
}
