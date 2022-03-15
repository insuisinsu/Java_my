package Chap0607.Ex06;

//객체의 필드에 값을 할당하는 방식 3가지
//1. 필드에 직접 값을 부여하는 방식						// 객체 생성 후
//2. setter 를 통해서 객체의 필드에 값을 부여 (컨트롤 가능)	// 객체 생성 후
//3. 생성자를 통해서 객체의 필드 값을 부여 (컨트롤 가능)		// 객체 생성할 때 초기값으로 필드에 값 할당


//1. 객체 생성 후 직접 필드에 값 할당
class Aa { 				
	String name ;
	int age;
	String mail;
	
	void print() {
		System.out.println("name : "+name +".  age : "+age+".  mail : "+mail);
	}
	
}

//2. setter 를 통해서 객체의 필드에 값을 부여
class Bb{
	String name ;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	int age;
	String mail;
	
	void print() {
		System.out.println("name : "+name +".  age : "+age+".  mail : "+mail);
	}
	
}

//3. 생성자를 통해서 객체의 필드 값을 부여
class Cc{
	String name ;
	int age;
	String mail;
	
	void work (String name, int age, String mail) {
		this.name = name;
		this.age = age;
		this.mail = mail;
		print();
	}
	
	void print() {
		System.out.println("name : "+name +".  age : "+age+".  mail : "+mail);
	}
}

public class FieldOfValue {

	public static void main(String[] args) {

		//1. 객체의 필드에 직접 값을 부여하는 방식						// 객체 생성 후
		Aa aa = new Aa();
		
		aa.name = "박인수";
		aa.age = 30;
		aa.mail = "aaa@aaaa.com";
		aa.print();
		
		//2. 객체의 setter 를 통해서 객체의 필드에 값을 부여 (컨트롤 가능)	// 객체 생성 후
		Bb bb = new Bb();
		
		bb.setName("홍길동");
		bb.setAge(20);
		bb.setMail("bbb@bbbbb.com");
		bb.print();
		
		//3. 생성자를 통해서 객체의 필드 값을 부여 (컨트롤 가능)			// 객체 생성할 때 초기값으로 필드에 값 할당
		Cc cc = new Cc();
		
		cc.work("손흥민", 32, "ccc@ccccc.com");
	}

}
