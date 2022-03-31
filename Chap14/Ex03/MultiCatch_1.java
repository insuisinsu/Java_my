package Chap14.Ex03;


// ���� ���� Exception �� ���ÿ� �߻��� ��� ó��
public class MultiCatch_1 {

	public static void main(String[] args) {

		//1. ���� Exception ó��
		// try catch

		//ArithmeticException
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			//catch ������ �ƹ� ������ ��� ����ó�� ��
			System.out.println("���� ��� ArithmeticException");
		} // finally �� �־, ��� ��� ����
		
		//NumberFormatException
		try {
			int num = Integer.parseInt("10A");
		}catch(NumberFormatException e) {
			System.out.println("���� ��� NumberFormatException");
		}
		System.out.println("=======================");
		//2. ���� Exception ó��
		
		//try �������� ���� ���ܰ� �߻��� ���
		try {
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		}catch(ArithmeticException | NumberFormatException e){
			System.out.println("���� ���� ó��");
		}
		
		System.out.println("���α׷� ����");
		
		
		
		
		
	}

}