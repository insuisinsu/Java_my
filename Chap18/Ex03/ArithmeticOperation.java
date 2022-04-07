package Chap18.Ex03;

import java.util.Scanner;

//1. ��ĳ�ʸ� ����ؿ�  double �� ���� ��ǲ ����
//2. ���1. ���ٽ� ���, ��ǲ ���� �� ���� ��Ģ����
//3. ���2. �������̽��� ������ �ڽ� ��ü�� ����ؼ� ��ǲ���� �� ���� ��Ģ����
//4. ���3. �͸� �̳� Ŭ������ ����ؼ� ��Ģ����
//5. int �� ��쿡�� ArithmeticException ó�� �ʿ� : 0 ���� ������ �߻���
	// double �� ����ó���� �Ǿ�����

@FunctionalInterface
interface Arithmetic {
	
		void arithmeticOpr(double a, double b);
	
}

class A implements Arithmetic{
	@Override
	public void arithmeticOpr(double a, double b) {
		System.out.println("���2. �������̽� ����");
		System.out.print(" + : "+(a+b)+" ");
		System.out.print(" - : "+(a-b)+" ");
		System.out.print(" * : "+(a*b)+" ");
		System.out.println(" / : "+(a/b)+" ");
	}
}


public class ArithmeticOperation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//���1
		System.out.println("���1. ���� �� �� �Է��ϼ���");
		
		Arithmetic ar1 = (a, b) -> {
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println("���1. ���ٽ�");
			System.out.print(" + : "+(a+b)+" ");
			System.out.print(" - : "+(a-b)+" ");
			System.out.print(" * : "+(a*b)+" ");
			System.out.println(" / : "+(a/b)+" ");
		};
		ar1.arithmeticOpr(0, 0);
		
		//���2
		Arithmetic a1 = new A();
		System.out.println("���2. ���� �� �� �Է��ϼ���");
		a1.arithmeticOpr(sc.nextDouble(), sc.nextDouble());
		
		//���3
		Arithmetic ar2 = new Arithmetic() {
			
			@Override
			public void arithmeticOpr(double a, double b) {
				a = sc.nextDouble();
				b = sc.nextDouble();
				System.out.println("���3. �͸� �̳� Ŭ����");
				System.out.print(" + : "+(a+b)+" ");
				System.out.print(" - : "+(a-b)+" ");
				System.out.print(" * : "+(a*b)+" ");
				System.out.println(" / : "+(a/b)+" ");
			}
		};
		System.out.println("���3. ���� �� �� �Է��ϼ���");
		ar2.arithmeticOpr(0, 0);
		
		
		sc.close();
		System.out.println();
		System.out.println("�ý��� ����");
	}

}
