package Hg;

import java.util.Scanner;

public class Exam05_2_06 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("======================");
			System.out.println("1.�л���  | 2.�����Է�  | 3.��������Ʈ  | 4.�м�  | 5.����");
			System.out.println("======================");
			System.out.print("����>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.println("�л���>>");
				studentNum = Integer.parseInt(sc.nextLine()); 
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for(int i = 0; i < studentNum; i++) {
					System.out.print((i+1)+" ��° �л� : ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if (selectNo == 3) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println((i+1)+" ��° �л��� ���� : "+scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i = 0; i < studentNum; i++) {
					sum += scores[i];
					if(max<scores[i]) {
						max = scores[i];
					}
				}
				avg = (double) sum / studentNum;
				System.out.println("�ְ����� : "+max);
				System.out.println("��ü��� : "+avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
		
		
		
	}

}
