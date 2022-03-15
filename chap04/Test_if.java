package chap04;

import java.util.Scanner;
public class Test_if {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("수식을 입력하세요.");
		
		double num1 = sc.nextInt();
		char operator = sc.next().charAt(0);
		double num2 = sc.nextInt();
		
		double result = 0;
		
		if (operator == '+') {
			result = num1 + num2 ;
		}
		else if (operator == '-') {
			result = num1 - num2 ;
		}
		else if (operator == '*') {
			result = num1 * num2 ;
		}
		else if (operator == '/') {
			result = num1 / num2 ;
		}
		else {
			System.out.println("연산자 오류입니다.");
			return;
		}
		System.out.println("결과 값은 : " + result +" 입니다.");
		
		sc.close();
		
		
		
		
		
	}

}
