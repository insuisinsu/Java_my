package Chap10.Ex04;

class Animal3 {
	String name;
	int age;
	
	void cry() {
		System.out.println("������ ��ϴ�.");
	}
	
	//Object.toString() �޼ҵ�� ��ü ��ü�� ����� �� ȣ�� 
	@Override
	public String toString() {
		return "�̸��� : " +name+" �̰�, ���̴� : "+ age+" �Դϴ�.";
	}
}

class Tiger3 extends Animal3{
	Tiger3(){}
	//������ : ��ü�� ������ �� �޸��� �ʱⰪ�� �Ҵ��� �� ���
	Tiger3(String a, int b){
		super.name = a;
		super.age = b;
	}
	
	@Override
	void cry() {
		super.cry();
		
		System.out.println("ȣ���̴� ���� �ϰ� ��ϴ�.");
	}
}
class Cat3 extends Animal3{
	Cat3(){};
	Cat3(String a, int b){
		super.name = a;
		super.age = b;
	}

	@Override
	void cry() {
		super.cry();
		System.out.println("����̴� �߿� �ϰ� ��ϴ�");
	}
	
}
class Dog3 extends Animal3{
	Dog3(){}
	Dog3(String a, int b){
		super.name = a;
		super.age = b;
	}
	@Override
	void cry() {
		super.cry();
		System.out.println("���� �۸� �ϰ� ��ϴ�");
	}
	
}

public class Test02 {

	public static void main(String[] args) {
	
		Animal3 a3 = new Animal3();
		System.out.println(a3);
		System.out.println(a3.toString());
		
		
		//Tiger3 �� Animal3 �� ��ĳ����
		Animal3 t3 = new Tiger3();
		Animal3 c3 = new Cat3();
		Animal3 d3 = new Dog3();
		
		//�θ��� cry()�� ȣ���� ��� �������̵��� Tiger3�� cry()�� ȣ��
		t3.cry();
		c3.cry();
		d3.cry();
		
		System.out.println("================");
		Animal3[] arr = {t3, c3, d3};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].cry();
		}
		for(Animal3 k : arr) {
			k.cry();
		}
		System.out.println("=================");
		
		Animal3 aa3 = new Tiger3("ȣ����", 5);
		Animal3 cc3 = new Cat3("�����", 10);
		Animal3 dd3 = new Dog3("������", 7);
		
		System.out.println(aa3);
		System.out.println(cc3);
		System.out.println(dd3);
		System.out.println("==");
		
		Animal3[] arr2 = {aa3, cc3, dd3};
		for( int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		for(Animal3 k : arr2) {
			System.out.println(k);
		}
	}

}
