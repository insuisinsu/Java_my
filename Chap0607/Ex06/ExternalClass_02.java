package Chap0607.Ex06;


//import Chap0607.Ex05.B;	// B class �� public�� ���� ������ �ٸ� ��Ű���� Ŭ�������� �ҷ��� �� ����
import Chap0607.Ex05.Bb;  // �ٸ� ��Ű���� Ŭ�������� Ŭ������ ȣ�� �� ���� public ���������ڰ� �־�� ��

public class ExternalClass_02 {

	public static void main(String[] args) {

//		B b = new B();			// default ���������� ������ �ٸ� ��Ű������ ���� �Ұ���
		
		
		// �ٸ� ��Ű���� Ŭ������ ���� ����
		// 1. import
		// 2. �ش� Ŭ���� �����ڰ� public �� ��
		// 3. �ʵ�, �޼ҵ��� ���������ڿ� ���� ���� ����(protected(��Ӱ���), public)
									//or �Ұ���(private, default)
		Bb bb = new Bb();		

		//�ʵ� ����
//		bb.a = 10;			//private	: ���� Ŭ���� �������� ���� ����
//		bb.b = 20;			//default	: ���� ��Ű�� �������� ���� ����
//		bb.c = 30;			//protected	: (��Ӱ�����)�ٸ� ��Ű���� Ŭ���������� ���� ����
		bb.d = 40;			//public	: �ٸ� ��Ű���� Ŭ���������� ���� ����
		
		//�޼ҵ� ����
//		bb.print1();			//private	: ���� Ŭ���� �������� ���� ����
//		bb.print2();			//default	: ���� ��Ű�� �������� ���� ����
//		bb.print3();			//protected	: (��Ӱ�����)�ٸ� ��Ű���� Ŭ���������� ���� ����
		bb.print4();			//public	: �ٸ� ��Ű���� Ŭ���������� ���� ����
		
	}

}
