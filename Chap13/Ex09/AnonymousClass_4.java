package Chap13.Ex09;

// interface 를 구현한 class 가 없는 경우
//	+ 매개변수로 받는

interface A{
	void abc();		//public abstract 생략
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {
		
		C c = new C();
		//1. interface 를 구현한 class x, 참조변수 o
		// 인터페이스를 구현한 자식 익명 객체 생성 후 타입을 A 로 지정한 참조변수 생성
		A a = new A() {
			public void abc() {
				System.out.println("클래스x + 참조변수o");
			};
		};
		c.cde(a);
		
		//2. interface 를 구현현 class x, 참조변수 x
		// 제일 많이 사용 ( 임시로 한 번만 사용) -> 이벤트 처리 시 사용
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("클래스x + 참조변수x");
			}
		});
		
		
		
	}

}
