package Chap0607.Ex06;

import Chap0607.Ex05.A;

//�ٸ� ��Ű������ class A ���� �ϱ�

public class Ex_A {

	public static void main(String[] args) {

		//�ٸ� ��Ű���� ��ü�� ����ϴ� ���
		//1. Ŭ���� ��ü �̸� ���
		Chap0607.Ex05.A a = new Chap0607.Ex05.A() ;
		//Ŭ���� ��ü �̸� : ��Ű����.Ŭ������.
		
//		a.m = 10;	//���� �Ұ� : default �� �ٸ� ��Ű�� ������ ���� �Ұ�
		
		a.k = 50;	//���� ���� : Public �� �ٸ� ��Ű���� Ŭ�������� ���� ����
		a.print2();
		
		//2. import �� ����ؼ� �����ϴ� ���
		A aa = new A();		//import Chap0607.Ex05.A;
		aa.k = 100;
		aa.print2();
		
	}

}
