package Chap0607.Ex05;

class B{		// �ܺ� Ŭ���� : public�� �� �� ����,, default�� �����Ǿ� ����
				// �ٸ� ��Ű���� Ŭ���������� ������ �Ұ���,, ���� ��Ű�� �������� ���� ����
	
	private int a = 1;			//private   : ���� Ŭ���� �������� ��� ����
	int b = 2;					//default   : ���� ��Ű�� ���� �ٸ� Ŭ�������� ���� ����
	protected int c = 3 ;		//protected : default + �ٸ� ��Ű�������� ���� ����(��, ��ӵ� ��츸)
	public int d = 4 ;			//public    : �ٸ� ��Ű�������� ���� ����
				
				//private < default < protected < public
	
	private void print1() {		// ���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() {				// ���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void print3() {	// ���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void print4() {		// ���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
}
	
	
	
	
	
	

public class ExternalClass_01 {

	public static void main(String[] args) {

		B b = new B();			//default ���� �����ڰ� class �̸��� �Ҵ� // ���� ��Ű���� �����ϹǷ� �ٷ� ��� ����
		
		//���� ��Ű���� �ٸ� Ŭ����
		Bb bb = new Bb();		//public ���� ������
		
		//�ʵ� ����
//		bb.a=10;				//private : �ٸ� Ŭ�������� ��� �Ұ�,, Bb Ŭ���� ���ο����� ��� ���� 
		bb.b=20;				//default : ���� ��Ű���� Ŭ���������� ���� ���
		bb.c=30;				//protected : ���� ��Ű�� �Ӹ� �ƴ϶� (��Ӱ��� �� ����)�ٸ� ��Ű�������� ���� ����
		bb.d=40;				//public : �ٸ� ��Ű�������� ���� ����
		
		//�޼ҵ� ����
//		bb.print1();			//private
		bb.print2();			//default
		bb.print3();			//protected
		bb.print4();			//public
		
		
		
		
	}

}
