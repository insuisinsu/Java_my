package Chap0607.Ex06;

class Aaa{
	//�ʵ�(�ν��Ͻ� �ʵ�) : ��ü ���� �Ŀ� ��� ����
	int m = 3;					
	
	//�ʵ�(static �ʵ�) : ��ü �������� ��밡��, ��ü ���� �Ŀ��� ����� ����
	// --> ��� ��ü�� �����ϴ� ����
	static int n = 4;			
								
	//�޼ҵ�(�ν��Ͻ� �޼ҵ�): ��ü�� ���� �� ȣ�� ����
	//�ν��Ͻ� �ʵ�� static �ʵ� ��� �� �� ����
	void print1() {
		System.out.println("�ν��Ͻ� �޼ҵ� -- "+" m : "+m+",  n : "+n);
	}
	//�޼ҵ�(static �޼ҵ�): ��ü ���� ���̵� ȣ�� ����
	//static �޼ҵ� ������ �ν��Ͻ� �ʵ尡 �� �� ����
	//static �ʵ常 ����!
		//??-> static �ʵ�� ��ü ������ ���ʿ�������, �ν��Ͻ� �ʵ�� ��ü ������ �ݵ�� �ʿ��ϱ� ������
	
	static void print2() {
		int i = 3;
		System.out.println("�ν��Ͻ� �޼ҵ� -- "+" m : �� �� ���� "+i+",  n : "+n);
	}
	
}

public class Static_01 {

	public static void main(String[] args) {

		//1. ��ü ���� �� �ʵ�� �޼ҵ� ȣ��
		// -- �ν��Ͻ� �ʵ�, static �ʵ�, �ν��Ͻ� �޼ҵ�, static �޼ҵ�  ��� ȣ�� ����
		
		Aaa aaa = new Aaa();
		aaa.m = 10;					// �ν��Ͻ� �ʵ� ȣ��
		aaa.n = 20;					// static �ʵ� ȣǮ
		aaa.print1(); 				// �ν��Ͻ� �޼ҵ� ȣ��
		aaa.print2(); 				// static �޼ҵ� ȣ��
		
		//2. ��ü �������� Ŭ���������� static �ʵ�� �޼ҵ� ȣ��
		// -- static �ʵ�, static �޼ҵ� ȣ�� ����
		
		Aaa.n = 100;		// static �ʵ�: Ŭ���� ������ ȣ���
		Aaa.print2();		// static �޼ҵ� : Ŭ���� ������ ȣ���
		
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n);
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n);
		
		Aaa eee = new Aaa();
		System.out.println(eee.n);  
		
		eee.n = 300;
		System.out.println("static �ʵ尡 ����� �ʵ�� ��� ��ü���� �������� �ٶ󺸴� ����");
		
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
		
	}

}














