package Chap11.Ex04;

//�߻� Ŭ������ ������� �ʴ� ���
// : �ڽ� Ŭ�������� �޼ҵ� �������̵� �� ��Ÿ�� ���� �߸� ������ �� �ִ�.

class Animal {
	void cry() {}	// ������ cry() �������ְ� ������ �������� ����
}

class Cat extends Animal{
	void cRy() {					//�������̵��� �ƴ� �ڽ�Ŭ�������� ���ο� �޼ҵ� ����
		System.out.println("�߿�");
	}
	void cry() {System.out.println("�߿�");}
}

class Dog extends Animal{
	void Cry() {					//�������̵��� �ƴ� �ڽ�Ŭ�������� ���ο� �޼ҵ� ����
		System.out.println("�۸�");
	}
	void cry() {
		System.out.println("�۸�");
	}
}

public class AbstractModifier_2 {

	public static void main(String[] args) {

		//1. ��ü ����
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		//2. �޼ҵ� ȣ��
		a1.cry();
		a2.cry();
		
	}

}
