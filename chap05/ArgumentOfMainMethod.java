package chap05;

public class ArgumentOfMainMethod {
	public static void main(String[] ar) {		// 메인 메소드[함수,
		//메소드의 기본 구조
		/*
		 * 
		 * void main(String[] args) {       		//void : 리턴 값이 없을 때
		 * 		메소드 호출시 실행할 코드;				//main : 메소드명
		 * }										// (인풋 매개변수)
		 */
		
		
		String a = ar[0];	// "안녕하세요" 	: 문자열 전송
		String b = ar[1];	// 3			: 정수
		String c = ar[2];	// 3.8			: 실수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// main 메소드에 인자값으로 정수나 실수를 넘겨줄 때 String 타입으로 변환된다.
		System.out.println(b + 1);	// 3 과 1 --> 31			
		System.out.println(c + 1);	// 3.8 과 1 -- 3.81
		
		//String 을 정수나 더블 형으로 변환해서 연산
		int d = Integer.parseInt(b);
		double e = Double.parseDouble(c);
		
		System.out.println(d + 1);
		System.out.println(e + 1);
		
		
		
		
	}
}
