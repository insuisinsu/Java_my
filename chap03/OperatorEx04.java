package chap03;

public class OperatorEx04 {

	public static void main(String[] args) {

		/*
		 * 대입 연산자 (=. +=. -=. *=, /=, >>=, <<=, >>>=) : 수식에서 우선순위가 제일 낮음
		 * a = b;   <- b변수의 값을 a 에 할당하라는 의미  / .. '==' 가 '같다' 임
		 * a += b   <- a = a + b
		 * a -= b   <- a = a - b
		 * a *= b   <- a = a * b
		 * a /= b   <- a = a / b
		 * a &= b   <- a = a & b
		 * a |= b   <- a = a | b
		 * a <<= b  <- a = a << b
		 */
		
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		
		
		int value2;  		// 기본형 자료형인 경우 변수의 값을 넣지 않을 경우 기본값으로 0이 할당.
		value2 = 5;			// 참조 자료형일 경우 변수의 값을 할당하지 않을 경우 기본값으로 NULL
		//축약표현
		
		System.out.println(value2 += 2); // value2 = value2 + 2
		System.out.println(value2 -= 2);
		System.out.println(value2 /= 2);
		
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 | 3);  // 0101 | 0011 -> 0111 = 7
		value2 = 5; System.out.println(value2 & 2);  // 0101 & 0010 -> 0000 = 0
		value2 = 5; System.out.println(value2 & 3);  // 0101 & 0011 -> 0001 = 1
		
		value2 = 5; System.out.println(value2 <<= 2); // 0101 <<= 2 , 10100 = 20
		value2 = 5; System.out.println(value2 >>= 2); // 0101 >>= 2 , 0001 = 1

		//논리 시프트
		value2 = 5; System.out.println(value2 >>>= 2); // 0101 >>>= 2 , 
		byte value3;
		value3 = -128; System.out.println(value3 >>>= 2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
