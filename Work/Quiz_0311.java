package Work;

import java.util.Scanner;

public class Quiz_0311 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int nu = 0;		// 스캐너로 번호 인풋 받는 변수
		
		
		
		do {
			System.out.println("===================================================");
			System.out.println(" 1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("===================================================");
			System.out.println("번호를 입력해주세요.");
			nu = sc.nextInt();
			if(nu == 1) {
				for(int i = 1; i < 20; i++) {
					System.out.println(i+" 단");
					System.out.println();
					for(int j = 1; j < 20; j++) {
						System.out.println(i+" x "+j+" = "+i*j);
					}System.out.println();
				}
				
			} else if (nu == 2) {
				for(int i = 1; i < 20; i+=2) {
					System.out.println(i+" 단");
					System.out.println();
					for(int j = 1; j < 20; j++) {
						System.out.println(i+" x "+j+" = "+i*j);
					}System.out.println();
				}
				
			} else if (nu == 3) {
				for(int i = 3; i < 20; i+=3) {
					System.out.println(i+" 단");
					System.out.println();
					for(int j = 1; j < 20; j++) {
						System.out.println(i+" x "+j+" = "+i*j);
					}System.out.println();
				}
		
			} else if (nu == 4) {
				run = false;
			}
		}while(run);
		
		sc.close();
		System.out.println("프로그램 종료");
		
	}

}
