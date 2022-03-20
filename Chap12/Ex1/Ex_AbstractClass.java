package Chap12.Ex1;

abstract class Abc {
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc{

	@Override
	void cry() {
		System.out.println("�Ŀ�");
	}

	@Override
	void fly() {
		System.out.println("�� ���ƿ�");
	}
	
}

class Eagle extends Abc{

	@Override
	void cry() {
		System.out.println("����");
	}

	@Override
	void fly() {
		System.out.println("���� ���ƿ�");
	}
	
}

public class Ex_AbstractClass {

	public static void main(String[] args) {

		Abc cat = new Cat();
		Abc eagle = new Eagle();
		
		cat.cry();
		eagle.cry();
		
		Abc cat2 = new Cat() {
			void cry() {
				System.out.println("�ľƿ�");
			}
			void fly() {
				System.out.println("��������");
			}
		};
		
		Abc eagle2 = new Eagle() {
			void cry() {
				System.out.println("���̷�");
			}
			void fly() {
				System.out.println("�̾����̾��� ���ƿ�");
			}
		};
		cat2.cry();
		cat2.fly();
		eagle2.cry();
		eagle2.fly();
		
	}

}
