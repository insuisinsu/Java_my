package Chap13.Ex06;

class A {
	// C Ÿ���� B ��ü ����
	C c = new B();
	void abc() {
		c.bcd();
	}
}

//�������̽� C �� �߻�޼��� �����ϴ� B Ŭ����
class B implements C{
	@Override
	public void bcd() {
		System.out.println("�ν��Ͻ� �̳� Ŭ����");
	}
}

// �������̽� : �߻� �޼��� ���� : void bcd()
interface C {
	public abstract void bcd();
}

public class AnonymousClass {

	public static void main(String[] args) {

		//1. ��ü ���� �� �޼ҵ� ȣ��
		A a = new A();
		a.abc();		// �ν��Ͻ� �̳� Ŭ����
		
		
	}

}
