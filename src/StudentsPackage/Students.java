package StudentsPackage;

import Utilities.Address;
import Utilities.Education;

public class Students {
	int id;
	String name;
	int marks;
	String address;
	Education edu = new Education();

	public Students(int stdid, String stdname, int stdmarks, String stdaddress) {
		id = 16;
		name = "vaishnavi";
		marks = stdmarks;
		address = stdaddress;
	}

	Address addr = new Address();

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getMarks() {
		return marks;
	}

	void setMarks(int marks) {
		this.marks = marks;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

	public String studentDetails() {
		System.out.println(edu.educationDetails());
		System.out.println(addr.displayAddress());
		return id + name + marks + address;

	}
}
