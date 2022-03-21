package Chap13.Ex04;

/*
 	지역 이너클래스
 	. 클래스의 메소드 내부에 선언된 클래스
 	. 메소드 내부의 필드는 final 키가 생략되어 있음
 		-> 값 수정 불가
	. 지역 이너 클래스에서 사용되는 지역 변수는 자동으로 final 로 선언됨
 */

class A{
	A(){}
	//필드 : Heap 영역에 저장, 강제로 초기화 됨
	int a = 3;
	//필드의 초기값을 수정하려면 객체를 생성하여 수정해야 함
	//생성자나 setter 를 통해서 초기값을 할당 후 객체를 생성
	
	//생성자
	A(int a){
		this.a = a;
	}
	//setter
	public void setA(int a) {
		this.a = a;
	}
	
	
	void ccc() {
		// 지역변수 : 메서드 내부의 변수, Stack 영역에 저장됨 -> 강제로 초기화 안됨
		int a = 3;
		a = 4;
		a = 10;
		int b;
		
		System.out.println(a);
//		System.out.println(b);		--> b 의 값이 초기화 되지 않아 오류 발생
	}
	
	void abc() {
		
		//지역 변수 : 메소드 내부에 선언된 변수  / stack 영역에 저장
		// final 키가 자동으로 컴파일 됨 = 생략되어 있음
		int b = 51;
		//지역 inner class
		class B{
//			b = 32;
			void bcd() {
				int c = 6;
				System.out.println("필드로 선언한 a : "+a);	//필드
//				System.out.println(b); 	//지역변수
				System.out.println("지역 이너 클래스 안에 있는 메소드에서 선언한 c : "+c);
				a = 5;
//				b = 7;		지역변수는 컴파일러에 의해 자동으로 final 키가 붙기 때문에 변경 불가
				c = 10;
				System.out.println("지역 이너 클래스에서 수정한 필드 a : "+a);
				System.out.println("지역 이너 클래스 안에 있는 메소드에서 선언한 c 를 수정한 c : "+c);
			}
		}
		B bb = new B();
		bb.bcd();
		b = 41;
		System.out.println("지역변수 b 를 수정한 b : "+b);
	}
}

public class InnerClass_4 {

	public static void main(String[] args) {

		// 객체 생성 후 메소드 호출
		A a = new A();
		a.abc();
		
		
		
	}

}
