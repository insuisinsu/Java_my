package Chap10.Ex05;

//�⺻ ������ : Ŭ���� ���� �ٸ� �����ڰ� �������� ���� ��� ���� ����

//�ν��Ͻ� �޼ҵ� �������̵�
// : ��Ӱ��迡�� �޼ҵ� �������̵��� �ν��Ͻ� �޼ҵ常 �������̵��ȴ�.
//	��Ӱ��迡�� �ν��Ͻ� �ʵ�, stack �ʵ�, static �޼ҵ�� ��������¡ ���� ����
//  �������̵� �� ���� �ñ״��İ� ���ƾ� ��. (����Ÿ��, �޼ҵ��, �Ű����� Ÿ�԰� ����)
class A {
	
	A (){}
	
	void print() {
		System.out.println("Class A");
	}
}

class B extends A{

	@Override
	void print() {
		System.out.println("Class B");
	}
}

class C extends A {
	
	@Override
	void print() {
		System.out.println("class C");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		//1. A Ÿ��, A ������
		A a = new A ();
		a.print();
		
		//2. B Ÿ��, B ������
		B b = new B ();
		b.print();
		
		//3. C Ÿ��, C ������
		C c = new C ();
		c.print();
		System.out.println();
		//4. A Ÿ��, B ������
		//B �� A �� �������̵� �Ǿ�, A Ÿ�������� B �� �޼ҵ� ���
		A ab = new B();
		ab.print();
		//A �� print() �޼ҵ� ȣ�� --> B �� print() �޼ҵ� ���
		System.out.println("0==");
		A ac = new C();
		ac.print();
		
		//5.
		A[] arr = {ab, ac};
		System.out.println("for============");
		for(int i = 0; i < arr.length ; i++) {
			arr[i].print();
		}
		
		System.out.println("���� for=======");
		for(A k : arr) {
			k.print();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
