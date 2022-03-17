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
		
		//1. ��ü ����
		A a1 = new A("�ȳ�");
		A a2 = new A("�ȳ�");
		
		//2. �� ��ü �� (== , equals())
		// == : �⺻ Ÿ���� ��� ���� ���ؼ� true or false
		//	  : ���� Ÿ���� ��� ��ü�� ������ ��
		//equals() : ��ü�� ������ ��
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1);
		System.out.println(a2);
		
		B b1 = new B("�ȳ�");
		B b2 = new B("�ȳ�");
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2)); 
		
	}

}
