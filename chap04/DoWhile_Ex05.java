package chap04;

public class DoWhile_Ex05 {

	public static void main(String[] args) {
		
		
		// while 과 do while 비교
		// 1. 첫 조건이 false 인 경우
		
		int a = 0 ;						//첫 회차에 조건이 false 이기 때문에 실행 불가
		while (a < 0) {
			System.out.print(a +" ");
			a++;
		}
		System.out.println();
		System.out.println("===============");
		
		a = 0;
		do {
			System.out.print(a + " ");		//do while 에서는 무조건 1번은 실행됨
			a++;
		} while ( a < 0 );		// false
		System.out.println();
		
		System.out.println("반복 횟수가 1인 경우 ====");
		
		// 2. 반복 횟수가 1인 경우
		a = 0;
		while (a < 1) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a +" ");
			a++;
		} while (a < 1);
		
		System.out.println();
		
		//반복 횟수가 10번인 경우
		a = 0;
		while ( a < 10) {
			System.out.print(a +" ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a +" ");
			a++;
		} while ( a < 10) ;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
