package chap05;

import java.util.Arrays;

public class Work {

	public static void main(String[] args) {

		
	//1.
		
	int[] arr1 = new int[100];
	//for �� ����ؼ� arr1 �迭�� �� �濡 ���� �Է�
	for (int i = 0; i < arr1.length; i++) 	{
		arr1[i] = i + 1;
	}
	
	//for �� ����� ���
	for ( int i = 0; i < arr1.length ; i++) {
		System.out.print(arr1[i] +" ");
	}
	System.out.println();
	
	
	//���� for �� ����� ���
	for (int k : arr1) {
		System.out.print(k+" ");
	}
	System.out.println();
	
	
	//Arrays.toString() �� ����� ���
	System.out.println(Arrays.toString(arr1));
	
	
	
	//2. 3���
	
	int[] arr2 = new int[300];
	//for �� ����ؼ� arr2 �迭�� �� �濡 3��� ���� �Է�
	for (int i = 0; i < arr2.length; i++) 	{
		arr2[i] = (i + 1)*3;
	}
	
	//for �� ����� ���
	for ( int i = 0; i < arr2.length ; i++) {
		System.out.print(arr2[i] +" ");
	}
	System.out.println();
	
	
	//���� for �� ����� ���
	for (int k : arr2) {
		System.out.print(k+" ");
	}
	System.out.println();
	
	
	//Arrays.toString() �� ����� ���
	System.out.println(Arrays.toString(arr2));
	
	
	
	//3. 3��� Ȧ�� �� (100~300)
	//for �� ����� ���
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
