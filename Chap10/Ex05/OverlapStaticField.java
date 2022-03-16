package Chap10.Ex05;

//Static �ʵ�� �������̵� ���� ����

class AAA {
	static int m = 3;
	static void print() {
		System.out.println("AAA class");
	}
}

class BBB extends AAA {
	static int m = 4;
	static void print() {
		System.out.println("BBB class");
	}
}

public class OverlapStaticField {

	public static void main(String[] args) {
		//1. ��ü ���� ���� ȣ�� ����
		// : Ŭ���� ������ ȣ��
		// -- static �ʵ����� �����ϱ� ���� Ŭ���� ������ ȣ����
		
		System.out.println(AAA.m);
		System.out.println(BBB.m);
		System.out.println();
		AAA.print();
		BBB.print();
		System.out.println();
		//2. ��ü ���� �� ȣ��
		
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		AAA aabb = new BBB();
		
		System.out.println(aaa.m);
		System.out.println(bbb.m);
		System.out.println(aabb.m);
		aaa.print();
		bbb.print();
		aabb.print();
		 
	}

}
