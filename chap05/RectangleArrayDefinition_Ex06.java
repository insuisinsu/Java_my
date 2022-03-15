package chap05;

public class RectangleArrayDefinition_Ex06 {

	public static void main(String[] args) {

		//2차원 배열 선언하기
		
		//1. 2차원 배열 선언과 방갯수 할당
		int[][] array1 = new int[3][4]; // 3행 4열
		
		//1-2 2차원 배열 선언 후 방갯수 할당
		int[][]	array2;
		array2 = new int[3][4];
		
		//참조변수의 초기값 : int : 0
		System.out.println(array1[0][0]);
		
		//2.
		int array3[][] = new int [3][4];
		int array4[][];
		array4 = new int[3][4];
		
		
		//3.
		int[] array5[] = new int [3][4];
		int[] array6[];
		array6 = new int [3][4];
		
		//4. 다양한 자료형의 배열 선언 (기본 자료형 배열, 참조자료형 배열)
		boolean[][] array7 = new boolean[3][4];		//false
		int[][] array8 = new int[2][4];				//0		/ byte, short, long
		double[][] array9 = new double[3][5];		//0.0	/ float
		String[][] array10 = new String[2][6];		//참조 자료형 의 기본 값은 null
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
