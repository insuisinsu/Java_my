package chap04;

public class For_Ex03 {

	public static void main(String[] args) {

		
		//For �⺻ �۵�
		
		int a;		//�������� // ��� �ۿ��� ����� ����, ������ �޸𸮸� ���� �Ǿ���, �ʱⰪ (x)
		
		for (a = 0 ; a < 3 ; a++) {
			System.out.print(a + " ");
		}
		System.out.println(a);
		
		System.out.println("============");
		
		for (int b = 0 ; b < 10 ; b++) {
			System.out.println(b);
		}
		// System.out.println(b); 	// ���� b �� for ���� {} �ȿ��� ����Ǿ��� ������ for �� {} �ȿ����� ��� ����
		System.out.println("============");
		
		int c;
		for ( c = 5 ; c > -2 ; c-- ) {
			System.out.println(c);
		}
		System.out.println("============");
		
		//2�� ��� ���
		for (int i = 0 ; i < 100 ; i += 2) {
			System.out.print(i+" ");
		}
		System.out.println("============");
		// for ������ �ʱⰪ�� �������� ���� ������ �Ҵ��� �� �ִ�.
		for (int i=0, j=0 ; i < 10 ; i++, j++) {
			System.out.println(i + " * " + j + " : " + (i * j));
		}
		
		// for �� ����ؼ� 1~10�� ���
		int s = 1 ;
		for (int i = 1 ; i <= 10 ; i++) {
			s *= i ; //s = s * 1
		}
		
		System.out.println(s);
		
		int x = 0;
		for (int y = 1 ; y <= 100 ; y++) {
			x += y;
		}
		System.out.println(x);
		System.out.println("������ ���");
		
		// ���� for �� Ȱ���Ͽ� ������ 1 �� ~ 9 �� ���
		for ( int i = 1; i <= 9 ; i++) {
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println("===========");
		}
		
		/* for ���� ���� ���� �߻�
		 * 
		 * 	1. ������ ���� ���
		
		for (int i = 0;; i++) {
			System.out.print(i+" ");
		}
		
			2. �ʱⰪ, ���ǰ�, �������� ���� ���
		for (;;) {
			System.out.println("���� ����")
		}
		
		*/
		
		System.out.println("=============");
		
		// for ���� if, break �� ����Ͽ� ���� ���� Ż��
		for ( int i = 0 ; ; i++) {
			
			if ( i > 100) {
				break;					// ���� ���� ����
			}
 			System.out.println(i);
		}
		
		// for �� ����ؼ� 1 ~ 1000 �������� 4�� ����� ���� ���� ���(double) ��
		
		double sum = 0 ;
		int p = -1;
		for (int i = 0 ; i <= 1000 ; i+=4) {
			sum += i;
			p++;
		}
		System.out.println("1000 ������ 4�� ����� ��� ���� �� : " + sum);
		System.out.println("1000 ������ 4�� ����� ��� ���� ���� ���: " + sum/p);
		
		double sum1 = 0;  // 4�� ����� ���� ��
		double j = 1;		// 4�� ����� ī��Ʈ �ϴ� ��
		for (int i = 0; i <= 1000 ; i++) {
			if (i % 4 == 0) {
				sum1 += i ;
				j++ ; // ������ 1000 ������ 4�� ��� ��ŭ ������
			}
		}
		System.out.println(sum1);
		System.out.println(sum1/j);
		
		
		
		
		
		
		
		
	}

}
