package Chap13.Ex08.Ex01;

/*3. �޼ҵ��� �Ű������� ����
 	1. Ŭ������ o, �������� o
 	2. Ŭ������ o, �������� x 
 	
*/

//�������̽� : �߻� �޼ҵ带 ����
interface A {
	//�߻� �޼ҵ�	: public abstract �� �����Ǿ� ����
	public abstract void cry();
	void fly();		
}

// interface A �� ������ class B
class B implements A{
	@Override
	public void cry() {
		System.out.println("�۸� : �Ű����� ����");
	}
	@Override
	public void fly() {
		System.out.println("���� �� �� : �Ű����� ����");
	}	
}

class C {
// C ��ü�� abc() ȣ�� �� A Ÿ���� �Ű����� �ʿ�
	void abc(A a) {
		//���� �ڽ� Ŭ������ �Ű������� ���� ��� A Ÿ������ �ڵ����� ��ĳ���� ��
		a.cry();
		a.fly();
	}
}



public class AnonymousClass_3_1 {

	public static void main(String[] args) {
		//1. Ŭ������ o , �������� o
		C c = new C();
		A a = new B();
		c.abc(a);
		
		//2. Ŭ������ o, �������� x
		c.abc(new B());
		
		
	}

}
