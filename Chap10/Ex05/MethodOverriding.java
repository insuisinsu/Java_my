package Chap10.Ex05;

//기본 생성자 : 클래스 내의 다른 생성자가 존재하지 않을 경우 생략 가능

//인스턴스 메소드 오버라이딩
// : 상속관계에서 메소드 오버라이딩은 인스턴스 메소드만 오버라이딩된다.
//	상속관계에서 인스턴스 필드, stack 필드, static 메소드는 오버라이징 되지 않음
//  오버라이딩 할 때는 시그니쳐가 같아야 함. (리턴타입, 메소드명, 매개변수 타입과 갯수)
class A {
	
	A (){}
	
	void print() {
		System.out.println("Class A");
	}
}

class B extends A{

	@Override
	void print() {
		System.out.println("Class B");
	}
}

class C extends A {
	
	@Override
	void print() {
		System.out.println("class C");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		//1. A 타입, A 생성자
		A a = new A ();
		a.print();
		
		//2. B 타입, B 생성자
		B b = new B ();
		b.print();
		
		//3. C 타입, C 생성자
		C c = new C ();
		c.print();
		System.out.println();
		//4. A 타입, B 생성자
		//B 가 A 에 오버라이딩 되어, A 타입이지만 B 의 메소드 출력
		A ab = new B();
		ab.print();
		//A 의 print() 메소드 호출 --> B 의 print() 메소드 출력
		System.out.println("0==");
		A ac = new C();
		ac.print();
		
		//5.
		A[] arr = {ab, ac};
		System.out.println("for============");
		for(int i = 0; i < arr.length ; i++) {
			arr[i].print();
		}
		
		System.out.println("향상된 for=======");
		for(A k : arr) {
			k.print();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
