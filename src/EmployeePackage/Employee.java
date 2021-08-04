
package EmployeePackage;

import Utilities.*;

public class Employee {

	int id;
	String name;
	Address officeAddress = new Address();
	Education empEducation = new Education();
	Experience empExperience = new Experience();

	public Employee() {

		id = 100;
		name = "default";

	}

	Address address1 = new Address();

	int getId() {

		return id;
	}

	String getName() {

		return name;
	}

	Address getofficeAddress() {

		return officeAddress;
	}

	void setId(int anId) {

		id = anId;
	}

	void setname(String aName) {

		name = aName;
	}

	void setofficeAddress(Address anAddress) {

		officeAddress = anAddress;
	}

	public String displayEmployee() {

		System.out.println(address1.displayAddress());
		System.out.println(empEducation.educationDetails());
		System.out.println(empExperience.experienceDetails());
		return (id + "   " + name + "  " + (officeAddress.displayAddress()));
		

	}

}
