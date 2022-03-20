package Chap12.Ex2;

//interface 구현한 클래스
//Overriding : 완전한 메소드를 새로 정의하는 것
//Implements : 미완성 메소드를 완성시키는 것
//extends	 : 부모 클래스의 기능을 상속 받아서 확장하는 것

interface AA{
	void cry();			//추상 메소드, public abstract 생략되어 있음
	void run();			//+ 구현부 없음
}

//BB 클래스는 AA 인터페이스의 미완성된 메소드를 구현

class BB implements AA {

	@Override
	public void cry() {
		System.out.println("야옹");
	}

	@Override
	public void run() {
		System.out.println("펄쩍");
	}
	
}
		
		
public class Interface_2 {

	public static void main(String[] args) {

		AA aa = new BB();
		aa.cry();
		aa.run();
		
	}

}
