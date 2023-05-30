package org.control;

public class ControlIf {

	
	public void add() {
		
		for(int i=0; i<=10;i++) {
		
		if(i % 2 == 1) {
			System.out.println(i);
		}
		
	}
}
	
	public static void main(String[] args) {
		ControlIf ob = new ControlIf();
		ob.add();
	}

}
