package org.string;

public class ClassStg {
	
	public void simpleMethod() {
		
		String s = "hai good morning";
//		System.out.println(s);
//		char ch = s.charAt(1);
//		System.out.println(ch);
//		boolean a = s.contains("a");
//		System.out.println(a);
//		boolean b = s.equals("a");
//		System.out.println(b);
		String[] c = s.split(" ");
		System.out.println(c.length);
//		
//		String u = s.toUpperCase();
//		System.out.println(u);
//		
//		String l = s.toLowerCase();
//		System.out.println(l);
//		
	}
	
	public static void main(String[] args) {
		ClassStg obj = new ClassStg();
		obj.simpleMethod();
	}

}
