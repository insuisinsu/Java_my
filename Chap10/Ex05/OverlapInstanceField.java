package Chap10.Ex05;

//�ν��Ͻ� �ʵ�� �������̵� ���� ����

class AA {				//�θ� Ŭ����
	int m =3;			//�ν��Ͻ� �ʵ�
	void print () {
		System.out.println("AA class");
	}
}

class BB extends AA {
	int m = 4;			//�ν��Ͻ� �ʵ�
	void print () {
		System.out.println("BB class");
	}
}

class CC extends AA {
	int m = 5;			//�ν��Ͻ� �ʵ�
	void print () {
		System.out.println("CC class");
	}
}

public class OverlapInstanceField {

	public static void main(String[] args) {
		//1. ��ü ����
		AA aa = new AA();
		BB bb = new BB();
		CC cc = new CC();
		
		AA ab = new BB();
		AA ac = new CC();
		
		//2. �ν��Ͻ� �ʵ� ���
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(cc.m);
		System.out.println();
		System.out.println(ab.m);
		System.out.println(ac.m);
		System.out.println();
		
		//3. �������̵�� �޼ҵ� ���
		aa.print();
		bb.print();
		cc.print();
		System.out.println();
		ab.print();
		ac.print();
	}

}
