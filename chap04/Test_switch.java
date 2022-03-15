package chap04;

import java.util.Scanner;
public class Test_switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("수식을 입력하세요.");
		
		int num1 = sc.nextInt();
		char operator = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		double result = 0;
		
		switch (operator) {
		case '+' :
			result = num1 + num2 ;
			System.out.println("결과 값은 : " + result + "입니다.");
			break;
		case '-' :
			result = num1 - num2 ;
			System.out.println("결과 값은 : " + result + "입니다.");
			break;
		case '*' : 
			result = num1 * num2 ;
			System.out.println("결과 값은 : " + result + "입니다.");
			break;
		case '/' : 
			result = num1 / num2 ;
			System.out.println("결과 값은 : " + result + "입니다.");
			break;
		default :
			System.out.println("연산자 오류입니다.");
		}
		
		sc.close();
		
		
		
		
		
		
	}

}
