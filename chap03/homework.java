package chap03;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		int a = sc.nextInt();
		if (a % 3 == 0) {
			System.out.println("3�� ��� �Դϴ�.");		
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");		
		}
		sc.close();
	}

}
