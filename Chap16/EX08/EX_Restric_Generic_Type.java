package Chap16.EX08;

// ���ʸ� Ŭ������ ���� �ؼ� , Ÿ�� ���� (Apple, Strawberry, Banana) , Pancil�� Ÿ������ ������ �� ������ ���� 
   //�Ϸ� �ð� : 12:00 , p.jangwoo@gmail.com 

abstract class Fluit {
	public abstract void print () ;  //�߻� �޼ҵ� 
}
class Apple extends Fluit {
	String name; 
	int	price ; 
	Apple (String name, int price){
		this.name =name ; 
		this.price = price; 
	}
	@Override
	public String toString() {
		
		return name + "�̰� ������ " + price ; 
	}
	@Override
	public void print() {
		System.out.println(name + " - ���");
		
	}
}
class Strawberry extends Fluit{
	String name; 
	int	price ; 
	Strawberry (String name, int price){
		this.name =name ; 
		this.price = price; 
	}
	@Override
	public String toString() {
		
		return name + "�̰� ������ " + price ; 
	}
	@Override
	public void print() {
		System.out.println(name + " - ���");
		
	}
}
class Banana extends Fluit{
	String name; 
	int	price ; 
	Banana (String name, int price){
		this.name =name ; 
		this.price = price; 
	}
	@Override
	public String toString() {
		
		return name + "�̰� ������ " + price ; 
	}
	@Override
	public void print() {
		System.out.println(name + " - ���");
		
	}
}

class Pancil {
	String name; 
	int	price ; 
	Pancil (String name, int price){
		this.name =name ; 
		this.price = price; 
	}
	@Override
	public String toString() {
		
		return name + "�̰� ������ " + price ; 
	}
} 

										//
//���ʸ� Ŭ���� : Fluit Ÿ�Ը� �ü� ����. 		//DTO(Data Transfer Object) - getter, setter
										//VO(Value Object) - getter
class GenClass <T extends Fluit>{
	private T t ;						//�����͸� �޾Ƽ� �����ϴ� �߰��� ����
										//�������� ���� �޾Ƽ� ����, �߰��� ����

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	} 
	
}

public class EX_Restric_Generic_Type {
	public static void main(String[] args) {
		
		GenClass<Fluit> a1 = new GenClass<Fluit>(); 

		a1.setT(new Apple("���",1000));
		System.out.println(a1.getT());
		
		a1.setT(new Strawberry("����", 2000));
		System.out.println(a1.getT());
		
		a1.setT(new Banana("�ٳ���", 3000));
		System.out.println(a1.getT());
		
		
		//���� �߻� (������ ������ �� ����)
		//a1.setT(new Pancil("����", 4000));
		//System.out.println(a1.getT());
		
		
	}
	

	
	
	
	
	

}
