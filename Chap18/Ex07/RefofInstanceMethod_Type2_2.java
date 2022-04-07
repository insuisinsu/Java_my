package Chap18.Ex07;

//���ٽ��� Ȱ��
//1. �͸� �̳� Ŭ������ ȭ���ϴ� ���
//2. �޼��� ���� (1. �ν��Ͻ� �޼��� ����, 2. ����(static) �޼ҵ� ����)
//	�޼ҵ� ���� : �����Ǿ� �ִ� �޼ҵ带 ����
// 

//<���� �޼ҵ� ����>
interface A{
	public int abc(String str);
}

class B {
	void bcd(int k) {			//�ν��Ͻ� �޼ҵ� : 
		System.out.println(k);
	}
}

public class RefofInstanceMethod_Type2_2 {

	public static void main(String[] args) {
		//�̳� Ŭ����
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}				
			};
		//���� ǥ����
		A a2 = (String str) -> {return str.length();};
		//�ν��Ͻ� �޼ҵ� ���� Type 2
		A a3 = String::length;
		
		System.out.println(a1.abc("�ȳ�"));
		System.out.println(a2.abc("�ȳ��ϼ���"));
		System.out.println(a3.abc("�ȳ� �ϼ���"));
		
		
		
		
		
		
	}

}
