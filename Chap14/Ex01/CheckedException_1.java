package Chap14.Ex01;

import java.util.Scanner;

/*Error : ���α׷��Ӱ� ������ �� ���� �κ�
	- OS ���� �߻��ϴ� ����
	- �ϵ����(H/W)���� �߻��ϴ� ����
	
	Exception (����) : ���α׷��Ӱ� ������ �� �ִ� �κ�
	- ���ܰ� �߻��Ǹ� ���α׷��� �����
	--> ���ܰ� �߻��Ǵ��� ���α׷��� ������� �ʵ��� ó�� �ʿ�
	=> ����ó��
	
	ArithmeticException
	: � ���� 0���� ������ �߻��ϴ� ����
	- ��ǻ�ʹ� � ���� 0 ���� ���� ���, ��� �Ұ�

*/


public class CheckedException_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է��غ��ðԳ�");
		
		int a = sc.nextInt();
		int b = 10;
		
		try {
			// try ������� ����(Exception)�� �߻��� ���
		System.out.println(b / a);
		} catch(ArithmeticException e) {
			// catch ��� �� �۵���
			System.out.println("�����߻� 0���� ��� ������");
		} finally {
			
		}
		System.out.println("���α׷� ����");
	}
}