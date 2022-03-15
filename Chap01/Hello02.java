package Chap01;

public class Hello02 {
	//메소드 선언 (메소드 : 객체지향 언어에서 함수를 메소드라고 호칭한다.)
			   // 함수 : 인풋값을 넣어서 그로그램에 따라 결과를 출력
	
	public static int sum (int n, int m) {
		return n+m;
	}
	
	public static void main(String[] args) {

		// 변수 선언
		int i = 20; // i 변수는 정수만(int) 넣을 수 있고, 초기값으로 20을 할당했음
		int s ;     // s 변수는 정수값만(int) 넣을 수 있고, 초기값은 비워둠
		char a ;    // a 변수는 한 글자(char)만 넣을 수 있음. (char 는 아스키값), char 값에는 ""가 아닌 ''을 사용하여 값을 할당
		String b ;  // 
		
		b = "오늘의 날씨는 춥습니다";
		
		s = sum (i,10); // sum 메소드 호출
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		
		System.out.println(b);
	}

}
