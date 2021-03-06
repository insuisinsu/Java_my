package Chap18.Ex031;

import java.util.Scanner;

//1. 스캐너를 사용해요  double 두 개를 인풋 받음
//2. 방법1. 람다식 사용, 인풋 받은 두 값을 사칙연산
//3. 방법2. 인터페이스를 구현한 자식 객체를 사용해서 인풋받은 두 값을 사칙연산
//4. 방법3. 익명 이너 클래스를 사용해서 사칙연산
//5. int 일 경우에는 ArithmeticException 처리 필요 : 0 으로 나누면 발생함
	// double 은 예외처리가 되어있음

@FunctionalInterface
interface Arithmetic {
	
		void arithmeticOpr(double a, double b);
	
}

class A implements Arithmetic{
	@Override
	public void arithmeticOpr(double a, double b) {
		System.out.println("방법2. 인터페이스 구현");
		System.out.print(" + : "+(a+b)+" ");
		System.out.print(" - : "+(a-b)+" ");
		System.out.print(" * : "+(a*b)+" ");
		System.out.println(" / : "+(a/b)+" ");
	}
}


public class ArithmeticOperation2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("실수 두 개 입력하세요");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		//방법1
		
		Arithmetic ar1 = (x, y) -> {				//얘는 왜 a, b 못 들어감?
			System.out.println("방법1. 람다식");
			System.out.print(" + : "+(a+b)+" ");
			System.out.print(" - : "+(a-b)+" ");
			System.out.print(" * : "+(a*b)+" ");
			System.out.println(" / : "+(a/b)+" ");
		};
		ar1.arithmeticOpr(a, b);
		
		//방법2
		Arithmetic a1 = new A();
		a1.arithmeticOpr(a, b);
		
		//방법3
		Arithmetic ar2 = new Arithmetic() {
			
			@Override
			public void arithmeticOpr(double a, double b) {
				System.out.println("방법3. 익명 이너 클래스");
				System.out.print(" + : "+(a+b)+" ");
				System.out.print(" - : "+(a-b)+" ");
				System.out.print(" * : "+(a*b)+" ");
				System.out.println(" / : "+(a/b)+" ");
			}
		};
		ar2.arithmeticOpr(a, b);
		
		
		sc.close();
		System.out.println();
		System.out.println("시스템 종료");
	}

}
