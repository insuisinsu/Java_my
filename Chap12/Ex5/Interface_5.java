package Chap12.Ex5;


//���1. : ��ü ���� �� ����
//���2. : �͸� Ŭ���� �̿�

//�������̽� ���� : �ַ� ����� ���� ����� ��
interface A{
	double PI = 3.14;
	void run();
}

class B implements A{
	@Override
	public void run() {
		System.out.println("�޷����ô�");
	}
}

public class Interface_5 {

	public static void main(String[] args) {
		//1. ��ü ���� �� ����
		A a = new B();
		a.run();
		
		A a1 = new B() {
			public void run() {
				System.out.println("���ƺ��ô�");
			}
		};
		a1.run();
		
	}

}
