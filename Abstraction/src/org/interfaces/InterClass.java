package org.interfaces;

public class InterClass implements Normal{
	
	@Override
	public void method1() {
		System.out.println("method1");
		
	}

	@Override
	public void method2() {
		System.out.println("method2");
		
	}

	public static void main(String[] args) {
		InterClass obj = new InterClass();
		obj.method1();
		obj.method2();

	}

	

}
