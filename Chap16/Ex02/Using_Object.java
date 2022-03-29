package Chap16.Ex02;


/*
 	����
 	Object �� ��� ��ü�� ������ �� ���� (casting)
 	��ǰ�� �����ϴ� Ŭ������ Object Ÿ������ �����ϸ�, ��� ��ü�� ���� �� ����
 	����
 	�Ź� �ٿ� ĳ������ �ؼ� ����ؾ� ��
 	���� Ÿ�� üũ..-> ������ �ÿ��� ������ �߻����� ������, �������� �� ClassCastException �� �߻�
 	
 */


class Apple{
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public void abc() {
		System.out.println("abc() �޼��� ���");
	}
	
	@Override
	public String toString() {		//��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���
		return " �̸� : " +name + ", ���� : "+price; 
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

class Goods{		//Object �� ����ؼ� ��� ��ǰ�� ������ �� ����
	
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {		//Object Ÿ������ ��ĳ���� ��
		this.object = object;
	}
	
}


public class Using_Object {

	public static void main(String[] args) {

		Goods goods1 = new Goods();
		goods1.setObject(new Apple("���", 4000));		//setter �� ���� �Ҵ�
		System.out.println((Apple)goods1.getObject());		//getter�� ��ü ��� , Object---> Apple
		((Apple) goods1.getObject()).abc(); 			//Object -> Apple �� �ٿ�ĳ���� �� abc() �޼��� ���
		
		
		
		Goods goods2 = new Goods();
		goods2.setObject(new Pensil("������", 30000));
		System.out.println((Pensil) goods2.getObject());
		
		
		//3. �߸��� ĳ������ �� �� �ִ� (���� Ÿ�� üũ) : Object
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("���4", 5000));
//		System.out.println( (Pensil) goods3.getObject());		//ClassCastException �߻�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
