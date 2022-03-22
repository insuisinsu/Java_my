package Chap14.Ex01;

import java.util.Scanner;

/*Error : 프로그래머가 제어할 수 없는 부분
	- OS 에서 발생하는 오류
	- 하드웨어(H/W)에서 발생하는 오류
	
	Exception (예외) : 프로그래머가 제어할 수 있는 부분
	- 예외가 발생되면 프로그램이 종료됨
	--> 예외가 발생되더라도 프로그램이 종료되지 않도록 처리 필요
	=> 예외처리
	
	ArithmeticException
	: 어떤 수를 0으로 나누면 발생하는 예외
	- 컴퓨터는 어떤 수를 0 으로 나눌 경우, 계산 불가

*/


public class CheckedException_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력해보시게나");
		
		int a = sc.nextInt();
		int b = 10;
		
		try {
			// try 블락에서 예외(Exception)이 발생될 경우
		System.out.println(b / a);
		} catch(ArithmeticException e) {
			// catch 블락 이 작동됨
			System.out.println("오류발생 0으로 어떻게 나누냐");
		} finally {
			
		}
		System.out.println("프로그램 종료");
	}
}