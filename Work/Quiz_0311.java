package Work;

import java.util.Scanner;

public class Quiz_0311 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int nu = 0;		// ��ĳ�ʷ� ��ȣ ��ǲ �޴� ����
		
		
		
		do {
			System.out.println("===================================================");
			System.out.println(" 1. 19�� ��� | 2. Ȧ���� ��� | 3. 3�� ����� ��� | 4. ����");
			System.out.println("===================================================");
			System.out.println("��ȣ�� �Է����ּ���.");
			nu = sc.nextInt();
			if(nu == 1) {
				for(int i = 1; i < 20; i++) {
					System.out.println(i+" ��");
					System.out.println();
					for(int j = 1; j < 20; j++) {
						System.out.println(i+" x "+j+" = "+i*j);
					}System.out.println();
				}
				
			} else if (nu == 2) {
				for(int i = 1; i < 20; i+=2) {
					System.out.println(i+" ��");
					System.out.println();
					for(int j = 1; j < 20; j++) {
						System.out.println(i+" x "+j+" = "+i*j);
					}System.out.println();
				}
				
			} else if (nu == 3) {
				for(int i = 3; i < 20; i+=3) {
					System.out.println(i+" ��");
					System.out.println();
					for(int j = 1; j < 20; j++) {
						System.out.println(i+" x "+j+" = "+i*j);
					}System.out.println();
				}
		
			} else if (nu == 4) {
				run = false;
			}
		}while(run);
		
		sc.close();
		System.out.println("���α׷� ����");
		
	}

}
