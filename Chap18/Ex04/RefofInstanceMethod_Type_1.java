package Chap18.Ex04;

//���ٽ��� Ȱ��
//1. �͸� �̳� Ŭ������ ȭ���ϴ� ���
//2. �޼��� ���� (1. �ν��Ͻ� �޼��� ����, 2. ���� �޼ҵ� ����)

interface A{
	void abc();
}

class B {
	void bcd() {		//�ν��Ͻ� �޼ҵ� : ��üȭ �ؾ� ȣ�� ����
		System.out.println("�޼���");
	}
}

public class RefofInstanceMethod_Type_1 {

	public static void main(String[] args) {

		//1. �ν��Ͻ� �޼ҵ� ���� type 1
		A a1 = new A() {
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		
		//�� �ó������� ���ٽ����� ǥ��
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		//�ν��Ͻ� ���� ǥ���� type 1
		B b = new B();	//�ν��Ͻ� ��ü�� ����, ��ü��::�޼ҵ��
		A a3 = b::bcd;	//<- �ν��Ͻ� ���� ǥ�� <- ���� Ÿ���� ���ƾ� �� + �Ű������� �����ؾ� ��
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
		
		
	}

}
