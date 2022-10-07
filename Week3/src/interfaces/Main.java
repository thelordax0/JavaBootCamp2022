package interfaces;

import abstractDemo.OracleDatabaseManager;

public class Main {

	public static void main(String[] args) {
		ICustomerDal customerDal=new MySqlCustomerDal();
		customerDal.add();
		
		CustomerManager customerManager=new CustomerManager();
		//Configurasyon
		customerManager.customerDal=new OracleCustomerDal();
		customerManager.add();
	}

}
