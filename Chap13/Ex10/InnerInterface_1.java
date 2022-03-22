package Chap13.Ex10;

/*이너인터페이스(InnerInterface)
 	: 클래스 내부의 인터페이스가 선언, 외부클래스를 간단하게 사용할 목적
 		클래스 내부에 선언.
		static 이 컴파일러에 의해 자동으로 생성
*/

class A{
	interface B{		// static 생략
		void bcd ();	// public abstract 생략
	}
}

//이너 인터페이스를 구현한 클래스 C
//	A.B : A 클래스의 이너인터페이스 B
//	A,B : 인터페이스 A, 인터페이스 B


class C implements A.B{
	@Override
	public void bcd() {
		System.out.println("이너인터페이스를 구현한 클래스 C");
	}
}

public class InnerInterface_1 {

	public static void main(String[] args) {

		//1. 자식 객체를 직접 생성 후 출력 (단, 자식 클래스가 구현된 경우)
		
		//1) 부모의 타입으로 업캐스팅 후 오버라이딩을 통해 출력
		A.B ab = new C();
		ab.bcd();
		
		//2) C 자기 자신의 메서드를 직접 호출
		C c = new C();
		c.bcd();
		
		//2. 익명 이너클래스로 출력 (자식 클래스 없이 출력)
		
		// A.B b = new A.B(); 는 인터페이스 타입이라 객체 생성 불가함
		// -> 오버라이딩 해서 출력해야 함
		A.B b = new A.B() {
			@Override
			public void bcd() {
				System.out.println("익명 이너클래스로 객체 생성 후 출력");
			}
		};		
		b.bcd();
	}

}
