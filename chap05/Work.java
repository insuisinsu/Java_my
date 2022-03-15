package chap05;

import java.util.Arrays;

public class Work {

	public static void main(String[] args) {

		
	//1.
		
	int[] arr1 = new int[100];
	//for 를 사용해서 arr1 배열의 각 방에 값을 입력
	for (int i = 0; i < arr1.length; i++) 	{
		arr1[i] = i + 1;
	}
	
	//for 를 사용한 출력
	for ( int i = 0; i < arr1.length ; i++) {
		System.out.print(arr1[i] +" ");
	}
	System.out.println();
	
	
	//향상된 for 를 사용한 출력
	for (int k : arr1) {
		System.out.print(k+" ");
	}
	System.out.println();
	
	
	//Arrays.toString() 을 사용한 출력
	System.out.println(Arrays.toString(arr1));
	
	
	
	//2. 3배수
	
	int[] arr2 = new int[300];
	//for 를 사용해서 arr2 배열의 각 방에 3배수 값을 입력
	for (int i = 0; i < arr2.length; i++) 	{
		arr2[i] = (i + 1)*3;
	}
	
	//for 를 사용한 출력
	for ( int i = 0; i < arr2.length ; i++) {
		System.out.print(arr2[i] +" ");
	}
	System.out.println();
	
	
	//향상된 for 를 사용한 출력
	for (int k : arr2) {
		System.out.print(k+" ");
	}
	System.out.println();
	
	
	//Arrays.toString() 을 사용한 출력
	System.out.println(Arrays.toString(arr2));
	
	
	
	//3. 3배수 홀수 방 (100~300)
	//for 를 사용한 출력
	for (int i = 101; i < arr2.length ; i+=2) {
		System.out.print(arr2[i]+" ");
	}
	/*
	 * for (int i = 100 ; i < arr2.length ; i++) {
	 * 		if (i%2 == 1)
	 * system.out.println(arr2[i]);
	 * }
	 */
	
	
	}

}
