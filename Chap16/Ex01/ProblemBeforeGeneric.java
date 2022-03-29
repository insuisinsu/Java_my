package Chap16.Ex01;


/*
 	< Generic �� ������� �ʴ´ٸ�? >
 	��ü�� ���� Ŭ������ ���� ���, �Ź� ��ü�� ������ �� ���� �� ��ü�� ���� Ŭ������ ����� �־�� �Ѵ�.
 	��ü�� ������ Ŭ������ �����ؼ� ��ü ������ ���� �� �ִ�.
 	-> ���ο� ��ǰ�� �߰��� �� ����, �� ��ǰ�� ���� Ŭ������ ��������� ��
 	--> �ڵ尡 ������ ����������.
 */

class Apple{
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {		//��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���
		return " �̸� : " +name + ", ���� : "+price; 
	}
	
}

//1. Apple �� ���� �� �ִ� Ŭ���� ����.
class Goods1 { 		
	private Apple apple = new Apple("���", 1000);

	public Apple getApple() {				//getter : ��ü �ʵ��� ������ ����ϴ� ��.. ���� ������ apple �� ��
		return apple;
	}

	public void setApple(Apple apple) {		//setter
		this.apple = apple;
	}
	
}

class Pensil{
	String name;
	int price;
	
	Pensil (String name, int price){ 	//�����ڸ� ���ؼ� �ʵ忡 �� �Ҵ�
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return " �̸� : " +name + ", ���� : "+price; 
	}
}

class Goods2{
	private Pensil pensil = new Pensil ("����", 2000);

	public Pensil getPensil() {
		return pensil;
	}

	public void setPensil(Pensil pensil) {
		this.pensil = pensil;
	}
	
}


public class ProblemBeforeGeneric {

	public static void main(String[] args) {

		//1. Goods1 ��ǰ�� ����Ǿ� �ִ�.   Apple ��ü �߰� �� ��������
		Goods1 goods1 = new Goods1(	);  // �⺻ ������ ȣ��
		goods1.setApple(new Apple("���2" ,2000));		//setter �� ��ü ���� �� ���� �Ҵ��ϰ�
		System.out.println(goods1.getApple());			//getter �� �ʵ��� ������ ���
		
		
		//Goods2  ��ǰ
		Goods2 goods2 = new Goods2();
		goods2.setPensil(new Pensil("����2", 3000));
		System.out.println(goods2.getPensil());
		
		
		
		
		
		
		
		
		
		
		
	}

}
