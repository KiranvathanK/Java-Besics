package org.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {
	public static void main(String[] args) {
//		Set s = new HashSet();
//		s.add(10);
//		s.add(20);
//		s.add(40);
//		s.add(34);
//		s.add(34);
//		
//		s.remove(20);
//		System.out.println(s);
		
//		Set d = new LinkedHashSet();
//		d.add(10);
//		d.add(20);
//		d.add(41);
//		d.add(44);
//		d.add(44);
//		System.out.println(d);
//		d.remove(44);
//		System.out.println(d);
		
		Set g = new TreeSet();
		g.add(10);
		g.add(23);
		g.add(12);
		g.add(11);
		System.out.println(g);
		g.remove(23);
		System.out.println(g);
	}

}
