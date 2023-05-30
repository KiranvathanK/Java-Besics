package org.overloading;

public class OverLoading {
	
	public void method1() {
		
		int a = 5;
		int b =6;
		int c = a-b;
		System.out.println(c);
	}
	
	public void method1(int a, int b) {
		
		int c = a+b;
		System.out.println(c);
	}

	public void method1(int a,int b, int c) {
	
	int d = a+b*c;
	System.out.println(d);
}

	public static void main(String[] args) {
		OverLoading obj = new OverLoading();
		obj.method1();
		obj.method1(2,6);
		obj.method1(2,36,5);
	}
}
