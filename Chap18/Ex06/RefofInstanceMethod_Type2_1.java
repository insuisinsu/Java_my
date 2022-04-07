package Chap18.Ex06;

//���ٽ��� Ȱ��
//1. �͸� �̳� Ŭ������ ȭ���ϴ� ���
//2. �޼��� ���� (1. �ν��Ͻ� �޼��� ����, 2. ����(static) �޼ҵ� ����)
//	�޼ҵ� ���� : �����Ǿ� �ִ� �޼ҵ带 ����
// 

//<���� �޼ҵ� ����>
interface A{
	void abc(B b, int k);
}

class B {
	void bcd(int k) {			//�ν��Ͻ� �޼ҵ� : 
		System.out.println(k);
	}
}

public class RefofInstanceMethod_Type2_1 {

	public static void main(String[] args) {
		//�ν��Ͻ� �޼ҵ� ���� Type 2
		//1. �͸� �̳� Ŭ����
		A a1 = new A () {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		//2. ���ٽ�
		A a2 = (B b, int k) -> {b.bcd(k);}; 
		
		//3. �ν��Ͻ� �޼ҵ� ����
		A a3 = B::bcd;		//<- �ν��Ͻ� �޼ҵ����� B��ü�� ��ǲ �޾Ƽ� bcd() ȣ��
			//�빮�� ���� ���
			//1. ��ü��::�޼ҵ��;
			//2. ���� �޼ҵ� ȣ���϶�
			//3. �ν��Ͻ� �޼ҵ� ȣ�� ������ �Ű������� ��ü�� ��ǲ�ɶ�
		
		B b = new B();	
		
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
		
		
		
		
		
		
		
		
		
	}

}
