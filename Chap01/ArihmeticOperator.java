package Chap01;

import java.util.Scanner;

public class ArihmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		int time = sc.nextInt(); 		// 스캐너에서 인풋값을 정수로 받아서 time 변수에 할당
		int scond = time % 60; 			// % : 나머지 값 구하기 // 여기서는 초 를 의미
		int minite = (time / 60) %60;    // 분
		int hour = (time / 60) / 60 ;   // 시간
		
		System.out.println(time + "초는");
		System.out.print(hour +"시간 ");
		System.out.print(minite +"분 ");
		System.out.print(scond +"초 입니다.");
	}

}
