package Chap0607.Ex02;

class B {
	static String name = "BTS";
	
	//static Ű�� �Ҵ�Ǹ� ��ü ���� ���� ȣ��
	
	
	static void print () {
		System.out.println(name);
		System.out.println("static�� ���� �޼ҵ��Դϴ�.");
	}
	
	
	
}


public class MethodOverloading {

	public static void main(String[] args) {

		//�޼ҵ� �����ε� : �ϳ��� �޼ҵ�� �Ű����� Ÿ��, ������ ���� ���� �ٸ��� ȣ��� (Java)
		//�޼ҵ� �������̵� : ��ӿ��� �θ� Ŭ������ �޼ҵ带 ������ �ؼ� ���		
		
		//static : ��ü ���� ���� �ٷ� ȣ���ؼ� ��밡�� �ϵ��� �ϴ� Ű����
				// ��ü �̸��� �ƴ϶� Ŭ���� �̸����� ȣ���ؼ� ��� ����
		
		System.out.println(B.name);		// static �� ������ ��ü�̸��� �ƴ� Ŭ���� �̸����� ȣ�� ����
		B.print();						// Ŭ���� �̸����� ȣ��
		System.out.println("===========");
		
		
		
		
		print1();		//'static' Ű�� �� �ְ�, '������ Ŭ����'�� ������ �޼ҵ�� �ٷ� ȣ�� ����
		print1(3);		//�Ű������� 1 �� �̰�, ���� Ÿ���� �޼ҵ带 ȣ���Ѵ�.
		print1(3.0);	//�Ű������� 1 �� �̰�, double Ÿ���� �޼ҵ带 ȣ���Ѵ�.
		print1(3, 4);	//�Ű������� 2 �� �̰�, ���� Ÿ���� �޼ҵ带 ȣ���Ѵ�.
		
		
		
	}

	//�޼ҵ� �������̵� : �޼ҵ� �̸��� ���� / �Ű�����Ÿ��, �谳���� ������ ���� �ش� �޼ҵ带 ȣ��
		//JVM�� ������ �޼ҵ� �̸��� ������ Ÿ���̳� ������ ���� �ش� �޼ҵ带 �۵�
			//���� : ������ �Ű����� Ÿ�԰� ������ ������ ���� �߻�   -> �ΰ����� ������ �� ������ ����
	
	public static void print1() {				// �޼ҵ� �̸� �տ� static :
		System.out.println("�����Ͱ� �����ϴ�.");
	}
	
	public static void print1 (int a) {
		System.out.println("���� : " + a);
	}
	
	public static void print1 (double a) {
		System.out.println("double : " + a);
	}
	
	public static void print1 (int a, int b) {
		System.out.println("a : " + a + ",  b : " + b);
	}
	
//	public static void print1 (double k) {   // ���� print1 (double e) ��
//		System.out.println(k);				// �Ű����� 1, ������ Ÿ�� double �� ���Ƽ� ���� �߻�
//	}
	
	
	
	
	
	
	
}
