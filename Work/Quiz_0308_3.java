package Work;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_0308_3 {
	
	/*
	 Integer.parseInt : int ������ ��ȯ
	 */
	
	
	static void math(String...values){
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		for(int i = 0; i < values.length; i++) {
			if(i%2 != 0) {
				sum += Integer.parseInt(values[i]);
				count++;
			}
		}
		avg = (double) sum / count;
		System.out.println("��ü �������� �� "+sum+" �� �̸�, ��� "+avg+" �� �̴�.");
		
	}
	
	public static void main(String[] args) {

		/*
		String ���� �ʿ��� ������ �޴´�.  nextLine
		split , ������ ����ؼ� �� ���� ���� ���ο� �迭�� �����.
		�� ��ȣ�� Ȧ¦���� ������ ���� �� ���		
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("� ���� � ����");
		
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		
		if(str.equals("�׸�")) {
			System.out.println("���α׷� ����");
			return;
		}
		
		for(int i = 0; i < arr.length ; i++) {
			if(i%2 == 0) {
				System.out.print(arr[i]+"�� ");
			}else {
				System.out.print(arr[i]+" �� ");
			}
		}
		System.out.println("�Դϴ�.");
		sc.close();
		math(arr);
		
		
	}

}
