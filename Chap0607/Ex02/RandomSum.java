package Chap0607.Ex02;

import java.util.Scanner;

public class RandomSum {

	static void math(String...values) {
		System.out.println(values.length);
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < values.length; i++) {
			// sum += values[i];
			// values [i] ��° ���� ���� String Ÿ���̹Ƿ� ����Ÿ������ ��ȯ �ʿ�
			sum += Integer.parseInt(values[i]);
			//Integer.parseInt(String) : ������ String Ÿ���� ������ ��ȯ
			avg = (double)sum/values.length;
			//sum �� double Ÿ������ ��������� ��
		}
		System.out.println("�Է��Ͻ� ������ ���� "+sum+" �̸� ����� "+avg+" �Դϴ�.");
	}
	
	
	
	
	public static void main(String[] args) {

		//��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ���
		//������ �������� �޾Ƽ� �迭 �����
		//�� �迭�� �հ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� ��ŭ ������ �Է��ϼ���.");
		
		//������ ���Ƿ� ��ü ���� ���� String���� �޾Ƽ�
		//split �� �����ڸ� �������� ���ڸ� �߶� �迭�� ����
		String num = sc.nextLine();
		String[] arr1 = num.split(" ");
		
		for(int i = 0; i < arr1.length ; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
			
		math(arr1); 	//���� ���� �޼ҵ� math �� ȣ���ϸ鼭 �Ű������� arr1�� �־���
						//arr1 �� String...values �� ��
		
	} 
	
}







//		int[] arr = new int[];
//		int size = arr.length;
//		
//		for(int i = 0; i < size.length ; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		
//				
//		
//	}
//
//	static void arr (int...values) {
//		int sum = 0;
//		int aver = 0;
//		
//		for(int i = 0; i < values.length ; i++) {
//			sum += values[i];
//			aver = sum/values.length;
//		}
//		
//		System.out.println(sum);
//		System.out.println(aver);
