package Utilities;

public class Experience {
	String companyName;
	String location;
	int yoe;

	String getcompanyName() {
		return companyName;
	}

	void setcompanyName(String acompanyName) {
		companyName = acompanyName;
	}

	public String experienceDetails() {
		return companyName + location + yoe;
	}
}
