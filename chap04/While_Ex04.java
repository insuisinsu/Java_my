package chap04;

public class While_Ex04 {

	public static void main(String[] args) {

		//while 의 기본 문법

		int a = 0;					//초기값
		while ( a < 10) {			//조건   // 조건에 만족하면 아래 문장 실행
			System.out.print(a+" ");
			a++;					//증감
		}
			//0, 1, 2, 3, ~ 9 까지 10번 출력
		System.out.println();
		
		//for 로 변환
		for (int i = 0 ; i < 10 ; i++) 	{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int b = 10;
		while ( b > 0) {
			System.out.print(b +" ");
			b--;
		}
		
		System.out.println();
		//for 로 변환
		for ( int i = 10; i > 0; i--) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		//while 의 무한 루프
		/*
		while (true) {
			System.out.println("while 의 무한 루프");
		}
		*/
		
		//while 의 무한 루프 중지
		int c = 0;
		while (true) {
			if (c > 10) {		// c 가 10이 되더라도 false 이기 때문에 10 까지 출력됨
				break;
			}
			System.out.print(c +" ");
			c++;
		}
		System.out.println();
		System.out.println(c);
		
		
		
		
		
		
	}

}
