package Chap13.Ex03;

/*
 	static �̳� Ŭ���� : �ܺ� Ŭ������ �ν��Ͻ� �ʵ�, �ν��Ͻ� �޼ҵ�� ������ �Ұ�
 						--> ��ü �ʿ�
 				but, �ܺ� Ŭ������ static �ʵ�, �޼ҵ�� ���� ����
 */

class A{
	
	//�ν��Ͻ� �ʵ� : ��ü ���� �� ���� ����
	int a = 3;
	
	//static �ʵ� : ��ü ���� ���̵� ���� ����
	static int b = 4;
	
	//�ν��Ͻ� �޼ҵ� : ��ü ���� �� ���� ����
	void method1() {
		System.out.println("instance Method");
	}
	
	//static �޼ҵ� : ��ü ���� ���̵� ���� ����
	static void method2() {
		System.out.println("static Method");
	}
	
	//static inner class : �ܺ� ��ü�� �������� �ʰ� ��ü ���� ����
	static class B {
		
		//1. static Ŭ�������� �ܺ� Ŭ������ �ʵ� ���� ? (���� �Ұ�)
		void bcd () {
			// �ܺ� Ŭ������ �ν��Ͻ� �ʵ� --> ��ü�� �־�� ���� ������
//			System.out.println(a);
			// �ܺ� Ŭ������ static �ʵ� ���� ���� 
			System.out.println(b);
			
		//2. static Ŭ�������� �ܺ� Ŭ������ �޼ҵ� ȣ��
			// �ܺ� Ŭ������ �ν��Ͻ� �޼ҵ� --> ��ü�� �־�� ���� ������ 
//			method1();
			// �ܺ� Ŭ������ static �޼ҵ� ���� ����
			method2();
		}
	}
}

public class InnerClass_3 {

	public static void main(String[] args) {

		//1. static �̳� Ŭ���� ��ü ����
		// static �̳� Ŭ������ �ܺ� ��ü ���� ���� ��ü ����
		A.B b = new A.B();
		b.bcd();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
