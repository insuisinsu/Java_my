package Chap0607.Ex06;

//���� �ʱ�ȭ ���
//�����ڿ� ���� static �ʵ��� ���� ȣ���� �� �ʱ�ȭ �ϴ� ����

//�����ڿ� static ���
//������ : �ν��Ͻ� �ʵ� �ʱ�ȭ + static �ʵ� ���� �ʱ�ȭ
//static ��� : static �ʵ� �ʱ�ȭ

class E{
	
	int a;
	static int b;			//��ü ���� ���� ȣ�� ����
	
	//����(static) �ʱ�ȭ ���
	//��ü ���� ���� Ŭ���� ������ ȣ���� �� �ʱ�ȭ �����ִ� ����
	//
	static {
		b = 5;
		int d = 12;
		System.out.println("Ŭ���� E �� �ε�Ǿ����ϴ�. ���� b : "+b+" "+d);
	}
	
	static {
		b = 7;
		System.out.println("Ŭ���� E �� �ε�Ǿ����ϴ�. ���� b : "+b);
	}
	
	//������ : ��üȭ�� �� �� �ʵ��� �� �ʱ�ȭ ������
	E(){
		a=3;
		b=10;
	}
	
}

public class Static_03 {

	public static void main(String[] args) {
		
		//��ü ���� ���� E.b  ȣ��� �� static ����� �۵��� -> static �� �� �ʱ�ȭ
								
		System.out.println(E.b);	
		
		
		
	}

}
