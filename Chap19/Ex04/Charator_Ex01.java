package Chap19.Ex04;

public class Charator_Ex01 {

	public static void main(String[] args) {

		char ch1 = 'A';						//char : 2byte
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch1_1 = 'a';
		System.out.println(ch1_1);
		System.out.println((int)ch1_1);
		
		char ch2 = 'Z';
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		//2. char 에 정수(아스키 코드) 로 저장할 수 있다.
		
		char ch3 = 66;				//char에 정수 값으로 저장 가능
		System.out.println(ch3);
		System.out.println((char)ch3);
		System.out.println((int)ch3);
		
//		int -> char
		int ch4 = 129;
		System.out.println(ch4);
		System.out.println((char)ch4);
		System.out.println((int)ch4);
		
		
		
		
	}

}
