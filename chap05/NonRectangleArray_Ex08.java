package chap05;

public class NonRectangleArray_Ex08 {

	public static void main(String[] args) {

		
		//1. ��������(nopnRectangle) ����� �� ���� ���
		// ���������̶�? �࿡ ���� ���� ������ ���� �ٸ�
		int[][] array1 = new int[2][];		// ���� ������ �����Ͽ� ���� ũ�⸦ �����.
		array1[0] = new int[2];				// index 0 �࿡ �� 2�� ����
		array1[0][0] = 1;
		array1[0][1] = 2;
		
		array1[1] = new int[3];				// index 1 �࿡ �� 3�� ����
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
		
		
		// 2. ��������(NonRectangle) ����� �� ���� ��� 2
		int[][] array3 = new int[][] {{1,2}, {3,4,5}};
		
		// 3.
		int[][] array5 = {{1,2},{3,4,5}};		// ����� ���ÿ� �Ҵ��� new int ���� ����
		//int[][] array6;						// ����� �Ҵ��� �����ϸ� new int ���� �Ұ���
		//array6 = {{1,2},{3,4,5}};
		
		
		
		
	}

}
