package Chap10.Ex06.Ex01;

class A {
//	A(){
//		System.out.println("A class �⺻ ������");
//	}
	A(int a){
		System.out.println("A class, �Ű������� ���� 1���� �޴� ������  "+a);
	}
	A(int a, int b){
		System.out.println("A class, �Ű������� ���� 2���� �޴� ������  "+a+", "+b);
	}
}
class B extends A{
	B(){
		super(5);
		System.out.println("B class �⺻ ������");
	}
}

class C extends B{
	C(){
		//super();	����
		System.out.println("C class �⺻ ������");
	}
}

public class SuperMethod_2 {

	public static void main(String[] args) {
		
		C c = new C();
	
		
		
	}

}
