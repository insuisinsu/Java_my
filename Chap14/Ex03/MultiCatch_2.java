package Chap14.Ex03;

public class MultiCatch_2 {

	public static void main(String[] args) {

		
		//1. Exception ���� ��� ���ܸ� ó���� �� ����
		
		try {
			System.out.println(10/0);
			int num1 = Integer.parseInt("10A");
		}catch(Exception e) {
			//try {} ���� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó��
			System.out.println("���� ó��(Excpetion)");
		}
		
		//2. catch  ����� ������ �߸��� ���
		// ���� ���� -> ū ������ ���ߵ�
		// �Ʒ��� ��� : ������ ū Exception �� ���� �Ա� ������ ���� �߻�
		/*
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch(Exception e) {
			System.out.println("���� ó��(Excpetion)");
		}catch(ArithmeticException e) {
			
		}catch(NumberFormatException) {
			
		}
		*/
		
		//3. catch ����� �ǹٸ� ����
		// : �ֻ����� �ִ� Exception Ŭ������ �������� �;� ��
		try {
			System.out.println(10/0);
			int num2 = Integer.parseInt("1!");
		}catch(ArithmeticException e){
			System.out.println("Exception �� ���� Ŭ����1");
		}catch(NumberFormatException e) {
			System.out.println("Exception �� ���� Ŭ����2");
		}catch(Exception e) {
			System.out.println("���� ó��(Excpetion)");
		}
		
		//4. �������� Exception �� �����ؼ� ����
		// | �Ǵ� ����ϸ� ��
		try {
			System.out.println(10/0);
			int num3 = Integer.parseInt("10A");
		}catch(ArithmeticException | NumberFormatException e) {
			
		}catch(Exception e) {
			//try {} ���� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ��� ó��
			System.out.println("���� ó��(Excpetion)");
		}
		
		
		
		
		
		
	}

}
