package chap04;

public class While_Ex04 {

	public static void main(String[] args) {

		//while �� �⺻ ����

		int a = 0;					//�ʱⰪ
		while ( a < 10) {			//����   // ���ǿ� �����ϸ� �Ʒ� ���� ����
			System.out.print(a+" ");
			a++;					//����
		}
			//0, 1, 2, 3, ~ 9 ���� 10�� ���
		System.out.println();
		
		//for �� ��ȯ
		for (int i = 0 ; i < 10 ; i++) 	{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int b = 10;
		while ( b > 0) {
			System.out.print(b +" ");
			b--;
		}
		
		System.out.println();
		//for �� ��ȯ
		for ( int i = 10; i > 0; i--) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		//while �� ���� ����
		/*
		while (true) {
			System.out.println("while �� ���� ����");
		}
		*/
		
		//while �� ���� ���� ����
		int c = 0;
		while (true) {
			if (c > 10) {		// c �� 10�� �Ǵ��� false �̱� ������ 10 ���� ��µ�
				break;
			}
			System.out.print(c +" ");
			c++;
		}
		System.out.println();
		System.out.println(c);
		
		
		
		
		
		
	}

}
