package Chap10.Ex06;

class A{
	void abc() {
		System.out.println("A class, abc()");
	}
}
class B extends A {
	void abc() {
		System.out.println("B class, abc()");
	}
	void bcd() {
		super.abc();					
		abc();						//this.abc(); / 자기 자신의 객체
	}
}
public class SuperKeyword_1 {

	public static void main(String[] args) {

		//1. 객체 생성
		B bb = new B();
		//2. 메소드 호출
		bb.bcd(); 		
		
	}

}
