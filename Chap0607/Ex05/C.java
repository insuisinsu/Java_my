package Chap0607.Ex05;

public class C {			// 다른 패키지에서 import 가능

	//필드에 부여되는 접근 제어자
	private String company ;
	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getMaxspeed() {
		return maxspeed;
	}


	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}


	String model;
	protected String color;
	public int maxspeed;
	
	
	public void print() {
		System.out.println("company : "+company+"  model : " +model
				+ "  color : " + color + "  maxSpeed : "+maxspeed);
	}
	
}
