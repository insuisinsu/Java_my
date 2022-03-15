package Chap10.Ex04;

//�޼ҵ�����ε�(Method Overloading) VS. �޼ҵ� �������̵�(Method Overriding)
/*
 	1. �޼ҵ� �����ε� : ������ �޼ҵ� �̸����� (�Ű����� Ÿ��, �Ű����� ��)�� ���� �ش� �޼ҵ尡 ȣ��
 		..��Ӱ��� ������ ����
 		..�����ڿ��� ���� ���
 		
 	2. �޼ҵ� �������̵� : �θ��� �޼ҵ带 �ڽ��� �޼ҵ忡�� ���Ӱ� �����ؼ� ��� 
 		..��Ӱ��迡���� ��� ����
 		..�޼ҵ��� �ñ״�ó�� ���ƾ� ��(�޼ҵ��, �Ű����� Ÿ�԰� ����)
 		..�ڽ��� �θ��� ���������ڿ� ���ų� �� ���� �������� ��
 */


class Ab{
	//Overriding
	void print1() {
		System.out.println("Ab class, print1()");
	}
	//Overloading
	void print2() {
		System.out.println("Ab class, print2()");
	}
}
class Bc extends Ab{
	//Overriding
	@Override
	void print1() {
		System.out.println("Bc class, print1()");
	}
	//Overloading
	void print2(int a) {
		System.out.println("Bc class, print2()");
	}
}

public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		//1. Ab Ÿ�� ����
		Ab aa = new Ab();
		aa.print1();
		aa.print2();
		
		//2.Bc Ÿ�� ����
		Bc bb = new Bc();
		bb.print1();
		bb.print2();
		bb.print2(0);
		System.out.println();
		
		//Ab Ÿ������ ���� + Bc Ÿ�� ������ ȣ��
		Ab ab = new Bc();
		ab.print1();
		ab.print2();
//		abb.print2(2);
		
		if(ab instanceof Bc) {
			Bc abb = (Bc) ab;
			abb.print2();
			abb.print2(0);
		}
		
		
		Ab cc = new Bc();
		
		
		
	}

}
