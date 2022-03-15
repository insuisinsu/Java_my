package chap05;

public class NonRectangleArray_Ex08 {

	public static void main(String[] args) {

		
		//1. 비정방형(nopnRectangle) 선언과 값 대입 방법
		// 비정방형이란? 행에 따라서 열의 갯수가 각각 다른
		int[][] array1 = new int[2][];		// 행의 갯수만 생성하여 방의 크기를 만든다.
		array1[0] = new int[2];				// index 0 행에 열 2개 생성
		array1[0][0] = 1;
		array1[0][1] = 2;
		
		array1[1] = new int[3];				// index 1 행에 열 3개 생성
		array1[1][0] = 3;
		array1[1][1] = 4;
		array1[1][2] = 5;

		System.out.print(array1[0][0] +" "+ array1[0][1]);
		System.out.println();
		System.out.println(array1[1][0]+" "+array1[1][1]+" "+array1[1][2]);
		System.out.println();
		
		int [][] array2 = new int[2][];
		array2[0] = new int[] {1, 2};
		array2[1] = new int[] {3, 4, 5};
		
		
		// 2. 비정방형(NonRectangle) 선언과 값 대입 방법 2
		int[][] array3 = new int[][] {{1,2}, {3,4,5}};
		
		// 3.
		int[][] array5 = {{1,2},{3,4,5}};		// 선언과 동시에 할당은 new int 생략 가능
		//int[][] array6;						// 선언과 할당을 따로하면 new int 생략 불가능
		//array6 = {{1,2},{3,4,5}};
		
		
		
		
	}

}
