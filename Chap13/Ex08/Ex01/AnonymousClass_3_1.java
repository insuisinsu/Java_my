package Chap13.Ex08.Ex01;

/*3. 메소드의 매개변수로 전달
 	1. 클래스명 o, 참조변수 o
 	2. 클래스명 o, 참조변수 x 
 	
*/

//인터페이스 : 추상 메소드를 정의
interface A {
	//추상 메소드	: public abstract 가 생략되어 있음
	public abstract void cry();
	void fly();		
}

// interface A 를 구현한 class B
class B implements A{
	@Override
	public void cry() {
		System.out.println("멍멍 : 매개변수 전달");
	}
	@Override
	public void fly() {
		System.out.println("날지 못 함 : 매개변수 전달");
	}	
}

class C {
// C 객체의 abc() 호출 시 A 타입을 매개변수 필요
	void abc(A a) {
		//하위 자식 클래스가 매개변수로 들어올 경우 A 타입으로 자동으로 업캐스팅 됨
		a.cry();
		a.fly();
	}
}



public class AnonymousClass_3_1 {

	public static void main(String[] args) {
		//1. 클래스명 o , 참조변수 o
		C c = new C();
		A a = new B();
		c.abc(a);
		
		//2. 클래스명 o, 참조변수 x
		c.abc(new B());
		
		
	}

}
