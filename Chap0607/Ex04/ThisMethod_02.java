package Chap0607.Ex04;


//this(); 를 사용하지 않고 여러개의 생성자를 선언한 경우
// -> 중복된 값을 매번 입력해야 함
class Aaa {
	int m1, m2, m3, m4;		//필드 4개 선언
	Aaa() {					// 매개변수가 없는 생성자
		m1 = 1; m2 = 2; m3 = 3; m4 = 4;
	}
	Aaa(int a){
		m1 = a; m2 = 2; m3 = 3; m4 = 4;
	}
	Aaa(int a, int b){
		m1 = a; m2 = b; m3 = 3; m4 = 4;
	}
	Aaa(int a, int b, int c){
		m1 = a; m2 = b; m3 = c; m4 = 4;
	}
	Aaa(int a, int b, int c, int d){
		m1 = a; m2 = b; m3 = c; m4 = d;
	}
	
	void print () {				// 각 메모리의 값을 출력
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4 + " ");
		System.out.println("===============");
	}
}
//this(); 를 사용하여 여러 개의 생성자를 선언한 경우
// -> 중복된 값 제거
class Bbb {
	int m1, m2, m3, m4;		//필드 4개 선언
	Bbb() {
		m1 = 1; m2 = 2; m3 = 3; m4 = 4;
	}
	Bbb(int a) {
		this();				//인풋값이 없는 생성자 호출
		m1 = a;
	}
	Bbb(int a, int b){
		this(a);			//인풋값이 정수 1개인 생성자 호출
		m2 = b;
	}
	void print () {				// 각 메모리의 값을 출력
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4 + " ");
		System.out.println("===============");
	}
}

public class ThisMethod_02 {

	public static void main(String[] args) {

		//1. 세 가지 객체 생성 (this 미사용)
		Aaa aaa1 = new Aaa();			//매개변수가 없는 생성자 호출
		Aaa aaa2 = new Aaa(10);			//매개변수가 정수 1개인 생성자 호출
		Aaa aaa3 = new Aaa(10, 20);		//매개변수가 정수 2개인 생성자 호출
		
		System.out.println("Aaa, this(); 미사용");
		aaa1.print();
		aaa2.print();
		aaa3.print();
		
		Bbb bbb1 = new Bbb();					//기본 생성자 호출
		Bbb bbb2 = new Bbb(10);					
		Bbb bbb3 = new Bbb(10, 20);
		
		System.out.println("Bbb, this(); 사용");
		bbb1.print();			// 1, 2, 3, 4
		bbb2.print();			// 10, 2, 3, 4
		bbb3.print();			// 10, 20, 3, 4
		
		
		
	}

}















