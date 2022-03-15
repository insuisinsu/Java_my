package chap03;

public class OperatorEx06 {

	public static void main(String[] args) {
		
		/*
		 * 논리 쉬프트를 이용해서 각 비트의 위치 값을 알아내기
		 */
		
		int flags = 0b10110110;
		System.out.println(flags >>> 0 & 1);	// 0번째 자리의 비트값
		System.out.println(flags >>> 1 & 1);	// 1번째 자리의 비트값
		System.out.println(flags >>> 2 & 1);	// 2번째 자리의 비트값
		System.out.println(flags >>> 3 & 1);	// 3번째 자리의 비트값
		System.out.println(flags >>> 4 & 1);	// 4번째 자리의 비트값
		System.out.println(flags >>> 5 & 1);	// 5번째 자리의 비트값
		System.out.println(flags >>> 6 & 1);	// 6번째 자리의 비트값
		System.out.println(flags >>> 7 & 1);	// 7번째 자리의 비트값
		
		
	}

}
