package Chap13.Ex05;

/*
 	���� �̳� Ŭ������ ������ ���� ���� Ŭ���� ����
 	���� �̳� Ŭ���� : '�޼��� ���ο� ����� Ŭ����'
 	
 */

class A{
	void abc() {
		class B {}		//A$1B.class
		class C {}		//A$1C.class
	}
	
	void bcd() {
		class C {}		//A$2C.class	������ �̸��� ������ ��� ���ڰ� �þ
		class D {}		//A$1D.class
	}
	
}

public class InnerClass_5 {

	public static void main(String[] args) {

	}

}
