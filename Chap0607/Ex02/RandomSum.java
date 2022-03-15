package Chap0607.Ex02;

import java.util.Scanner;

public class RandomSum {

	static void math(String...values) {
		System.out.println(values.length);
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < values.length; i++) {
			// sum += values[i];
			// values [i] 번째 방의 값이 String 타입이므로 정수타입으로 변환 필요
			sum += Integer.parseInt(values[i]);
			//Integer.parseInt(String) : 숫자형 String 타입을 정수로 변환
			avg = (double)sum/values.length;
			//sum 을 double 타입으로 변경해줘야 함
		}
		System.out.println("입력하신 정수의 합은 "+sum+" 이며 평균은 "+avg+" 입니다.");
	}
	
	
	
	
	public static void main(String[] args) {

		//스캐너로 임의의 정수값을 받아서 합계, 평균
		//임의의 정수값을 받아서 배열 만들기
		//그 배열의 합과 평균
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 만큼 정수를 입력하세요.");
		
		//공백이 들어가므로 전체 정수 값을 String으로 받아서
		//split 는 구분자를 기준으로 글자를 잘라서 배열에 저장
		String num = sc.nextLine();
		String[] arr1 = num.split(" ");
		
		for(int i = 0; i < arr1.length ; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
			
		math(arr1); 	//가변 길이 메소드 math 를 호출하면서 매개변수로 arr1을 넣어줌
						//arr1 이 String...values 로 들어감
		
	} 
	
}







//		int[] arr = new int[];
//		int size = arr.length;
//		
//		for(int i = 0; i < size.length ; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		
//				
//		
//	}
//
//	static void arr (int...values) {
//		int sum = 0;
//		int aver = 0;
//		
//		for(int i = 0; i < values.length ; i++) {
//			sum += values[i];
//			aver = sum/values.length;
//		}
//		
//		System.out.println(sum);
//		System.out.println(aver);
