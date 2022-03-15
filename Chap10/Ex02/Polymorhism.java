package Chap10.Ex02;

//다형성(Polymorhism) : 객체의 상속 관계에서 여러 여러 데이터 타입으로 변환 가능

class A{}
class B extends A {}
class C extends B {}
class D extends B {}


public class Polymorhism {
	public static void main(String[] args) {

		//1. 업캐스팅 (자동으로 변환) : 생략시 컴파일러가 자동으로 추가

		//A ac = (A) new C();
		A ac = new C();			// C -> A , C 는 A 이다.
		//ac는 A, B, C 의 필드와 메소드를 모두 포함,, A 의 필드와 메소드만 접근
		A ab = new B();
		
		//객체 생성을 할 수 없는 경우(상속)
		
		
		//컴파일 오류 : 프로그램 실행 전 이클립스가 체크
		//런타임 오류 : 실행시 바랭되는 오류
	}

}
