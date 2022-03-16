package Chap10.Ex06.Ex01;

class A {
//	A(){
//		System.out.println("A class 기본 생성자");
//	}
	A(int a){
		System.out.println("A class, 매개변수로 정수 1개를 받는 생성자  "+a);
	}
	A(int a, int b){
		System.out.println("A class, 매개변수로 정수 2개를 받는 생성자  "+a+", "+b);
	}
}
class B extends A{
	B(){
		super(5);
		System.out.println("B class 기본 생성자");
	}
}

class C extends B{
	C(){
		//super();	생략
		System.out.println("C class 기본 생성자");
	}
}

public class SuperMethod_2 {

	public static void main(String[] args) {
		
		C c = new C();
	
		
		
	}

}
