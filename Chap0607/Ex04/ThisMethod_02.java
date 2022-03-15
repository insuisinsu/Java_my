package Chap0607.Ex04;


//this(); �� ������� �ʰ� �������� �����ڸ� ������ ���
// -> �ߺ��� ���� �Ź� �Է��ؾ� ��
class Aaa {
	int m1, m2, m3, m4;		//�ʵ� 4�� ����
	Aaa() {					// �Ű������� ���� ������
		m1 = 1; m2 = 2; m3 = 3; m4 = 4;
	}
	Aaa(int a){
		m1 = a; m2 = 2; m3 = 3; m4 = 4;
	}
	Aaa(int a, int b){
		m1 = a; m2 = b; m3 = 3; m4 = 4;
	}
	Aaa(int a, int b, int c){
		m1 = a; m2 = b; m3 = c; m4 = 4;
	}
	Aaa(int a, int b, int c, int d){
		m1 = a; m2 = b; m3 = c; m4 = d;
	}
	
	void print () {				// �� �޸��� ���� ���
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4 + " ");
		System.out.println("===============");
	}
}
//this(); �� ����Ͽ� ���� ���� �����ڸ� ������ ���
// -> �ߺ��� �� ����
class Bbb {
	int m1, m2, m3, m4;		//�ʵ� 4�� ����
	Bbb() {
		m1 = 1; m2 = 2; m3 = 3; m4 = 4;
	}
	Bbb(int a) {
		this();				//��ǲ���� ���� ������ ȣ��
		m1 = a;
	}
	Bbb(int a, int b){
		this(a);			//��ǲ���� ���� 1���� ������ ȣ��
		m2 = b;
	}
	void print () {				// �� �޸��� ���� ���
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4 + " ");
		System.out.println("===============");
	}
}

public class ThisMethod_02 {

	public static void main(String[] args) {

		//1. �� ���� ��ü ���� (this �̻��)
		Aaa aaa1 = new Aaa();			//�Ű������� ���� ������ ȣ��
		Aaa aaa2 = new Aaa(10);			//�Ű������� ���� 1���� ������ ȣ��
		Aaa aaa3 = new Aaa(10, 20);		//�Ű������� ���� 2���� ������ ȣ��
		
		System.out.println("Aaa, this(); �̻��");
		aaa1.print();
		aaa2.print();
		aaa3.print();
		
		Bbb bbb1 = new Bbb();					//�⺻ ������ ȣ��
		Bbb bbb2 = new Bbb(10);					
		Bbb bbb3 = new Bbb(10, 20);
		
		System.out.println("Bbb, this(); ���");
		bbb1.print();			// 1, 2, 3, 4
		bbb2.print();			// 10, 2, 3, 4
		bbb3.print();			// 10, 20, 3, 4
		
		
		
	}

}















