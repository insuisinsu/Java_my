package Chap10.Ex02;

//������(Polymorhism) : ��ü�� ��� ���迡�� ���� ���� ������ Ÿ������ ��ȯ ����

class A{}
class B extends A {}
class C extends B {}
class D extends B {}


public class Polymorhism {
	public static void main(String[] args) {

		//1. ��ĳ���� (�ڵ����� ��ȯ) : ������ �����Ϸ��� �ڵ����� �߰�

		//A ac = (A) new C();
		A ac = new C();			// C -> A , C �� A �̴�.
		//ac�� A, B, C �� �ʵ�� �޼ҵ带 ��� ����,, A �� �ʵ�� �޼ҵ常 ����
		A ab = new B();
		
		//��ü ������ �� �� ���� ���(���)
		
		
		//������ ���� : ���α׷� ���� �� ��Ŭ������ üũ
		//��Ÿ�� ���� : ����� �ٷ��Ǵ� ����
	}

}
