package Chap11.Ex05;

//�߻� Ŭ������ ����ؼ� ��ɱ��� �ϴ� ���

abstract class Animal {
	abstract void cry();				// �߻� �޼ҵ� : ���� �Ǿ��ְ� �����ΰ� ���� �޼ҵ�
}

class Cat extends Animal{
	void cry() {
		System.out.println("�߿�������������");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("�۸۸۸۸۸۸۸۸۸۸۸۸۸ۤ���");
	}
}



public class AbstractModifier_3 {
	public static void main(String[] args) {

		//�߻� Ŭ������ ��üȭ �� �� ����.
		//Animal a3 = new Animal();
		
		//�ٸ�, �߻� Ŭ������ Ÿ������ ����� ���� ����.
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.cry();
		dog.cry();
		
		
		
	}

}
