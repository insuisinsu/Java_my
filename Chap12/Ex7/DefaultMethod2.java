package Chap12.Ex7;

interface A{
	default void abc() {
		System.out.println("A interface abc()");
	}
}

class B implements A{
	public void abc() {	
		//super.abc �� Object Ŭ������ abc() ȣ��
		A.super.abc();
		System.out.println("B class abc()");
	}
}

public class DefaultMethod2 {

	public static void main(String[] args) {

		//1. ��ü ����
		B b = new B();
		
		//2. �޼ҵ� ȣ��
		b.abc();
		
		System.out.println("=================");
		A a1 = new B();
		a1.abc();
		
	}

}
