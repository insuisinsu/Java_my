package chap04;

import java.util.Scanner;
public class Test_switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		int num1 = sc.nextInt();
		char operator = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		double result = 0;
		
		switch (operator) {
		case '+' :
			result = num1 + num2 ;
			System.out.println("��� ���� : " + result + "�Դϴ�.");
			break;
		case '-' :
			result = num1 - num2 ;
			System.out.println("��� ���� : " + result + "�Դϴ�.");
			break;
		case '*' : 
			result = num1 * num2 ;
			System.out.println("��� ���� : " + result + "�Դϴ�.");
			break;
		case '/' : 
			result = num1 / num2 ;
			System.out.println("��� ���� : " + result + "�Դϴ�.");
			break;
		default :
			System.out.println("������ �����Դϴ�.");
		}
		
		sc.close();
		
		
		
		
		
		
	}

}
