package Chap13.Ex02;

// �̳�Ŭ������ �ʵ�� �޼ҵ� ���� ���

// �̳� Ŭ�������� �ܺ� Ŭ������ �ߺ��� �ʵ峪 �޼ҵ带 ȣ���� ���
// ��Ӱ��� ó�� super. �� �ƴ� A.this.a ���

/*
 	�������̵�
 		. �θ�� �ڽ��� ��� ���迡 �־�� ��
 		. �ν��Ͻ� �޼��� �������̵�
 		. �ν��Ͻ� �ʵ�, static �ʵ�, static �޼ҵ�� �������̵� ���� ����
 		. 
 	
 */


class A {
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;

	// class B �� ���� �������̵� ���� ����
	// ? ���� Ŭ������ �޼���� ������ ������ ��ġ�ϱ� ������ (������ �̸��̴���(��� �̸��� ��� ����))
	void abc() {
		System.out.println("A class, abc()");
	}
	
	// �̳� Ŭ�������� �ܺ� Ŭ������ �ߺ��� �ʵ峪 �޼ҵ带 ȣ���� ���
	// ��Ӱ��� ó�� super. �� �ƴ� A.this.a ���
	class B {
		int a = 5;
		int b = 6;

		//�������̵��� �ƴ� ������ �޼��� ��.
		void abc() {
			System.out.println("B class, abc()");
		}
		void bcd() {
			//1. �ڱ��ڽ��� �ʵ�� �޼��� ȣ��(�̳� Ŭ������ �ʵ�� �޼ҵ�)
			System.out.println(a);			//5		this.a
			System.out.println(b);			//6		this.b
			abc();							//		this.abc()
			
			//2. Outer Ŭ������ �ʵ�� �޼ҵ� ȣ��
			System.out.println(A.this.a);	//3		A.this.a �ƿ��� Ŭ������ �ʵ尪 ȣ��
			System.out.println(A.this.b);	//4		super. ��� �� ��
			
			A.this.abc();
			//3. Outer Ŭ������ �ʵ�� �޼ҵ� ȣ��
			System.out.println(c);			//33
			System.out.println(d);			//44
		}
	}
}


public class InnerClass_2 {

	public static void main(String[] args) {

		//1. �ܺ� Ŭ���� ��ü ����
		A a = new A();
		//2. �̳� Ŭ���� ��ü ����
		A.B b = a.new B();
		
		a.abc();
		b.abc();
		System.out.println("============");
		b.bcd();
		System.out.println("============");
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
		
	}

}
