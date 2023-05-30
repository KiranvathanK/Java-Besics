package org.link;

import java.util.LinkedList;
import java.util.List;

public class LiList {
	
	public static void main(String[] args) {
		List k = new LinkedList();
		List p = new LinkedList();
		k.add("4jd14cs023");
		k.add("4jd15cs006");
		k.add(123);
		k.add(234);
//		System.out.println(k);
//		Object k1=k.get(0);
//		System.out.println(k1);
//		int k2 = k.size();
//		System.out.println(k2);
//		p.addAll(k);
//		System.out.println(p);
//		boolean p1 = p.contains(123);
//		System.out.println(p1);
		k.remove(1);
		System.out.println(k);
		
	}

}
