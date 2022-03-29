package Chap16.Ex02;


/*
 	장점
 	Object 는 모든 객체를 저장할 수 있음 (casting)
 	상품을 저장하는 클래스에 Object 타입으로 저장하면, 모든 객체를 담을 수 있음
 	단점
 	매번 다운 캐스팅을 해서 출력해야 함
 	약한 타입 체크..-> 컴파일 시에는 오류가 발생하지 않지만, 실행했을 때 ClassCastException 이 발생
 	
 */


class Apple{
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public void abc() {
		System.out.println("abc() 메서드 출력");
	}
	
	@Override
	public String toString() {		//객체 자체를 출력시 객체의 주소가 아니라 필드이 정보를 출력
		return " 이름 : " +name + ", 가격 : "+price; 
	}
	
}

class Pensil{
	String name;
	int price;
	
	Pensil (String name, int price){ 	//생성자를 통해서 필드에 값 할당
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return " 이름 : " +name + ", 가격 : "+price; 
	}
}

class Goods{		//Object 를 사용해서 모든 상품을 저장할 수 있음
	
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {		//Object 타입으로 업캐스팅 됨
		this.object = object;
	}
	
}


public class Using_Object {

	public static void main(String[] args) {

		Goods goods1 = new Goods();
		goods1.setObject(new Apple("사과", 4000));		//setter 로 값을 할당
		System.out.println((Apple)goods1.getObject());		//getter로 객체 출력 , Object---> Apple
		((Apple) goods1.getObject()).abc(); 			//Object -> Apple 로 다운캐스팅 후 abc() 메서드 출력
		
		
		
		Goods goods2 = new Goods();
		goods2.setObject(new Pensil("연피일", 30000));
		System.out.println((Pensil) goods2.getObject());
		
		
		//3. 잘못된 캐스팅을 할 수 있다 (약한 타입 체크) : Object
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("사과4", 5000));
//		System.out.println( (Pensil) goods3.getObject());		//ClassCastException 발생
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
