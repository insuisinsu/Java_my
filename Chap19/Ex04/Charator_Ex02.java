package Chap19.Ex04;

public class Charator_Ex02 {

	public static void main(String[] args) {

	/*
	 for ������
	 A ~ Z ������ �ƽ�Ű �ڵ尪 ���
	 
	 ��°��
	 A, 65
	 B, 66
	 ...
	 Z,90
	 
	 a ~ z ������ �ƽ�Ű �ڵ尪 ���
	 
	 a, 97
	 b, 98
	 ...
	 z, 122
	 
	 */
		System.out.println("A ~ Z ������ �ƽ�Ű �ڵ尪 ���");
		System.out.println("==============================");
		int[] arr1 = new int[26];
		for(int i = 0; i<arr1.length; i++) {
			char ch = 'A';
			arr1[i] = ch+i;
			System.out.println((char)arr1[i]+" , "+(int)arr1[i]);
		}
		
		
		System.out.println();
		System.out.println("a ~ z ������ �ƽ�Ű �ڵ尪 ���");
		System.out.println("==============================");
		for(int i = 0; i<arr1.length; i++) {
			char ch = 'a';
			arr1[i] = ch+i;
			System.out.println((char)arr1[i]+" , "+(int)arr1[i]);
		}
		
		
		
		
	}

}
