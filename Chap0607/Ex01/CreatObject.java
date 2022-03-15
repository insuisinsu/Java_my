package Chap0607.Ex01;

class AA {
	String name;							//필드(멤버) : 인스턴스화 시켜야 사용이 가능
	int age;
	String email;
	
	AA() {	} 					// 기본 생성자, 생략 가능
								// 다른 생성자가 존재할 경우에는 생략할 수 없음
	
	public String getName() {				//메소드(멤버) : 인스턴스화 시켜야 사용가능
		return name;						//Heap 공간에 주소만 저장, 클래스 영역 내의 메소드 영역에 저장
	}										//return : 메소드를 호출하는 곳으로 변수의 값을 던져준다.
	public void setName(String name) {		//void : 리턴 값을 
		this.name = name;					
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}


public class CreatObject {

	public static void main(String[] args) {

		
		AA aa = new AA();		//AA클래스(설계도)를 aa(객체) 를 생성
		// AA : 클래스 이름, aa : 객체명 (인스턴스명), new : Heap 영역에 필드와 메소드
		// AA() : 생성자 : 객체의 필드값을 초기화. 생성자도 하나의 메소드
			//1. 생성자 이름이 클래스 이름과 동일 메소드
			//2. 리턴타입이 없다.
			//3. 생성자중 매개변수가 없는 생성자를 기본 생성자
			//4. 기본 생성자는 생략이 가능하다.
			//5. 객체를 생성 할 때 반드시 생성자를 호출
		
		
		
		
		//setters : 객체의 메모리에 값을 할당 할 때
		aa.setName("홍길동");				//객체에 메모리를 할당
		aa.setAge(30);
		aa.setEmail("aa@aa.com");
		//ghetters : 객체의 메모리의 값을 가지고 올 때
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		
		
		
		
		
	}

}
