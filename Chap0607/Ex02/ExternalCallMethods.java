package Chap0607.Ex02;


//�پ��� Ÿ���� �޼ҵ� ���� (return Ÿ���� �ִ� ���(int, double, Stirng ��)
//					  (return Ÿ���� ���� ��� void Ű�� ���)
public class ExternalCallMethods {

	public static void main(String[] args) {

		//��ü����
		A a = new A();						// ���� ��Ű�� ���� Ŭ������ import ���� ȣ���ؼ� ��� ����
		
		//�޼ҵ� ȣ��
		a.print();
		int k = a.data();
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result);
		
		a.printMethode(0);
		a.printMethode(4);
		
		//����
		System.out.println(a.data()); 		//��±����� ȣ�� ������ �޼ҵ� (������ �ִ� �޼ҵ�)
//		System.out.println(a.print());		//�����߻� //return�� ���� �޼ҵ�// ����ε� �� ����ؼ�..?
		a.print();
		System.out.println(a.sum(4, 10.5));	
//		System.out.println(a.printMethode(33));
		
		
		
	}

}
