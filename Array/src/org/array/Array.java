package org.array;

public class Array {
	
	public void ex() {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 115;
		a[2] = 114;
		a[3] = 113;
		a[4] = 112;
		System.out.println(a[3]);
		
		int len = a.length;
		System.out.println(len);
		
	}
	
	public static void main(String[] args) {
		Array obj =  new Array();
		obj.ex();
	}

}
