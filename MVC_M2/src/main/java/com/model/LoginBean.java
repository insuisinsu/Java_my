package com.model;

//비즈니스 로직을 처리하는 DTO ( 값을 받아서 전달하는 전달자 역할)
public class LoginBean {

	private String id;
	private String password;
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public boolean validate() {
		if(password.equals("admin"))
			return true;
		else
			return false;
	}
	
}
