package chap03;

import java.util.Scanner;

public class h3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		int a = scan.nextInt();
			
		if(a % 6 == 0) {
			System.out.println("3�� ����̸鼭 6�� ��� �Դϴ�.");
		}
		else if (a % 3 == 0){
			System.out.println("3�� ��������� 6�� ����� �ƴմϴ�.");
		}
		else {
			System.out.println("3�� ����� 6�� ����� �ƴմϴ�.");
		}
		
	}
		

}
