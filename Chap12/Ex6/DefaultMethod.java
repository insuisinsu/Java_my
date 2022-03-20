package Chap12.Ex6;

//Interface 의 default 메소드
// : 인터페이스 내에서 구현부가 있는 메소드
// : 기존의 구현되어 있는 인터페이스에서 새로운 기능을 추가할 때,
//   하위 클래스에서 재정의 필요없이 새로운 기능을 추가할 때 사용
	//java 1.8 이후에 새롭게 추가된 기능
// 이 경우 default 키를 넣어야 한다. 단, 여기서의 default 는 접근지정자가 아님

interface A{
	//2020년 생성한 메소드
	//public abstract 가 생략되었으며 구현부가 없는 추상메소드 임
	void abc(); 		
	//2030년 생성한 메소드
	default void bcd() {	
		System.out.println("A interface, bcd()");
	}
}
	//2020년 생성한 클래스
class B implements A{
	public void abc() {
		System.out.println("B class abc()");
	}
}
	//2030년 생성한 클래스
class C implements A {
	public void abc() {
		System.out.println("C class abc()");
	}
	//default 메소드도 오버라이딩 할 수 있음
	public void bcd() {
		System.out.println("C class bcd()");
	}
}

public class DefaultMethod {

	public static void main(String[] args) {
		//1. 객체 생성
		A a1 = new B();
		A a2 = new C();
		
		//2. 메소드 호출
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
		
		
	}

}
