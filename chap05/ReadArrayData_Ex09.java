package chap05;

public class ReadArrayData_Ex09 {

	public static void main(String[] args) {

		//1. 2차원 데이터 배열의 길이
		int[][] array1 = new int [2][3];
		System.out.println(array1.length);			//2차원 배열인 경우 : .length - 행의 갯수 출력
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		
		//2. 2차원 배열 출력 방법1
		int [][] array2 = new int [][] {{1,2}, {3,4,5}};
		System.out.println(array2.length);
		System.out.println(array2[0].length);
		System.out.println(array2[1].length);
		
		System.out.println();
		System.out.print(array2[0][0] +" "+ array2[0][1]);
		System.out.println();
		System.out.println(array2[1][0] +" "+ array2[1][1] +" "+ array2[1][2]);
		
		
		System.out.println("이중 for=======");
		// 이중 for 를 사용해서 출력하는 방법
		for (int i=0 ; i < array2.length; i++) { 		//바깥쪽 for : 행을 루프 돌린다.
			for ( int j=0 ; j < array2[i].length; j++) {	//안쪽 for : 열을 루프 돌린다.
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("이중 향상된 for==============");
		
		
		for (int[] array: array2) {				// 2차원 배열에서 행의 값을 1차원 배열변수에 담고(array)
			for (int k : array) {				// 배열의 값을 변수에 담아서 출력
				System.out.print(k +" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
