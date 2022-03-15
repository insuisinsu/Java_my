package chap03;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		int data = 13;
		
		System.out.println(Integer.toBinaryString(data)); // 2진수로 변환
		System.out.println(Integer.toOctalString(data));  // 8진수
		System.out.println(Integer.toHexString(data));    // 16진수
		
		System.out.println(Integer.parseInt("1101", 2));  // 2진수 1101을 10진수로 변환
		System.out.println(Integer.parseInt("15", 8));
		System.out.println(Integer.parseInt("0D", 16));
		System.out.println("==========");
		
		System.out.println(~3); // 양수를 ~ 를 하면, 음수 : 0을 기준으로 계산 +1
		System.out.println(~7);
		
		//다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101); 	// 0b 2진수 표현
		System.out.println(015);		// 0  8진수 표현
		System.out.println(0x0D);		// 0x 16진수 표현
		System.out.println("======");
	
		
		
	}

}
