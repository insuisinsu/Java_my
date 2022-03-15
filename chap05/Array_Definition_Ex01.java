package chap05;

public class Array_Definition_Ex01 {

	public static void main(String[] args) {

		/*
		 * 배열 변수 선언 특징
		 * 	. 배열은 하나의 배열 변수에 많은 데이터를 저장
		 * 	. 배열은 선언 시 동일한 자료형의 값을 저장
		 * 		cf) 컬렉션은 여러 데이터 타입 저장 가능
		 * 	. 배열은 배열의 값을 저장할 방 크기를 지정 / 방 크기 변경 불가
		 * 		cf) 컬렉션은 방 크기가 자동으로 늘어남
		 * 	.
		 */
		
		// 배열 선언 방법 1 - 자료형[]
		
		int[] array1 = new int [3]; // <- 방크기는 3 // 배열을 선언과 동시에 배열의 방크기를 할당
		// array1 -> stack(값들의 번지? 주소만 있음)  //  new -> 객체를 생성하는 명령어  // 배열 변수에 들어가는 값 들은 heap에 있다
		
		int[] array2;				// 배열의 변수 선언
		array2 = new int[3];		// 배열 변수의 방크기 지정
		
		
		// 배열 선언 방법 2 - 변수명[]
		
		int array3[] = new int[3];	// 배열 변수 선언과 동시에 배열의 방크기를 할당
		
		int array4[];				// 배열의 변수 선언
		array4 = new int[4];		// 배열 변수의 방크기 지정
		
		// 다양한 배열 선언 (기본 자료형 배열, 참조 자료형 배열)
		
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9]; // 참조 자료형 배열
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
