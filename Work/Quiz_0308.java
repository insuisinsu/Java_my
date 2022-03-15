package Work;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_0308 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("운동이름과 구성원 수를 공백을 이용해서 입력하세용");
		System.out.println("예) 탁구 2 야구 9 축구 11 농구 6 씨름 2");
		
		String str ;		//전체 String 값을 인풋받는 변수
		String[] arr ;		//공백을 기준으로 잘라서 저장하는 배열의 변수
		int sum = 0;		//구성원 수의 합
		int memberCount = 0;
		double avg = 0;		//구성원의 평균 : sum / 종목의 수
		int b = 0;			//각 종목의 구성원을 담는 변수
		
		
		do {
			str = sc.nextLine();		//sc.next() 공백까지만 String
										//sc.nextLine() 엔터까지 전체를 String
			if(str.equals("그만")) {break;}	// str은 참조자료형이므로 == 이 아닌 str.equals() 사용
			
			arr = str.split(" ");		//str을 공백을 기준으로 잘라서 arr 배열에 저장 
			
			for (int i = 0; i < arr.length ; i++) {		//arr.length : 배열의 index 0 ~ 마지막 방 까지
				if (i%2 != 0) {			// i : 방의 번호,, 숫자만 가지고 온다.
					b = Integer.parseInt(arr[i]);		// 각 방의 String 타입을 정수로 변환
					sum += b;			// sum = sum + b // sum : 전체 구성원의 합
					memberCount++;		// if 조건을 만족한다 = 한 종목의 구성원을 카운트 했다 = 종목을 카운트 했다
				}
			}
			avg = (double) sum / memberCount;	//평균
			
			System.out.println(str);
			System.out.println("구성원의 총합 : "+sum);
			System.out.println("구성원의 평균 : "+avg);
			
			
		} while(true);
		
		
		
	}

}









