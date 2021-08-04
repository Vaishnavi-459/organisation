package MainApplication;

import EmployeePackage.*;
import StudentsPackage.Students;

public class MainClass {

	static public void main(String[] args) {

		System.out.println("This is from Main");

		Employee anEmp = new Employee();

		System.out.println(anEmp.displayEmployee());
		Students std = new Students(22, "charitha", 85, "B.Tech");
		System.out.println(std.studentDetails());

	}

}
