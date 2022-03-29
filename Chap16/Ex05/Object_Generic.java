package Chap16.Ex05;

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
	
	public void bcd() {
		System.out.println("bcd() �޼��� ���");
	}
	
	@Override
	public String toString() {
		return " �̸� : " +name + ", ���� : "+price; 
	}
}

//���ʸ��� ����ؼ� ��ü�� ���� �� �� �о����
//���ʸ� Ŭ����
class Goods<T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}


public class Object_Generic {

	public static void main(String[] args) {

		Goods<Apple> goods1 = new Goods<Apple>();	//goods1 �� ������ Ÿ���� Apple
		goods1.set(new Apple("���", 1000));
		System.out.println(goods1.get());  			//���ʸ������� �ٿ� ĳ������ �� �ʿ䰡 ����.
//		System.out.println(goods1.get().abc()); 	//�ٿ� ĳ���� ���� Apple ��ü�� abc() �޼��� ȣ��
		goods1.get().abc();							//print �� �־ �׳� ȣ���ؾ���
		
		Goods<Pensil> goods2 = new Goods();
		goods2.set(new Pensil("����1", 2000));
		System.out.println(goods2.get());
		goods2.get().bcd();
		
		
		
		
		
		
	}

}
