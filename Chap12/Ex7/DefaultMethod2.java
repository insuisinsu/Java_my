package Chap12.Ex7;

interface A{
	default void abc() {
		System.out.println("A interface abc()");
	}
}

class B implements A{
	public void abc() {	
		//super.abc 는 Object 클래스의 abc() 호출
		A.super.abc();
		System.out.println("B class abc()");
	}
}

public class DefaultMethod2 {

	public static void main(String[] args) {

		//1. 객체 생성
		B b = new B();
		
		//2. 메소드 호출
		b.abc();
		
		System.out.println("=================");
		A a1 = new B();
		a1.abc();
		
	}

}
