package Chap10.Ex04;

//메소드 오버라이딩(Method Overriding)
//1. 상속 관계에서만 가능
//2. 부모 클래스에서 선언된 메소드를 자식 클래스에서 새롭게 정의해서 사용하는 것
//3. @Override 라는 어노테이션을 사용하면 메소드 재정의시 오류를 줄일 수 있다.
//4. 시그니처가 같아야 한다. (메소드명, 매개변수 타입, 매개변수 갯수)
//5. 메소드의 접근 제어자가 같거나 넓어야 함

class A {
	void print() {
		System.out.println("A class");
	}
}

class B extends A{
	@Override	
	//메소드 오버라이딩 시 - 반드시 부모의 메소드를 재정의 하도록 설정
	//@Override 어노테이션을 사용하면
	//.. 오타 or 형식에 맞지 않을 경우 등 확인가능
	// why? 다르게 쓰면 벼개의 메소드로 정의되니까
	void print() {
		System.out.println("B class");
	}
}

public class MethodOverriding_01 {

	public static void main(String[] args) {

		A aa = new A();
		aa.print();
		
		B bb = new B();
		bb.print();
		
		A ab = new B();
		ab.print();
		
	}

}
