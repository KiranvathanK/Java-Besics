package org.emp;

public class Employee {
	
	public void employeeId() {
		System.out.println("employee id is 1");
	}
	public void employeeName() {
		System.out.println("employee Name is Balesh");
	}
	public void employeeDOB() {
		System.out.println("employee DOB is Feb 27 2010");
	}
	public void employeePhone() {
		System.out.println("employee phone number is 9088765432");
	}
	public void employeeEmail() {
		System.out.println("employee Emailis abc@123.com");
	}
	public void employeeAddress() {
		System.out.println("employee Address is Banglore");
	}
	
	public static void main(String[] args) {
		Employee object = new Employee();
		object.employeeId();
		object.employeeName();
		object.employeeDOB();
		object.employeePhone();
		object.employeeEmail();
		object.employeeAddress();
		
		
	}
}
