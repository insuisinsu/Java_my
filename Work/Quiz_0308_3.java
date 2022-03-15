package Work;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_0308_3 {
	
	/*
	 Integer.parseInt : int 형으로 변환
	 */
	
	
	static void math(String...values){
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		for(int i = 0; i < values.length; i++) {
			if(i%2 != 0) {
				sum += Integer.parseInt(values[i]);
				count++;
			}
		}
		avg = (double) sum / count;
		System.out.println("전체 구성원은 총 "+sum+" 명 이며, 평균 "+avg+" 명 이다.");
		
	}
	
	public static void main(String[] args) {

		/*
		String 으로 필요한 내용을 받는다.  nextLine
		split , 공백을 사용해서 각 방을 나눠 새로운 배열을 만든다.
		방 번호를 홀짝으로 나눠서 관리 및 출력		
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("운동 숫자 운동 숫자");
		
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		
		if(str.equals("그만")) {
			System.out.println("프로그램 종료");
			return;
		}
		
		for(int i = 0; i < arr.length ; i++) {
			if(i%2 == 0) {
				System.out.print(arr[i]+"는 ");
			}else {
				System.out.print(arr[i]+" 명 ");
			}
		}
		System.out.println("입니다.");
		sc.close();
		math(arr);
		
		
	}

}
