package Chap13.Ex01;

/*
 	�̳� Ŭ���� ( inner class)
 	: Ŭ���� ������ Ŭ����
 	
 	1. �ν��Ͻ� �̳�Ŭ����
 		. static �� ���� ���� Ŭ����
 	2. static (����) �̳�Ŭ����
 		. static �� �ִ� ���� Ŭ����
	3. ���� �̳�Ŭ����
		. Ŭ������ �ν��Ͻ� �޼��� ���ο� �ִ� Ŭ����
		
	Ư¡.
		. Out class �� ���������� ���� ���� ���� ����
		. �ٸ� ��ü�� �������� �ʾƵ� ��ü�� �ʵ峪 �޼��忡 ������ ���� ����
		
	Ŭ���� ���� : A.class , A$B.class 		<-- byte �ڵ� (�߰� ����)
 */

// Outer class : ��� ���� �����ڴ� ���� Ŭ�������� ���� ����
class A {
	
	//public �ٸ� ��Ű������ ���� ����
	public int a = 3;
	
	//protected ���� ��Ű��, ��Ӱ����� �ٸ� ��Ű�� ���� ����
	protected int b = 4;
	
	//default �ٸ� ��Ű������ ���� �Ұ�
	int c = 5;
	
	//private ���� Ŭ���������� ���� ����
	private int d = 6;
	
	void abc() {
		System.out.println("A class, abc()");
	}
	
	//�ν��Ͻ� Inner class
	//�ܺ� Ŭ������ ��üȭ �Ǿ�� ��밡��
	class B {
		void bcd() {
			//Outer class �ʵ� ���� ���� ���� Ȯ��
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			//Outer class �� �޼��� ���� ���� ���� Ȯ��
			abc();
		}
	}
}

public class InnerClass_1 {

	public static void main(String[] args) {

		//1. �ܺ� ��ü ���� - �̳� Ŭ������ ����ϱ� ���� �ܰ�
		A a = new A();
		
		//2. ���� Ŭ���� ��ü ����
		// �ܺ�Ŭ���� . ����Ŭ���� ������ = �ܺ��ν��Ͻ���.new ����Ŭ����������ȣ��;
		A.B b = a.new B();
		
		//3. ���� Ŭ������ �޼��� ȣ��
		b.bcd();
				
	
		
	}
}
