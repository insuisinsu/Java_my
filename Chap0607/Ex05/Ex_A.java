package Chap0607.Ex05;

//같은 클래스 내에서 class A 에 접근

public class Ex_A {

	public static void main(String[] args) {

		//A class는 같은 패키지 내부에 존재하므로 import 없이 사용 가능
		
		A a = new A();		// import 없이 사용 ?--> A class 가 같은 패키지 내에 존재
		
		a.m = 10;			// int m 의 접근 제어자가 default이기 때문에 접근 가능
//		a.n = 20;			// int n 의 접근 제어자가 private이기 때문에 접근 불가능
		
		
		
		a.print();
		
	}

}
