package Chap13.Ex04;

/*
 	���� �̳�Ŭ����
 	. Ŭ������ �޼ҵ� ���ο� ����� Ŭ����
 	. �޼ҵ� ������ �ʵ�� final Ű�� �����Ǿ� ����
 		-> �� ���� �Ұ�
	. ���� �̳� Ŭ�������� ���Ǵ� ���� ������ �ڵ����� final �� �����
 */

class A{
	A(){}
	//�ʵ� : Heap ������ ����, ������ �ʱ�ȭ ��
	int a = 3;
	//�ʵ��� �ʱⰪ�� �����Ϸ��� ��ü�� �����Ͽ� �����ؾ� ��
	//�����ڳ� setter �� ���ؼ� �ʱⰪ�� �Ҵ� �� ��ü�� ����
	
	//������
	A(int a){
		this.a = a;
	}
	//setter
	public void setA(int a) {
		this.a = a;
	}
	
	
	void ccc() {
		// �������� : �޼��� ������ ����, Stack ������ ����� -> ������ �ʱ�ȭ �ȵ�
		int a = 3;
		a = 4;
		a = 10;
		int b;
		
		System.out.println(a);
//		System.out.println(b);		--> b �� ���� �ʱ�ȭ ���� �ʾ� ���� �߻�
	}
	
	void abc() {
		
		//���� ���� : �޼ҵ� ���ο� ����� ����  / stack ������ ����
		// final Ű�� �ڵ����� ������ �� = �����Ǿ� ����
		int b = 51;
		//���� inner class
		class B{
//			b = 32;
			void bcd() {
				int c = 6;
				System.out.println("�ʵ�� ������ a : "+a);	//�ʵ�
//				System.out.println(b); 	//��������
				System.out.println("���� �̳� Ŭ���� �ȿ� �ִ� �޼ҵ忡�� ������ c : "+c);
				a = 5;
//				b = 7;		���������� �����Ϸ��� ���� �ڵ����� final Ű�� �ٱ� ������ ���� �Ұ�
				c = 10;
				System.out.println("���� �̳� Ŭ�������� ������ �ʵ� a : "+a);
				System.out.println("���� �̳� Ŭ���� �ȿ� �ִ� �޼ҵ忡�� ������ c �� ������ c : "+c);
			}
		}
		B bb = new B();
		bb.bcd();
		b = 41;
		System.out.println("�������� b �� ������ b : "+b);
	}
}

public class InnerClass_4 {

	public static void main(String[] args) {

		// ��ü ���� �� �޼ҵ� ȣ��
		A a = new A();
		a.abc();
		
		
		
	}

}
