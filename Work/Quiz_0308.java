package Work;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_0308 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("��̸��� ������ ���� ������ �̿��ؼ� �Է��ϼ���");
		System.out.println("��) Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2");
		
		String str ;		//��ü String ���� ��ǲ�޴� ����
		String[] arr ;		//������ �������� �߶� �����ϴ� �迭�� ����
		int sum = 0;		//������ ���� ��
		int memberCount = 0;
		double avg = 0;		//�������� ��� : sum / ������ ��
		int b = 0;			//�� ������ �������� ��� ����
		
		
		do {
			str = sc.nextLine();		//sc.next() ��������� String
										//sc.nextLine() ���ͱ��� ��ü�� String
			if(str.equals("�׸�")) {break;}	// str�� �����ڷ����̹Ƿ� == �� �ƴ� str.equals() ���
			
			arr = str.split(" ");		//str�� ������ �������� �߶� arr �迭�� ���� 
			
			for (int i = 0; i < arr.length ; i++) {		//arr.length : �迭�� index 0 ~ ������ �� ����
				if (i%2 != 0) {			// i : ���� ��ȣ,, ���ڸ� ������ �´�.
					b = Integer.parseInt(arr[i]);		// �� ���� String Ÿ���� ������ ��ȯ
					sum += b;			// sum = sum + b // sum : ��ü �������� ��
					memberCount++;		// if ������ �����Ѵ� = �� ������ �������� ī��Ʈ �ߴ� = ������ ī��Ʈ �ߴ�
				}
			}
			avg = (double) sum / memberCount;	//���
			
			System.out.println(str);
			System.out.println("�������� ���� : "+sum);
			System.out.println("�������� ��� : "+avg);
			
			
		} while(true);
		
		
		
	}

}









