package Chap18.Ex02;

//���ٽ� ����

// �Ʒ� 4 ���� �������̽��� �Լ��� �������̽� ��.
// -> ���ٽ����� ����!
@FunctionalInterface
interface A {			//�Է� X, ����X
	void method1();
}

@FunctionalInterface
interface B {			//�Է� O, ����X
	void method2(int a);
}

@FunctionalInterface
interface C {			//�Է� X, ����O
	int method3();
}

@FunctionalInterface
interface D{			//�Է� O, ����O
	double method4(int a, int b);
}


public class FunctionToLambdaExpression {

	public static void main(String[] args) {

//		�������̽��� �������� ���� �Լ��� ���ٽ����� ����
		
//		1. �Է� X, ���� X
//		1) �͸� �̳�Ŭ������ ó��
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("method1 - �͸��̳�Ŭ����");
			}
		};
		a1.method1();
		
//		2) ���ٽ����� ó��
//		   ���ٽ��� '���� Ÿ��', '�޼ҵ� �̸�' �� �����ϸ� ��
//		   (��ǲ) -> {������}; 
		//���ٽ� ��ü
		A a2 = () -> {System.out.println("method1 - ���ٽ�, �⺻");};

		//�����ο� �� ���θ� ������ �� {}; ���� ����
		A a3 = () -> System.out.println("method1 - ���ٽ�, ���");
		
		a2.method1();
		a3.method1();
		
//		2. �Է� O, ���� X
//		1) �͸� �̳� Ŭ������ ó��
		
		B b1 = new B() {
			public void method2(int a) {
				System.out.println("method2 - �͸� �̳� Ŭ���� - " + a);
			};
		};
		b1.method2(0);
		
//		2) ���ٽ����� ó��
		B b2 = (int a) -> {System.out.println("method2 - ���ٽ�, �⺻ - "+a);};
		b2.method2(0);
		B b3 = (a) -> {System.out.println("method2 - ���ٽ�, ���1 - " + a);}; 	//�Է� �Ű������� Ÿ���� ���� ����
		b3.method2(0);
		B b4 = (a) -> System.out.println("method2 - ���ٽ�, ���2 - " + a);		//���๮�� �� ������ �� { }; ���� ����
		b4.method2(0);
		B b5 = a -> System.out.println("method2 - ���ٽ�, ���3 - " + a);		//�Է� �Ű������� �ϳ��� �� () ���� ����
		b5.method2(0);
		
//		3. �Է�X, ����O
//		1) �͸� �̳� Ŭ����
		C c1 = new C() {
			public int method3() {
				return 3;
			};
		};
		System.out.println("method3 - �͸� �̳� Ŭ���� - " + c1.method3());
		
//		2) ���ٽ����� ó��
		C c2 = () -> {return 3;};
		System.out.println("method3 - ���ٽ�, �⺻ - " + c2.method3());
		C c3 = () -> 3;													//������ �� ������ �� {return } ���� ����
		System.out.println("method3 - ���ٽ�, �⺻ - " + c3.method3());
		
//		4. �Է� O, ���� O
//		1) �͸� �̳� Ŭ����
		D d1 = new D() {
			public double method4(int a, int b) {
				return a+b;
			};
		};
		System.out.println("method4 - �͸� �̳� Ŭ���� - "+d1.method4(1, 2));
		
//		2) ���ٽ�
		D d2 = (int a, int b) -> {return a + b;};
		System.out.println("method4 - ���ٽ�, �⺻ - " + d2.method4(1, 2));
		D d3 = (a, b) -> {return a + b;};		//��ǲ Ÿ���� ���� ����
		D d4 = (a, b) -> a + b;					//������ �ϳ��� �� return �� {} ���� ����  // �Ű������� 2�� �̻��̸� () ���� �Ұ�
		

		
		
		
		
		
		
		
		
	}

}
