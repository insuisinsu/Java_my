package Chap13.Ex08;

//Ŭ���� ���� �� ���� ������ ��� / �̻���� ��� �Ű������� ��ü ����

interface A{
	public abstract void abc();
}

//1. �ڽ� Ŭ������ ���� ����
class B implements A{
	@Override
	public void abc() {
		System.out.println("�Ű����� ����");
	}
}

	//cde() �� ��ǲ������ A Ÿ���� ��ü a �� �Է�
class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_3 {

	public static void main(String[] args) {

		//1. Ŭ������ o + ���� ������ o
		C c = new C();
		A b = new B();	//���� ���� ����
		
		c.cde(b);		//�Ű������� ��ü a�� �����ؼ� ��
		System.out.println("=====");
		
		//2. Ŭ���� �� o + ���� ������ x
		c.cde(new B());
	}

}
