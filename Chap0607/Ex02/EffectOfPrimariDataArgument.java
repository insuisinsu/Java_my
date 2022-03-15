package Chap0607.Ex02;

public class EffectOfPrimariDataArgument {

	int abc ;					//필드 : (Heap영역에 저장) 객체화 시켜야 사용할 수 있음
	
	
	static int twice (int a) {					// 매개변수로 정수를 받아서 *2 한 값을 return
		a = a * 2;
		return a;
	}
	
	
	public static void main(String[] args) {

		int a = 3;								//지역변수 (stack 영역에 변수명과 같이 저장
		int result1 = twice(4);
		System.out.println(result1);
		System.out.println(a);
		System.out.println(twice(a));
		System.out.println();
		
		
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);
		
		
	}

}
