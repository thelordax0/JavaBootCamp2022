package oop1;
//CorporateCustomer Customer den extends ile miras alır
public class CorporateCustomer extends Customer {
	private String taxName;
	private String companyName;

	public String getTaxName() {
		return taxName;
	}

	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
