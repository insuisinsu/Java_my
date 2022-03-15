package Chap0607.Ex04;


/*  < 묵시적 this 키워드 자동 추가 >
 * 1. 클래스 내부에서 필드 or 메소드 이름 앞에 자동으로 this 키워드가 붙음.
 * 		this 키는 자기 자신의 객체의 필드와 메소드를 지칭
 */



class A{
	int m;
	int n;
	
	// A () {} 			// 기본 생성자 생략
	
	void init (int a, int b) {			// 변수 a, b c 는 메소드 안에 있는 '지역변수'
		int c; 							// Stack 영역에 변수명과 값을 저장
		c = 3;							// 메소드 inti() 생성 시에 stack 영역에 생성되고 메소드가 끝나면 소멸됨
		this.m = a;			//this 키 생략시, 컴파일러가 자동으로 추가 
		this.n = b;			//this 키 생략시, 컴파일러가 자동으로 추가
	}
	
	void work() {
		this.init(2, 3);	//this 키 생략시, 컴파일러가 자동으로 추가
		System.out.println(this.m + ", "+this.n); // this 는 생략 가능, 컴파일러가 자동으로 추가
	}
}

public class ThisKeyword_01 {

	public static void main(String[] args) {
	//2. 객체 생성
		A a = new A();
		
	//3. 메소드 호출
		a.work();
		
		
	}

}
