package Work;

import java.util.Scanner;

public class Quiz_0308_1 {

	static void math(String... values) {
		int sum = 0;		// 들어오는 정수를 합하는 변수
		double avg ;
				
		for (int i = 0; i < values.length; i++) {
			// sum = sum + values[i]; // values [i] 번째 방의 값이 String 타입이므로 정수타입으로 변환
			// sum = sum + Integer.parseInt(values[i]);	// values
						// Integer.parseInt(String) : 숫자형 String 타입을 정수로 변환
			if (i%2 !=0) {
			sum+= Integer.parseInt(values[i]);
			}
		}
		avg = (double) sum / values.length;	// 평균은 : double 타입이어야 한다.
				
		System.out.println("운동종목의 구성원 총 합계 : " + sum);
		System.out.println("운동종목의 평균 구성원 수 : " + avg * 2);
		}
	
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 운동의 이름과 운동의 구성원 수를 작성 해주세요. >>>");
				
		String num = sc.nextLine();	// 공백이 들어가므로 전체 정수 값을 String
		String[] array1 = num.split(" ");	// split는 구분자를 기준으로 글자를 잘라서 배열에 저장
		if(num.equals("그만")) {
            System.out.println("프로그램을 종료합니다");
            return;
		}
		System.out.println("<<운동종목 : 구성원>>");
		for(int i=0; i<array1.length; i++) {	// 입력 값을 출력
			if(i%2 == 0) {
				System.out.print(array1[i] + " : ");
			}
			else if (i%2 != 0) {
			System.out.print(array1[i] + ". ");
			}
		}
		System.out.println();
		sc.close();
		math(array1);	// 기변 길이 메소드 math를 호출하면서 매개변수로 array1을 넣어주면 된다.
		
	}
		
}
