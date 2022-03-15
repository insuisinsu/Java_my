package Chap10.Ex04;

//메소드오버로딩(Method Overloading) VS. 메소드 오버라이딩(Method Overriding)
/*
 	1. 메소드 오버로딩 : 동일한 메소드 이름으로 (매개변수 타입, 매개변수 수)에 따라 해당 메소드가 호출
 		..상속과는 관련이 없음
 		..생성자에서 많이 사용
 		
 	2. 메소드 오버라이딩 : 부모의 메소드를 자식의 메소드에서 새롭게 정의해서 사용 
 		..상속관계에서만 사용 가능
 		..메소드의 시그니처가 같아야 함(메소드명, 매개변수 타입과 갯수)
 		..자식이 부모의 접근제한자와 같거나 더 넓은 범위여야 함
 */


class Ab{
	//Overriding
	void print1() {
		System.out.println("Ab class, print1()");
	}
	//Overloading
	void print2() {
		System.out.println("Ab class, print2()");
	}
}
class Bc extends Ab{
	//Overriding
	@Override
	void print1() {
		System.out.println("Bc class, print1()");
	}
	//Overloading
	void print2(int a) {
		System.out.println("Bc class, print2()");
	}
}

public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		//1. Ab 타입 선언
		Ab aa = new Ab();
		aa.print1();
		aa.print2();
		
		//2.Bc 타입 선언
		Bc bb = new Bc();
		bb.print1();
		bb.print2();
		bb.print2(0);
		System.out.println();
		
		//Ab 타입으로 선언 + Bc 타입 생성자 호출
		Ab ab = new Bc();
		ab.print1();
		ab.print2();
//		abb.print2(2);
		
		if(ab instanceof Bc) {
			Bc abb = (Bc) ab;
			abb.print2();
			abb.print2(0);
		}
		
		
		Ab cc = new Bc();
		
		
		
	}

}
