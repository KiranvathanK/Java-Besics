package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArList {
	
	public static void main(String[] args) {
		List e = new ArrayList();
		List e1 = new ArrayList();
		e.add(10);
		e.add(10);
		e.add("22abcs");
		e.add(30);
		e.add(40);
//		System.out.println(e);
//		e.remove(2);
//		System.out.println(e);
//		boolean y = e.contains(10);
//		System.out.println(y);
//		Object x =e.get(0);
//		System.out.println(x);
//		e.set(0, 100);
//		System.out.println(e);
//		int y = e.size();
//		System.out.println(y);
		e1.addAll(e);
		System.out.println(e1);
		int d = e1.indexOf("22abcs");
		System.out.println(d);
		
	}

}
