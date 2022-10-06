package youtubeEğitim;

public class CorporateCustomer extends Customer{
	

	private String taxNumber;
	
	public CorporateCustomer(int id,String taxNumber) {
		super(id);
		this.taxNumber=taxNumber;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	
}
