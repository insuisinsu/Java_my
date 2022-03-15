package chap04;

public class For_Ex03 {

	public static void main(String[] args) {

		
		//For 기본 작동
		
		int a;		//전역변수 // 블락 밖에서 선언된 변수, 변수에 메모리만 선언 되었고, 초기값 (x)
		
		for (a = 0 ; a < 3 ; a++) {
			System.out.print(a + " ");
		}
		System.out.println(a);
		
		System.out.println("============");
		
		for (int b = 0 ; b < 10 ; b++) {
			System.out.println(b);
		}
		// System.out.println(b); 	// 변수 b 가 for 문의 {} 안에서 선언되었기 때문에 for 의 {} 안에서만 사용 가능
		System.out.println("============");
		
		int c;
		for ( c = 5 ; c > -2 ; c-- ) {
			System.out.println(c);
		}
		System.out.println("============");
		
		//2의 배수 출력
		for (int i = 0 ; i < 100 ; i += 2) {
			System.out.print(i+" ");
		}
		System.out.println("============");
		// for 내에서 초기값과 증가값은 여러 변수를 할당할 수 있다.
		for (int i=0, j=0 ; i < 10 ; i++, j++) {
			System.out.println(i + " * " + j + " : " + (i * j));
		}
		
		// for 를 사용해서 1~10을 출력
		int s = 1 ;
		for (int i = 1 ; i <= 10 ; i++) {
			s *= i ; //s = s * 1
		}
		
		System.out.println(s);
		
		int x = 0;
		for (int y = 1 ; y <= 100 ; y++) {
			x += y;
		}
		System.out.println(x);
		System.out.println("구구단 출력");
		
		// 이중 for 를 활용하여 구구단 1 단 ~ 9 단 출력
		for ( int i = 1; i <= 9 ; i++) {
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println("===========");
		}
		
		/* for 에서 무한 루프 발생
		 * 
		 * 	1. 조건이 없을 경우
		
		for (int i = 0;; i++) {
			System.out.print(i+" ");
		}
		
			2. 초기값, 조건값, 증감값이 없을 경우
		for (;;) {
			System.out.println("무한 루프")
		}
		
		*/
		
		System.out.println("=============");
		
		// for 에서 if, break 를 사용하여 무한 루프 탈출
		for ( int i = 0 ; ; i++) {
			
			if ( i > 100) {
				break;					// 무한 루프 종료
			}
 			System.out.println(i);
		}
		
		// for 를 사용해서 1 ~ 1000 범위에서 4의 배수만 더한 값과 평균(double) 값
		
		double sum = 0 ;
		int p = -1;
		for (int i = 0 ; i <= 1000 ; i+=4) {
			sum += i;
			p++;
		}
		System.out.println("1000 이하의 4의 배수를 모두 더한 값 : " + sum);
		System.out.println("1000 이하의 4의 배수를 모두 더한 값의 평균: " + sum/p);
		
		double sum1 = 0;  // 4의 배수를 더한 값
		double j = 1;		// 4의 배수를 카운트 하는 값
		for (int i = 0; i <= 1000 ; i++) {
			if (i % 4 == 0) {
				sum1 += i ;
				j++ ; // 연산을 1000 이하의 4의 배수 만큼 실행함
			}
		}
		System.out.println(sum1);
		System.out.println(sum1/j);
		
		
		
		
		
		
		
		
	}

}
