package Chap0607.Ex02;

import java.util.Arrays;

public class FlexbleSizeArrayargument {

	public static void main(String[] args) {

		//배열의 길이가 고정되지 않고 가변길이인 경우
		//1. method1 ( int...values _   <-- 가변길이를 처리하는 input 매개변수 설정
		
		method1 ();
		method1 (1, 2);
		method1 (1, 2, 3);
		method1 (1, 2, 3, 4);
		method1 (1, 2, 3, 4, 5);
		method1 (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 11);
		
		method2 ("안녕", "방가");
		method2 ("월", "화", "수", "목", "금", "토", "일");
		method2 ("토끼", "호랑이", "여우", "곰");
	}

	static void method1 (int...values) {		//values 변수에는 배열을 담은 변수
		System.out.println(values.length);
		System.out.println("====Arrays.toString()====");
		System.out.println(Arrays.toString(values));
		System.out.println("====for====");
		for(int i = 0 ; i < values.length ; i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("====enhanced for=====");
		for(int j : values) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
		
	static void method2 (String...values) {
	System.out.println();
	System.out.println(values.length);
	System.out.println();
	
	System.out.println("Arrays.toString() ======");
	System.out.println(Arrays.toString(values));
	System.out.println();
	
	System.out.println("for =========");
	for ( int i = 0 ; i < values.length ; i++) {
		System.out.print(values[i]+" ");
	}
	System.out.println();
	System.out.println();
	
	System.out.println("enhanced for=======");
	for ( String k : values) {
		System.out.print(k+" ");
	}
	
	
	
	
	}
		
	
	
	
	
	/*
	static void method1 () {
		System.out.println("매개변수가 없는 메소드 호출");
	}
	
	static void method1(int a, int b) {
		System.out.println(a+", "+b);
	}
	
	static void method1(int a, int b, int c) {
		System.out.println(a+", "+b+", "+c);
	}
	
	static void method1(int a, int b, int c, int d) {
		System.out.println(a+", "+b+", "+c+", "+d);
	}
	
	static void method1(int a, int b, int c, int d, int e) {
		System.out.println(a+", "+b+", "+c+", "+d+", "+ e);
	}
	*/
	
	
	
}
