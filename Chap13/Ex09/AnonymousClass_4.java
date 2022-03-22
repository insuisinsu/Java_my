package Chap13.Ex09;

// interface �� ������ class �� ���� ���
//	+ �Ű������� �޴�

interface A{
	void abc();		//public abstract ����
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {
		
		C c = new C();
		//1. interface �� ������ class x, �������� o
		// �������̽��� ������ �ڽ� �͸� ��ü ���� �� Ÿ���� A �� ������ �������� ����
		A a = new A() {
			public void abc() {
				System.out.println("Ŭ����x + ��������o");
			};
		};
		c.cde(a);
		
		//2. interface �� ������ class x, �������� x
		// ���� ���� ��� ( �ӽ÷� �� ���� ���) -> �̺�Ʈ ó�� �� ���
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("Ŭ����x + ��������x");
			}
		});
		
		
		
	}

}
