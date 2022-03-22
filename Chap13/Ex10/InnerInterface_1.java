package Chap13.Ex10;

/*�̳��������̽�(InnerInterface)
 	: Ŭ���� ������ �������̽��� ����, �ܺ�Ŭ������ �����ϰ� ����� ����
 		Ŭ���� ���ο� ����.
		static �� �����Ϸ��� ���� �ڵ����� ����
*/

class A{
	interface B{		// static ����
		void bcd ();	// public abstract ����
	}
}

//�̳� �������̽��� ������ Ŭ���� C
//	A.B : A Ŭ������ �̳��������̽� B
//	A,B : �������̽� A, �������̽� B


class C implements A.B{
	@Override
	public void bcd() {
		System.out.println("�̳��������̽��� ������ Ŭ���� C");
	}
}

public class InnerInterface_1 {

	public static void main(String[] args) {

		//1. �ڽ� ��ü�� ���� ���� �� ��� (��, �ڽ� Ŭ������ ������ ���)
		
		//1) �θ��� Ÿ������ ��ĳ���� �� �������̵��� ���� ���
		A.B ab = new C();
		ab.bcd();
		
		//2) C �ڱ� �ڽ��� �޼��带 ���� ȣ��
		C c = new C();
		c.bcd();
		
		//2. �͸� �̳�Ŭ������ ��� (�ڽ� Ŭ���� ���� ���)
		
		// A.B b = new A.B(); �� �������̽� Ÿ���̶� ��ü ���� �Ұ���
		// -> �������̵� �ؼ� ����ؾ� ��
		A.B b = new A.B() {
			@Override
			public void bcd() {
				System.out.println("�͸� �̳�Ŭ������ ��ü ���� �� ���");
			}
		};		
		b.bcd();
	}

}
