package org.overloading;

public class OverRiding1 extends OverRiding{
	
	public void simpleMethod() {
		System.out.println("overriding1");
		System.out.println("current class");
	}

	public static void main(String[] args) {
		OverRiding1 o = new OverRiding1();
		o.simpleMethod();
	}
}
