package Chap10.Ex04;

//�޼ҵ� �������̵�(Method Overriding)
//1. ��� ���迡���� ����
//2. �θ� Ŭ�������� ����� �޼ҵ带 �ڽ� Ŭ�������� ���Ӱ� �����ؼ� ����ϴ� ��
//3. @Override ��� ������̼��� ����ϸ� �޼ҵ� �����ǽ� ������ ���� �� �ִ�.
//4. �ñ״�ó�� ���ƾ� �Ѵ�. (�޼ҵ��, �Ű����� Ÿ��, �Ű����� ����)
//5. �޼ҵ��� ���� �����ڰ� ���ų� �о�� ��

class A {
	void print() {
		System.out.println("A class");
	}
}

class B extends A{
	@Override	
	//�޼ҵ� �������̵� �� - �ݵ�� �θ��� �޼ҵ带 ������ �ϵ��� ����
	//@Override ������̼��� ����ϸ�
	//.. ��Ÿ or ���Ŀ� ���� ���� ��� �� Ȯ�ΰ���
	// why? �ٸ��� ���� ������ �޼ҵ�� ���ǵǴϱ�
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
