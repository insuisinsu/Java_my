package Chap16.Ex01;


/*
 	< Generic 을 사용하지 않는다면? >
 	객체를 담을 클래스르 만들 경우, 매번 객체를 생성할 때 마다 그 객체를 담을 클래스를 만들어 주어야 한다.
 	개체를 저장할 클래스를 생성해서 객체 정보를 담을 수 있다.
 	-> 새로운 상품이 추가될 때 마다, 그 상품을 담을 클래스르 생성해줘야 함
 	--> 코드가 굉장히 복잡해진다.
 */

class Apple{
	String name;
	int price;
	
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {		//객체 자체를 출력시 객체의 주소가 아니라 필드이 정보를 출력
		return " 이름 : " +name + ", 가격 : "+price; 
	}
	
}

//1. Apple 을 담을 수 있는 클래스 생성.
class Goods1 { 		
	private Apple apple = new Apple("사과", 1000);

	public Apple getApple() {				//getter : 객체 필드의 정보를 출력하는 것.. 리턴 값으로 apple 을 줌
		return apple;
	}

	public void setApple(Apple apple) {		//setter
		this.apple = apple;
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

class Goods2{
	private Pensil pensil = new Pensil ("연필", 2000);

	public Pensil getPensil() {
		return pensil;
	}

	public void setPensil(Pensil pensil) {
		this.pensil = pensil;
	}
	
}


public class ProblemBeforeGeneric {

	public static void main(String[] args) {

		//1. Goods1 상품이 저장되어 있다.   Apple 객체 추가 및 가져오기
		Goods1 goods1 = new Goods1(	);  // 기본 생성자 호출
		goods1.setApple(new Apple("사과2" ,2000));		//setter 로 객체 생성 및 값을 할당하고
		System.out.println(goods1.getApple());			//getter 로 필드의 내용을 출력
		
		
		//Goods2  상품
		Goods2 goods2 = new Goods2();
		goods2.setPensil(new Pensil("연필2", 3000));
		System.out.println(goods2.getPensil());
		
		
		
		
		
		
		
		
		
		
		
	}

}
