package Chap10.Ex07.Ex02;

class A{
	String name;
	A (String name){
		this.name = name;
	}
}

class B{
	String name;
	B (String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((B)obj).name) {
			return true;
		} else {
			return false;
		}
	}
}

public class ObjectMethod_equals {

	public static void main(String[] args) {
		
		//1. 객체 생성
		A a1 = new A("안녕");
		A a2 = new A("안녕");
		
		//2. 두 객체 비교 (== , equals())
		// == : 기본 타입일 경우 값을 비교해서 true or false
		//	  : 참조 타입일 경우 객체의 번지를 비교
		//equals() : 객체의 번지를 비교
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1);
		System.out.println(a2);
		
		B b1 = new B("안녕");
		B b2 = new B("안녕");
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2)); 
		
	}

}
