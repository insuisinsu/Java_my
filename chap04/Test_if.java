package chap04;

import java.util.Scanner;
public class Test_if {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
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
			System.out.println("������ �����Դϴ�.");
			return;
		}
		System.out.println("��� ���� : " + result +" �Դϴ�.");
		
		sc.close();
		
		
		
		
		
	}

}
