package Utilities;

public class Education {
	String degree;
	int marks;
	int yop;

	public Education() {
		degree = "B.Tech";
		marks = 80;
		yop = 2020;
	}

	String getDegree() {
		return degree;
	}

	void setDegree(String edudegree) {
		degree = edudegree;
	}

	int getMarks() {
		return marks;
	}

	void setMarks(int edumarks) {
		marks = edumarks;
	}

	int getYop() {
		return yop;
	}

	void setYop(int eduyop) {
		yop = eduyop;
	}

	public String educationDetails() {
		return degree + marks + yop;
	}

}
