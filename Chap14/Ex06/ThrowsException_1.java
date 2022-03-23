package Chap14.Ex06;

/*
	���� ó�� 2���� ��� :
	1. ���� ó�� : try catch
	2. ���� ����(�̷��) : throws,, �޼ҵ带 ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� ����
		throw : ������ ���ܸ� �߻� ��Ų��.
 */

//�޼ҵ� ���ο��� ���� ó���� ���� ����
class A{
	void abc() {
		bcd();
	}
	void bcd() {
		
		try {
			Thread.sleep(1000);			//�Ϲ� ���� : try catch �ʿ� /InterruptedException
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.out.println("���� �߻� 1");
		} 	
	}
	
}

class B{
	void abc() {		//bcd() �� ���ܸ� ó���� �ǹ��� ���� ?-> bcd ���� throws �� �̷��� �̤�
		try {	
			bcd();
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.out.println("���� �߻� 2");
		}
	}
	
	void bcd() throws InterruptedException {	//bcd() �� ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� �̷��.
		Thread.sleep(1000);
	}
}

public class ThrowsException_1 {

	public static void main(String[] args) {
		
		A a = new A();
		a.abc();
		B b = new B();
		b.abc();
		
	}

}
