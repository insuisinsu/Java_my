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
		abc();						//this.abc(); / �ڱ� �ڽ��� ��ü
	}
}
public class SuperKeyword_1 {

	public static void main(String[] args) {

		//1. ��ü ����
		B bb = new B();
		//2. �޼ҵ� ȣ��
		bb.bcd(); 		
		
	}

}
