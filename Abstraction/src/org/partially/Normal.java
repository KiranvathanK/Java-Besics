package org.partially;

public class Normal extends Partially {

	@Override
	public void secure() {
		System.out.println("secure section");
		
	}
	
	public void normalM() {
		System.out.println("normal call");
	}
	
public static void main(String[] args) {
	
	Normal obj = new Normal();
	obj.secure();
	unsecure();
	obj.normalM();
}	
	

}
