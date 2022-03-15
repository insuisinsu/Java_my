package Chap0607.Ex02;

public class A {

	//1. 리턴 타입이 없는 메소드 : void 메소드 명() { 실행코드 }
	public void print() {
		System.out.println("안녕");
	}
	
	//2. 리턴 타입이 있는 메소드 - int
	public int data () {
		return 3;		// void 외에는 return 이 필요함 //  int 니까 정수값으로 리턴
	}
	
	//3. 리턴 타입이 있는 메소드 - double
	public double sum (int a, double b) {
		return a + b;
	}
	
	//4. 리턴 타입이 있는 메소드 -  void + 메소드 내부에서 리턴을 포함 : (함수 종료의 의미)
	public void printMethode (int m) {
		if (m < 1 || m > 12) {
			System.out.println("잘못된 입력값 입니다. 1~12 까지만 입력해주세용");
			return ; 			// 메소드를 종료한다는 의미
		}
		System.out.println(m + "월 입니다.");
	}
}
