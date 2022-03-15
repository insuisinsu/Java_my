package Chap0607.Ex06;

import Chap0607.Ex05.A;

//다른 패키지에서 class A 접근 하기

public class Ex_A {

	public static void main(String[] args) {

		//다른 패키지의 객체를 사용하는 방법
		//1. 클래스 전체 이름 사용
		Chap0607.Ex05.A a = new Chap0607.Ex05.A() ;
		//클래스 전체 이름 : 패키지명.클래스명.
		
//		a.m = 10;	//접근 불가 : default 는 다른 패키지 에서는 접근 불가
		
		a.k = 50;	//접근 가능 : Public 은 다른 패키지의 클래스에서 접근 가능
		a.print2();
		
		//2. import 를 사용해서 접근하는 방법
		A aa = new A();		//import Chap0607.Ex05.A;
		aa.k = 100;
		aa.print2();
		
	}

}
