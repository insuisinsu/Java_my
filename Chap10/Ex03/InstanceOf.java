package Chap10.Ex03;

//instanceof : ��ü ������ ĳ���� ���ɿ��θ� �� �� �ֵ��� �ϴ� Ű����
//��ĳ������ ��ü ���ο� � Ÿ���� �����ϴ��� True or False 
//�ٿ� ĳ���ý� ��Ÿ�� ������ �߻��� �� �ִ�.
//�ٿ� ĳ���ý� �ش� Ÿ���� ��ü�� ������ �� �ٿ� ĳ���� �ϵ��� ����

class A {
	int m;
	void a() {
		System.out.println("m : "+m);
	}
}

class B extends A{
	int n;
	void b() {
		System.out.println("n : "+n);
	}
}

public class InstanceOf {

	public static void main(String[] args) {

		//1. intstanceof
		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof A);
		System.out.println(ab instanceof B);
		
		//aa ��ü�� B Ÿ���� ���ԵǾ� ���� ��쿡�� ĳ���� �Ѵ�.
		//-> ��Ÿ�� �� ���� ���� ����
		
		if ( aa instanceof B) {
			B b = (B)aa;
			System.out.println("aa�� B �� ĳ���� �߽��ϴ�.");
		}else {
			System.out.println("aa�� B Ÿ������ ĳ���� �Ұ��մϴ�.");
		}
		
		if ( ab instanceof B) {
			B b = (B)ab;
			System.out.println("ab�� B �� ĳ���� �߽��ϴ�.");
		}else {
			System.out.println("ab�� B Ÿ������ ĳ���� �Ұ��մϴ�.");
		}
		
		if("�ȳ�" instanceof String) {
			System.out.println("\"�ȳ�\"�� String Ŭ�����Դϴ�.");
		}
		
	}

}






