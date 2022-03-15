package chap05;

import java.util.Arrays;

public class ReadArrayData_Ex05 {

	public static void main(String[] args) {

		int[] array = new int[] {3, 4, 5, 6, 7};
		
		// 1. 배열의 방 (index)의 길이 구하기
		System.out.println(array.length);
		
		// 2. 출력하기 1 : 방 번호를 직접 찍어서 출력 : 특정 방 번호의 값을 출력
		System.out.print(array[0]+" ");
		System.out.print(array[1]+" ");
		System.out.print(array[2]+" ");
		System.out.print(array[3]+" ");
		System.out.print(array[4]+" ");
		//System.out.print(array[5]+" "); // ArrayIndexOutOfBoundsException, 방 번호를 초과한 경우 출력시 오류
		System.out.println();
		
		// 2. 출력하기 2 : for 사용하여 특정 범위를 지정해서 출력 가능
		for ( int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
		System.out.println();
		
		// for 를 사용하여 특정 범위만 출력하기
		for (int i = 0 ; i < 3 ; i++) {
			System.out.print(array[i]+" ");
		}
		
		// 2. 출력하기 3 : 향상된 for, 처음 방 부터 마지막 방 까지 순환 하면서 출력
						// 단, 범위를 지정해서 출력할 수 없다. // 구문은 for 문에 비해 짧다
		
		for ( int k : array) {			//for (출력할 자료형 변수 : 배열변수) { 실행문, k 출력}
			System.out.print(k +" ");
		} System.out.println();
		
		// 2. 출력하기 5 : Arrays.toString(배열변수명) // 배열 변수의 모든 값을 출력
		System.out.println(Arrays.toString(array));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
