package Chap0607.Ex04;


/*1. this 가 키워드로 사용되는 경우
 * : this.m -> 필드의 m / this.init() -> 자기 자신 객체의 메소드
 * 
 * 2. this 가 메소드로 사용되는 경우
 * : this(); -> 생성자 내에서 다른 생성자를 호출할 때 사용
 * 			 -> 반드시 생성자 내부의 첫 줄에 와야함
 * 			 -> 메소드 내부에서는 사용할 수 없다. (생성자 내부에서만 사용가능)
 */

class Abc{
	Abc(){				//생성자의 매개변수 값이 없는 생성자
		System.out.println("첫 번째 생성자입니다.");
	}
	Abc(int a){
		this();			//매개변수가 없는 생성자 호출,, this(); 는 '생성자의 첫라인'에 와야함.
		System.out.println("두 번째 생성자입니다.");
	}

	Abc(int a, String b){
		this(30);
		System.out.println("세 번째 생성자입니다.");
	}
	
//	오류발생 - 메소드 내부에서 this(); 를 사용하는 경우
	void abc () {
//		this();			//this(); 는 메소드 내에서는 사용할 수 없다
						//this(); 는 다른 생성자를 호출할 때 사용
	}
	
}

public class ThisMethod {

	public static void main(String[] args) {

		//1. 객체 생성
		Abc abc = new Abc();		//매개변수가 없는 생성자 호출
		System.out.println("=================");
		
		Abc abc1 = new Abc(1);		//매개변수가 정수 1개인 생성자 호출
		System.out.println("================");
		
		Abc abc2 = new Abc(1, "일");
		
		
		
		
		
	}

}
