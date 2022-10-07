package interfaces;

public class CustomerManager {
	ICustomerDal customerDal;
	public void add() {
		//iş kodları
		customerDal.add();
	}
}
