package Chap0607.Ex02;

public class A {

	//1. ���� Ÿ���� ���� �޼ҵ� : void �޼ҵ� ��() { �����ڵ� }
	public void print() {
		System.out.println("�ȳ�");
	}
	
	//2. ���� Ÿ���� �ִ� �޼ҵ� - int
	public int data () {
		return 3;		// void �ܿ��� return �� �ʿ��� //  int �ϱ� ���������� ����
	}
	
	//3. ���� Ÿ���� �ִ� �޼ҵ� - double
	public double sum (int a, double b) {
		return a + b;
	}
	
	//4. ���� Ÿ���� �ִ� �޼ҵ� -  void + �޼ҵ� ���ο��� ������ ���� : (�Լ� ������ �ǹ�)
	public void printMethode (int m) {
		if (m < 1 || m > 12) {
			System.out.println("�߸��� �Է°� �Դϴ�. 1~12 ������ �Է����ּ���");
			return ; 			// �޼ҵ带 �����Ѵٴ� �ǹ�
		}
		System.out.println(m + "�� �Դϴ�.");
	}
}
