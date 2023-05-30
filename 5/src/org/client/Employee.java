package org.client;
import org.company.*;
import org.emp.*;
import org.project.*;


public class Employee {

	public void empName() {
		System.out.println("Employee Name is Singh");
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		Company cmp = new Company();
		Client cobj = new Client();
		Project pd = new Project();
		emp.empName();
		cmp.comapanyName();
		cobj.clientName();
		pd.projectName();
	}
}
