package chap04;

public class DoWhile_Ex05 {

	public static void main(String[] args) {
		
		
		// while �� do while ��
		// 1. ù ������ false �� ���
		
		int a = 0 ;						//ù ȸ���� ������ false �̱� ������ ���� �Ұ�
		while (a < 0) {
			System.out.print(a +" ");
			a++;
		}
		System.out.println();
		System.out.println("===============");
		
		a = 0;
		do {
			System.out.print(a + " ");		//do while ������ ������ 1���� �����
			a++;
		} while ( a < 0 );		// false
		System.out.println();
		
		System.out.println("�ݺ� Ƚ���� 1�� ��� ====");
		
		// 2. �ݺ� Ƚ���� 1�� ���
		a = 0;
		while (a < 1) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println();
		
		a = 0;
		do {
			System.out.println(a +" ");
			a++;
		} while (a < 1);
		
		System.out.println();
		
		//�ݺ� Ƚ���� 10���� ���
		a = 0;
		while ( a < 10) {
			System.out.print(a +" ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a +" ");
			a++;
		} while ( a < 10) ;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
