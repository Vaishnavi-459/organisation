package Utilities;

public class Address {

	String houseNo,street,locality,area,state,country;
	int pin;
	
public	Address(){
		
		houseNo = "";
		street="";
		locality="bhavanipuram";
		area="Vijayawada";
		state= "AndhraPradesh";
		country ="India";
		pin=520002;
		
	}
	
	String getArea() {
		
		return area;
		}
	
	int getPin(){
		
		return pin;
	}
	
	
	void setArea(String anArea) {
		
	area =anArea;
	}
	
	
	void setPin(int aPin) {
	pin = aPin;	
	}
	
	public String displayAddress() {
		return houseNo + street+locality+area+state+country+pin;
	}
	
}
