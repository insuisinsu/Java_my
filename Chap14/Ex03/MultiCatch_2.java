package Chap14.Ex03;

public class MultiCatch_2 {

	public static void main(String[] args) {

		
		//1. Exception 에서 모든 예외를 처리할 수 있음
		
		try {
			System.out.println(10/0);
			int num1 = Integer.parseInt("10A");
		}catch(Exception e) {
			//try {} 에서 발생하는 모든 예외는 Exception 클래스가 모두 처리
			System.out.println("예외 처리(Excpetion)");
		}
		
		//2. catch  블락의 순서가 잘못된 경우
		// 작은 범위 -> 큰 범위로 가야됨
		// 아래의 경우 : 범위가 큰 Exception 이 먼저 왔기 때문에 오류 발생
		/*
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch(Exception e) {
			System.out.println("예외 처리(Excpetion)");
		}catch(ArithmeticException e) {
			
		}catch(NumberFormatException) {
			
		}
		*/
		
		//3. catch 블락의 옳바른 순서
		// : 최상위에 있는 Exception 클래스가 마지막에 와야 됨
		try {
			System.out.println(10/0);
			int num2 = Integer.parseInt("1!");
		}catch(ArithmeticException e){
			System.out.println("Exception 의 하위 클래스1");
		}catch(NumberFormatException e) {
			System.out.println("Exception 의 하위 클래스2");
		}catch(Exception e) {
			System.out.println("예외 처리(Excpetion)");
		}
		
		//4. 여러개의 Exception 을 통합해서 적용
		// | 또는 사용하면 됨
		try {
			System.out.println(10/0);
			int num3 = Integer.parseInt("10A");
		}catch(ArithmeticException | NumberFormatException e) {
			
		}catch(Exception e) {
			//try {} 에서 발생하는 모든 예외는 Exception 클래스가 모두 처리
			System.out.println("예외 처리(Excpetion)");
		}
		
		
		
		
		
		
	}

}
