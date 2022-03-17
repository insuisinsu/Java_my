package Chap11.Ex02;

/*
 	final 메서드와 final class 의 특징
 	
 	final 필드명, 지역변수명 ; : 클래스 영역 내의 상수 영역에 값이 복사됨, 객체나 메소드가 사라질 경우에도 호출 가능
 	final 메소드 : 오버라이딩 불가 <- 아주 중요한 메소드는 자식 클래스에서 재정의 하지 못하도록 설정
 	final 클래스 : 상속 불가 <- final 이 붙은 클래스를 상속할 수 없음
 */

class A {
	void abc() {}
	final void bcd() {}
}

class BB extends A {
	void abc() {}		// 오버라이딩 하면, 부모의 메소드 기능을 자식이 새롭게 구현 가능함
	// void bcd() {}  // 메소드 오버라이딩 불가 <- 부모 클래스의 final 이 붙은 메소드는 상속해올 수 없음
}

final class C {}
// class D extends C {}		// 클래스 상속 불가

public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
