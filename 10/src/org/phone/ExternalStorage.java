package org.phone;

public class ExternalStorage {
	
	public void size() {
		System.out.println("the External storage size is 2TB");
	}
	
	public static void main(String[] args) {
		ExternalStorage estg = new ExternalStorage();
		estg.size();
	}

}
