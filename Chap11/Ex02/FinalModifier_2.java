package Chap11.Ex02;

/*
 	final �޼���� final class �� Ư¡
 	
 	final �ʵ��, ���������� ; : Ŭ���� ���� ���� ��� ������ ���� �����, ��ü�� �޼ҵ尡 ����� ��쿡�� ȣ�� ����
 	final �޼ҵ� : �������̵� �Ұ� <- ���� �߿��� �޼ҵ�� �ڽ� Ŭ�������� ������ ���� ���ϵ��� ����
 	final Ŭ���� : ��� �Ұ� <- final �� ���� Ŭ������ ����� �� ����
 */

class A {
	void abc() {}
	final void bcd() {}
}

class BB extends A {
	void abc() {}		// �������̵� �ϸ�, �θ��� �޼ҵ� ����� �ڽ��� ���Ӱ� ���� ������
	// void bcd() {}  // �޼ҵ� �������̵� �Ұ� <- �θ� Ŭ������ final �� ���� �޼ҵ�� ����ؿ� �� ����
}

final class C {}
// class D extends C {}		// Ŭ���� ��� �Ұ�

public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
