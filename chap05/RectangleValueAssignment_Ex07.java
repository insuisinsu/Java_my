package chap05;

public class RectangleValueAssignment_Ex07 {

	public static void main(String[] args) {

			//1. 배열 객체의 생성 및 원소값 대입
		
		int[][] array1 = new int[2][3];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		
		System.out.println(array1);
		System.out.println(array1[0][0]);
		System.out.println(array1[0][1]);
		System.out.println(array1[0][2]);
		System.out.println(array1[1][0]);
		System.out.println(array1[1][1]);
		System.out.println(array1[1][2]);
		
		System.out.print(array1[0][0] + " " + array1[0][1] +" "+ array1[0][2]);
		System.out.println();
		System.out.print(array1[1][0] + " " + array1[1][1] +" "+ array1[1][2]);
		System.out.println();
		
		
	}

}
