package chap03;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		int a = sc.nextInt();
		if (a % 3 == 0) {
			System.out.println("3의 배수 입니다.");		
		}else {
			System.out.println("3의 배수가 아닙니다.");		
		}
		sc.close();
	}

}
