package Chap0607.Ex02;

public class Car {


	String company ; 
	String model ;
	String color ;
	int maxSpeed ;
	
	public String getCompany() {
		return company;
	}
	// RAM 값을 부여할 때 setter
	// this : 자신의 객체
	public void setCompany(String company) {	//메소드에 인풋되는 변수명 company	
		this.company = company;		// 인풋된 변수를 받는 변수명 company			
	}	// 메모리에 로드할 변수명 this.company				
		// 이 세개의 변수명이 동일할 경우 this. 키 사용
	public String getModel() {
		return model;
	}
	public void setModel(String mo) {	
		model = mo;	//인풋(mo), 인풋을 받는 변수(mo), 메모리에 로드할 변수(model)가
					//이름이 같지 않다면 this. 생략 가능	
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	

}
