package Chap13.Ex07;

// �͸� �̳�Ŭ������ ����Ͽ� �������̽� ��ü �� 


class A {
	C c = new C() {
		public void bcd() {
			System.out.println("�͸� �̳� Ŭ����");
		}
	};
	
	void abc() {
		c.bcd();
	}
}

interface C {
	public abstract void bcd();
}


public class AnonymousClass_2 {

	public static void main(String[] args) {

		A a = new A();
		a.abc();		
		
	}

}
