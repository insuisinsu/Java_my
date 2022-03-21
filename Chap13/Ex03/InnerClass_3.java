package Chap13.Ex03;

/*
 	static 이너 클래스 : 외부 클래스의 인스턴스 필드, 인스턴스 메소드는 접근이 불가
 						--> 객체 필요
 				but, 외부 클래스의 static 필드, 메소드는 접근 가능
 */

class A{
	
	//인스턴스 필드 : 객체 생성 후 접근 가능
	int a = 3;
	
	//static 필드 : 객체 생성 없이도 접근 가능
	static int b = 4;
	
	//인스턴스 메소드 : 객체 생성 후 접근 가능
	void method1() {
		System.out.println("instance Method");
	}
	
	//static 메소드 : 객체 생성 없이도 접근 가능
	static void method2() {
		System.out.println("static Method");
	}
	
	//static inner class : 외부 객체를 생성하지 않고 객체 접근 가능
	static class B {
		
		//1. static 클래스에서 외부 클래스의 필드 접근 ? (접근 불가)
		void bcd () {
			// 외부 클래스의 인스턴스 필드 --> 객체가 있어야 접근 가능함
//			System.out.println(a);
			// 외부 클래스의 static 필드 접근 가능 
			System.out.println(b);
			
		//2. static 클래스에서 외부 클래스의 메소드 호출
			// 외부 클래스의 인스턴스 메소드 --> 객체가 있어야 접근 가능함 
//			method1();
			// 외부 클래스의 static 메소드 접근 가능
			method2();
		}
	}
}

public class InnerClass_3 {

	public static void main(String[] args) {

		//1. static 이너 클래스 객체 생성
		// static 이너 클래스는 외부 객체 생성 없이 객체 생성
		A.B b = new A.B();
		b.bcd();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
