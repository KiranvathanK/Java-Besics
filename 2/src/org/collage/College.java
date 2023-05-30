package org.collage;

public class College {
	
	public void collegeName(){
		System.out.println("Enter collage name");
	}
	
	public void collegeCode() {
		System.out.println("Enter collage Code");
		
	}

	public void collegeRank() {
		System.out.println("Enter collage Rank");
		
	}
	
public static void main(String[] args) {
	College clg = new College();
	clg.collegeName();
	clg.collegeCode();
	clg.collegeRank();
	Student std = new Student();
	std.studentName();
	std.studentId();
	std.studentDept();
	Hostel hst = new Hostel();
	hst.hostelName();
	Dept ddtl = new Dept();
	ddtl.deptName();
	
}

}
