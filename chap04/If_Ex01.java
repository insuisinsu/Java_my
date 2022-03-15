package chap04;

public class If_Ex01 {

	public static void main(String[] args) {

		/*
		 * if 문 (조건) {
		 * 		조건이 참일 때 실행될 코드;
		 * }
		 */
		
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("실행1 : 조건이 참일 때 실행");
		}
		
		/*
		 * if (조건) {
		 * 		조건이 참일 때 실행될 코드;
		 * } else {
		 * 		조건이 거짓일 때 실행할 문장;
		 * }
		 */
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool2) {
			System.out.println("실행3");
		} else {
			System.out.println("실행4");
		}
		
		//if ~ else  는 삼항 연산자로 변환 가능
		System.out.println((bool1) ? "실행3" : "실행4");
		
		/*
		 * if의 조건이 여러 개 일때
		 * 
		 * if (조건1) {
		 * 		조건1이 참일 때 실행
		 * } else if (조건2) {
		 * 		조건2가 참일 때 실행
		 * } else if (조건3) {
		 * 		조건3이 참일 때 실행
		 * } else {
		 * 		위의 조건이 모두 만족하지 않을 때 실행
		 * }
		 */
		
		int value3 = 85;
		
		if (value3 >= 90) {
			System.out.println("A, 점수 : " + value3);
		}else if (value3 >= 80) {
			System.out.println("B, 점수 : " + value3); // 실행 후에 if문을 빠져나옴
		}else if (value3 >= 70) {
			System.out.println("C, 점수 : " + value3);
		}else {
			System.out.println("F, 점수 : " + value3);
		}
		
		/*
		 * if 문에서 조건의 순서가 바뀌어 있을 경우
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
