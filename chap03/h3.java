package chap03;

import java.util.Scanner;

public class h3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		int a = scan.nextInt();
			
		if(a % 6 == 0) {
			System.out.println("3의 배수이면서 6의 배수 입니다.");
		}
		else if (a % 3 == 0){
			System.out.println("3의 배수이지만 6의 배수는 아닙니다.");
		}
		else {
			System.out.println("3의 배수도 6의 배수도 아닙니다.");
		}
		
	}
		

}
