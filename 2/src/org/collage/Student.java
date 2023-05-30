package org.collage;

public class Student {
	
	public void studentName(){
		System.out.println("Student name is Hussain");		
	}

	public void studentDept(){
		System.out.println("Student Department is CS");
		
	}
	
	public void studentId(){
		System.out.println("Student id is usn000123");
		
	}
	
public static void main(String[] args) {
	Student sdtl = new Student();
	sdtl.studentName();
	sdtl.studentDept();
	sdtl.studentId();
}
}
