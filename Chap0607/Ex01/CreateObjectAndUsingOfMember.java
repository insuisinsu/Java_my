package Chap0607.Ex01;


//클래스(class) : 객체를 생성하기 위한 틀(템플릿), 설계도, 붕어빵의 틀 
//객체(Object)  : 클래스를 복사해서 RAM 에서 작동되는 실행코드	((설계도에 의해 지어진)집, 붕어빵)
	// 객체 = 인스턴스
	// 인스턴스화(객체화) 시킨다  (메인 메소드에서 객체를 인스턴스화 시켜줘야 한다.
	// A a = new A();		<-- 클래스를 객체화 시켜서 메모리에 로드

class A {				//외부 클래스
	int m = 3 ;			// 필드 (변수) : 클래스 블락에서 선언된 변수
						// 필드는 인스턴스화(객체) 시켜야 사용 가능
						// 필드는 메모리의 Heap 영역에 생성됨
	
	void print() {		// 메소드 : 절차지향언어의 함수(C 언어)
		System.out.println("객체 생성 및 활용");
	}
}

class B {				//외부 클래스
	String name = "홍길동";
	int age = 24;
	String phone = "010-1234-1234";
	
	void printName () {
		System.out.println(name);
	}
	void printAge () {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
	
}



public class CreateObjectAndUsingOfMember {

	public static void main(String[] args) {

		A a = new A();				// Class A 를 객체화(인스턴스화) 시킨다. (RAM에 로드 시킨다.)
		System.out.println(a.m);
		a.print();
		
		System.out.println("===========");
		
		A b = new A();				// Class A 를 객체화(인스턴스화) 시킨다. (RAM에 로드 시킨다.)
		System.out.println(b.m);
		b.print();
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("==========");
		
		
		B bb = new B();				// Class B 를 bb 라는 이름으로 객체화
		bb.printName();
		bb.printAge();
		bb.printPhone();
		
		B cc = new B();
		cc.printName();
		cc.printAge();
		cc.printPhone();
		
		
		
	
	}

}
