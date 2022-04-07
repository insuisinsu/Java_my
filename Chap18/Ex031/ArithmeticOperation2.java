package Chap18.Ex031;

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


public class ArithmeticOperation2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�Ǽ� �� �� �Է��ϼ���");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		//���1
		
		Arithmetic ar1 = (x, y) -> {				//��� �� a, b �� ��?
			System.out.println("���1. ���ٽ�");
			System.out.print(" + : "+(a+b)+" ");
			System.out.print(" - : "+(a-b)+" ");
			System.out.print(" * : "+(a*b)+" ");
			System.out.println(" / : "+(a/b)+" ");
		};
		ar1.arithmeticOpr(a, b);
		
		//���2
		Arithmetic a1 = new A();
		a1.arithmeticOpr(a, b);
		
		//���3
		Arithmetic ar2 = new Arithmetic() {
			
			@Override
			public void arithmeticOpr(double a, double b) {
				System.out.println("���3. �͸� �̳� Ŭ����");
				System.out.print(" + : "+(a+b)+" ");
				System.out.print(" - : "+(a-b)+" ");
				System.out.print(" * : "+(a*b)+" ");
				System.out.println(" / : "+(a/b)+" ");
			}
		};
		ar2.arithmeticOpr(a, b);
		
		
		sc.close();
		System.out.println();
		System.out.println("�ý��� ����");
	}

}
