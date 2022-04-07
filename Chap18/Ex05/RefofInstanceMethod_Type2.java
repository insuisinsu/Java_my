package Chap18.Ex05;

//���ٽ��� Ȱ��
//1. �͸� �̳� Ŭ������ Ȱ���ϴ� ���
//2. �޼��� ���� (1. �ν��Ͻ� �޼��� ����, 2. ����(static) �޼ҵ� ����)
//	�޼ҵ� ���� : �����Ǿ� �ִ� �޼ҵ带 ����

//<���� �޼ҵ� ����>
interface A{
	void abc();
}

class B {
	static void bcd() { 			//static(�����޼ҵ�) Ŭ���� �̸����� ȣ�� ����
		System.out.println("�޼���");
	}
}

public class RefofInstanceMethod_Type2 {

	public static void main(String[] args) {

		//2. ���� �޼ҵ� ����
		//�̳� Ŭ������ ó��
		A a1 = new A() {
			public void abc() {
				B.bcd(); 			//static �� ����� ���� �޼ҵ�� ��ü ���� ���� ȣ�� ����
			}
		};
		
		//���ٽ� ǥ��
		A a2 = () -> {B.bcd();};
		
		//���� �޼ҵ� ����
		A a3 = B :: bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
	}

}
