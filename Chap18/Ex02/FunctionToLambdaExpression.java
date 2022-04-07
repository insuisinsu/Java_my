package Chap18.Ex02;

//람다식 문법

// 아래 4 개의 인터페이스는 함수형 인터페이스 임.
// -> 람다식으로 가능!
@FunctionalInterface
interface A {			//입력 X, 리턴X
	void method1();
}

@FunctionalInterface
interface B {			//입력 O, 리턴X
	void method2(int a);
}

@FunctionalInterface
interface C {			//입력 X, 리턴O
	int method3();
}

@FunctionalInterface
interface D{			//입력 O, 리턴O
	double method4(int a, int b);
}


public class FunctionToLambdaExpression {

	public static void main(String[] args) {

//		인터페이스의 구현되지 않은 함수를 람다식으로 구현
		
//		1. 입력 X, 리턴 X
//		1) 익명 이너클래스로 처리
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("method1 - 익명이너클래스");
			}
		};
		a1.method1();
		
//		2) 람다식으로 처리
//		   람다식은 '리턴 타입', '메소드 이름' 을 제거하면 됨
//		   (인풋) -> {구현부}; 
		//람다식 전체
		A a2 = () -> {System.out.println("method1 - 람다식, 기본");};

		//구현부에 한 라인만 존재할 때 {}; 생략 가능
		A a3 = () -> System.out.println("method1 - 람다식, 축약");
		
		a2.method1();
		a3.method1();
		
//		2. 입력 O, 리턴 X
//		1) 익명 이너 클래스로 처리
		
		B b1 = new B() {
			public void method2(int a) {
				System.out.println("method2 - 익명 이너 클래스 - " + a);
			};
		};
		b1.method2(0);
		
//		2) 람다식으로 처리
		B b2 = (int a) -> {System.out.println("method2 - 람다식, 기본 - "+a);};
		b2.method2(0);
		B b3 = (a) -> {System.out.println("method2 - 람다식, 축약1 - " + a);}; 	//입력 매개변수의 타입은 생략 가능
		b3.method2(0);
		B b4 = (a) -> System.out.println("method2 - 람다식, 축약2 - " + a);		//실행문이 한 라인일 때 { }; 생략 가능
		b4.method2(0);
		B b5 = a -> System.out.println("method2 - 람다식, 축약3 - " + a);		//입력 매개변수가 하나일 때 () 생략 가능
		b5.method2(0);
		
//		3. 입력X, 리턴O
//		1) 익명 이너 클래스
		C c1 = new C() {
			public int method3() {
				return 3;
			};
		};
		System.out.println("method3 - 익명 이너 클래스 - " + c1.method3());
		
//		2) 람다식으로 처리
		C c2 = () -> {return 3;};
		System.out.println("method3 - 람다식, 기본 - " + c2.method3());
		C c3 = () -> 3;													//리턴이 한 라인일 때 {return } 생략 가능
		System.out.println("method3 - 람다식, 기본 - " + c3.method3());
		
//		4. 입력 O, 리턴 O
//		1) 익명 이너 클래스
		D d1 = new D() {
			public double method4(int a, int b) {
				return a+b;
			};
		};
		System.out.println("method4 - 익명 이너 클래스 - "+d1.method4(1, 2));
		
//		2) 람다식
		D d2 = (int a, int b) -> {return a + b;};
		System.out.println("method4 - 람다식, 기본 - " + d2.method4(1, 2));
		D d3 = (a, b) -> {return a + b;};		//인풋 타입은 생략 가능
		D d4 = (a, b) -> a + b;					//리턴이 하나일 때 return 과 {} 생략 가능  // 매개변수가 2개 이상이면 () 생략 불가
		

		
		
		
		
		
		
		
		
	}

}
