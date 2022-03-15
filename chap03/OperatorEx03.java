package chap03;

public class OperatorEx03 {

	public static void main(String[] args) {

		/*
		 * 논리 연산자 (&&, ||, ^, !) : 쇼트 서킷이 발생됨 
		 * 비트 연산자 (&, |, ^)      : 쇼트 서킷이 발생되지 않음
		 * .쇼트 서킷 : 앞부분의 연산 결과를 인지할 수 있을 때 뒷부분은 연산을 생략
		 */
		
		//1. 논리 연산자 AND (&&)
		
		System.out.println(true && true); //true, 쇼트 서킷이 발생되지 않음
		System.out.println(true && false); // false, 쇼트 서킷이 발생되지 않음
		System.out.println(false && true); // false, 쇼트 서킷 발생..
		System.out.println(true && (5 < 3)); // false
		System.out.println((5 <= 5) && (7 > 2)); //true
		System.out.println((3 < 2) && (8 < 10)); //false, 쇼트 서킷 발생
		
		//2. 논리 연산자 OR (||)
		System.out.println(true || true); // true, 쇼트 서킷 발생 (앞에가 true 라서 뒤에 계산 ㄴㄴ)
		System.out.println(false || (5<3));
		
		//3. 논리 연산자 XOR (^) :  두 값이 같다면 False, 두 값이 다르다면 True
		System.out.println(true ^ true); // false
		System.out.println(false ^ false); // false
		System.out.println(true ^ false); 	// true
		System.out.println(false ^ true);  //true
		System.out.println((5<=5) ^ (7>2)); //false
		System.out.println("=========");
		
		//4. 논리 연산자 NOT (!) : true 임녀 false, false 이면 true
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5<3)); //true
		
		// 숏 서킷 사용 여부 (논리 연산자일 때 발생. 비트연산자일 때는 발생되지 않음)
		int value2 = 3;
		System.out.println(false && ++value2 > 6); // false, 쇼트서킷 발생
		System.out.println(value2); //3, 위에 false에서 쇼트서킷이 발생해서 뒷부분(++value2 > 6)을 연산하지 않아 3이됨
		
		int value34 = 3;
		System.out.println(true && ++value34 > 6); //false, 쇼트 서킷이 발생하지 않아서 ++value34 가 연산되어 4가 됨
		System.out.println(value34);
		
		int value3 = 3;
		System.out.println(false & ++value3 > 6); //false, 비트연산자는 쇼트 서킷이 발생하지 않아서 ++value3 가 연산되어 4가 됨
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true || ++value4 > 6); //true, 앞에가 true 라서 쇼트 서킷 발생, ++value4는 연산하지 않음
		System.out.println(value4); // 3
		
		int value5 = 3;
		System.out.println(true | ++value5 > 6);  //true, 비트연산자는 쇼트 서킷이 발생하지 않음
		System.out.println(value5); // 4
		
		
		
		
		
		
		
	}

}
