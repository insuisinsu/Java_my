package Chap12.Ex1;

class AA {					
	//�Ϲ� Ŭ���� : ��ü ������ �ʵ�� �޼ҵ�� Heap ������ ����
	//Heap : �ݵ�� �ʱ�ȭ �� ���� ����
	//�ν��Ͻ� �޼ҵ�� Ŭ���� ������ �ν��Ͻ� ������ �޼ҵ��� �����ڵ� ���� ����
	//Heap ���� ������ ������ ������
	
	int a;
	double b;
	char c;
	boolean d;
	byte e;
	float f;
	String g;		// ��������
	short h;
	
	void cry() {}	//������ �޼ҵ�
	@Override
	public String toString() {
		return a +" , "+b+" , "+c+" , "+d+" , "+e+" , "+f+" , "+g+" , "+h;
	}
}

abstract class A {				//�߻� Ŭ���� : �̿ϼ� �޼ҵ带 �����ϱ� ������ ��ü ������ �Ұ���
	abstract void abc();		//�߻� �޼ҵ� (�̿ϼ� �޼ҵ�)
}

class B extends A{				//�߻� Ŭ������ ������ ��ü
	@Override
	void abc() {
		
	}
}

public class AbstractClass_1 {

	public static void main(String[] args) {
		
//		A a = new A();
		AA aa = new AA();
		System.out.println(aa);
	}

}
