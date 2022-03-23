package Chap14.Ex03;


// 여러 개의 Exception 이 동시에 발생할 경우 처리
public class MultiCatch_1 {

	public static void main(String[] args) {

		//1. 단일 Exception 처리
		// try catch

		//ArithmeticException
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			//catch 블락에 아무 내용이 없어도 예외처리 됨
			System.out.println("정상 출력 ArithmeticException");
		} // finally 는 있어도, 없어도 상관 없음
		
		//NumberFormatException
		try {
			int num = Integer.parseInt("10A");
		}catch(NumberFormatException e) {
			System.out.println("정상 출력 NumberFormatException");
		}
		System.out.println("=======================");
		//2. 다중 Exception 처리
		
		//try 블락에서 여러 예외가 발생된 경우
		try {
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		}catch(ArithmeticException | NumberFormatException e){
			System.out.println("다중 예외 처리");
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
	}

}
