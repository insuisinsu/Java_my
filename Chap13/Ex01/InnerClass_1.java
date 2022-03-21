package Chap13.Ex01;

/*
 	이너 클래스 ( inner class)
 	: 클래스 내부의 클래스
 	
 	1. 인스턴스 이너클래스
 		. static 이 없는 내부 클래스
 	2. static (정적) 이너클래스
 		. static 이 있는 내부 클래스
	3. 지역 이너클래스
		. 클래스의 인스턴스 메서드 내부에 있는 클래스
		
	특징.
		. Out class 의 접근제어자 제한 없이 접근 가능
		. 다른 객체를 생성하지 않아도 객체의 필드나 메서드에 빠르게 접근 가능
		
	클래스 파일 : A.class , A$B.class 		<-- byte 코드 (중간 언어로)
 */

// Outer class : 모든 접근 제어자는 내부 클래스에서 접근 가능
class A {
	
	//public 다른 패키지에서 접근 가능
	public int a = 3;
	
	//protected 같은 패키지, 상속관계의 다른 패키지 접근 가능
	protected int b = 4;
	
	//default 다른 패키지에서 접근 불가
	int c = 5;
	
	//private 같은 클래스에서만 접근 가능
	private int d = 6;
	
	void abc() {
		System.out.println("A class, abc()");
	}
	
	//인스턴스 Inner class
	//외부 클래스가 객체화 되어야 사용가능
	class B {
		void bcd() {
			//Outer class 필드 접근 가능 여부 확인
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			//Outer class 의 메서드 접근 가능 여부 확인
			abc();
		}
	}
}

public class InnerClass_1 {

	public static void main(String[] args) {

		//1. 외부 객체 생성 - 이너 클래스를 사용하기 위한 단계
		A a = new A();
		
		//2. 내부 클래스 객체 생성
		// 외부클래스 . 내부클래스 변수명 = 외부인스턴스명.new 내부클래스생성자호출;
		A.B b = a.new B();
		
		//3. 내부 클래스의 메서드 호출
		b.bcd();
				
	
		
	}
}
