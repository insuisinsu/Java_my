package Chap11;

/*
 	Final : ������
 	
 	- �ʵ��, ���������� : ���,   final doule PI = 3.14;
 		--> ����� ���� ������ �� ����			// double PI = 3.14; <- �̰� ������
	
	- �޼ҵ�� : �������̵��� �Ұ��� �޼ҵ� (�ڽ� Ŭ�������� �޼ҵ� �������̵����� ���ϵ���)
			: final void print(){}
	- Ŭ������ : ��� �Ұ��� Ŭ���� == �ڽ� Ŭ������ ���� �� ����. ������ Ŭ����
			: final class A{}
			
	 ^ �ʵ��, ������������ �ҹ��� ���, �������ڰ� �̾��� ��� �ܾ��� ù�ڸ� �빮�� ��� newHome
	 ^ �����(final �� �տ� ���� ����)�� �빮�� ���
 */

class A1 {
	int a = 3;
	final int B = 5;
	A1(){}
}
class A2 {
	int a;
	final int B;
	A2(){
		a = 3;
		B = 5;
	}
}

class A3{
	int a = 3;
	final int b = 5;
	A3(){
		a = 5 ;
// 		B = 10;		final ���� ������ �� ����
	}
}

class B {						//���� ���� : �޼ҵ� �ȿ��� ������ ����
								//		: �޼ҵ� ȣ���� ������ ���������� �����
								// Stack ������ ������ ���� �Ҵ��
	void bcd() {
		int a= 3;
		final int B = 5;		//��� : Ŭ���� ������ ��� ������ �����.
								//	: �޼ҵ尡 �������� ��� ������ ��������
		a = 7;
//		B = 8;
	}
}

public class FinalModifier_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
