package Chap13.Ex02;

// 이너클래스의 필드와 메소드 접근 방법

// 이너 클래스에서 외부 클래스의 중복된 필드나 메소드를 호출할 경우
// 상속관계 처럼 super. 이 아닌 A.this.a 사용

/*
 	오버라이딩
 		. 부모와 자식이 상식 관계에 있어야 함
 		. 인스턴스 메서드 오버라이딩
 		. 인스턴스 필드, static 필드, static 메소드는 오버라이딩 되지 않음
 		. 
 	
 */


class A {
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;

	// class B 에 의해 오버라이딩 되지 않음
	// ? 내부 클래스의 메서드는 별개의 공간에 위치하기 때문에 (동일한 이름이더라도(사실 이름은 상관 없지))
	void abc() {
		System.out.println("A class, abc()");
	}
	
	// 이너 클래스에서 외부 클래스의 중복된 필드나 메소드를 호출할 경우
	// 상속관계 처럼 super. 이 아닌 A.this.a 사용
	class B {
		int a = 5;
		int b = 6;

		//오버라이딩이 아닌 별개의 메서드 임.
		void abc() {
			System.out.println("B class, abc()");
		}
		void bcd() {
			//1. 자기자신의 필드와 메서드 호출(이너 클래스의 필드와 메소드)
			System.out.println(a);			//5		this.a
			System.out.println(b);			//6		this.b
			abc();							//		this.abc()
			
			//2. Outer 클래스의 필드와 메소드 호출
			System.out.println(A.this.a);	//3		A.this.a 아웃터 클래스의 필드값 호출
			System.out.println(A.this.b);	//4		super. 사용 안 함
			
			A.this.abc();
			//3. Outer 클래스의 필드와 메소드 호출
			System.out.println(c);			//33
			System.out.println(d);			//44
		}
	}
}


public class InnerClass_2 {

	public static void main(String[] args) {

		//1. 외부 클래스 객체 생성
		A a = new A();
		//2. 이너 클래스 객체 생성
		A.B b = a.new B();
		
		a.abc();
		b.abc();
		System.out.println("============");
		b.bcd();
		System.out.println("============");
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
		
	}

}
