package chap05;

public class ValueAssingment_Ex02 {

	public static void main(String[] args) {

		// 1. 배열 변수의 방에 값 할당하기 1
		
		int[] array1 =new int[3];		// 배열 변수 : array1 / 방 크기 : 3 / 방번호(index) : 0번, 1번, 2번 
				// array1[0], array1[1], array[2]
		
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		
		System.out.println("========");
		
		int[] array2;
		array2 = new int[3];

		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
		
		// 2. 배열 변수의 방에 값 할당하기 2 - 배열 선언과 동시에 값 할당 // 배열의 넣을 초기 값을 알때 사용
					// 방 크기를 선언하는 것이 아니라,, 값들을 선언할 때 자동으로 만들어짐(?)
		int[] array3 = new int[] {6, 7, 8, 9, 10};
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2] +" "+ array3[3]+" "+array3[4]);		
		System.out.println("=========");
		
		int[] array4;
		array4 = new int[] {3, 4, 5};
		System.out.println(array4[2]);
		
		// 3. 배열 변수의 방에 값 할당하기 3
		int[] array5 = {11, 12, 13};
		System.out.println(array5[0] +" "+ array5[1] +" "+ array5[2]);
		System.out.println();
		
//		int[] array6 ;
//		array6 = {11, 12, 13};
//		System.out.println(array6[0]+" "+array6+" "+ array6[2]));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
