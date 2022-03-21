package Chap13.Ex06;

class A {
	// C 타입의 B 객체 생성
	C c = new B();
	void abc() {
		c.bcd();
	}
}

//인터페이스 C 의 추상메서드 구현하는 B 클래스
class B implements C{
	@Override
	public void bcd() {
		System.out.println("인스턴스 이너 클래스");
	}
}

// 인터페이스 : 추상 메서드 정의 : void bcd()
interface C {
	public abstract void bcd();
}

public class AnonymousClass {

	public static void main(String[] args) {

		//1. 객체 생성 및 메소드 호출
		A a = new A();
		a.abc();		// 인스턴스 이너 클래스
		
		
	}

}
