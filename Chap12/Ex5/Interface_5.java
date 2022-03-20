package Chap12.Ex5;


//방법1. : 객체 생성 후 구현
//방법2. : 익명 클래스 이용

//인터페이스 선언 : 주로 기업의 높은 사람이 함
interface A{
	double PI = 3.14;
	void run();
}

class B implements A{
	@Override
	public void run() {
		System.out.println("달려봅시당");
	}
}

public class Interface_5 {

	public static void main(String[] args) {
		//1. 객체 생성 후 구현
		A a = new B();
		a.run();
		
		A a1 = new B() {
			public void run() {
				System.out.println("날아봅시당");
			}
		};
		a1.run();
		
	}

}
