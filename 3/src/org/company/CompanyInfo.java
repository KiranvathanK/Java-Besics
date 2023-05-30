package org.company;

public class CompanyInfo {
	
	public void companyName() {
		System.out.println("company name is Decision Minds");
	}
	
	public void companyId() {
		System.out.println("comapny id is DM12");
	}
	
	public void companyAddress() {
		System.out.println("comany Address is Raheja Towers Benagaluru");
	}

	public static void main(String[] args) {
		CompanyInfo cdetails = new CompanyInfo();
		cdetails.companyName();
		cdetails.companyId();
		cdetails.companyAddress();
		
	}
}
