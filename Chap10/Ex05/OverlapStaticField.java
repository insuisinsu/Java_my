package Chap10.Ex05;

//Static 필드는 오버라이딩 되지 않음

class AAA {
	static int m = 3;
	static void print() {
		System.out.println("AAA class");
	}
}

class BBB extends AAA {
	static int m = 4;
	static void print() {
		System.out.println("BBB class");
	}
}

public class OverlapStaticField {

	public static void main(String[] args) {
		//1. 객체 생성 없이 호출 가능
		// : 클래스 명으로 호출
		// -- static 필드임을 구분하기 위해 클래스 명으로 호출함
		
		System.out.println(AAA.m);
		System.out.println(BBB.m);
		System.out.println();
		AAA.print();
		BBB.print();
		System.out.println();
		//2. 객체 생성 후 호출
		
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		AAA aabb = new BBB();
		
		System.out.println(aaa.m);
		System.out.println(bbb.m);
		System.out.println(aabb.m);
		aaa.print();
		bbb.print();
		aabb.print();
		 
	}

}
