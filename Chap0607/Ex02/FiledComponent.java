package Chap0607.Ex02;

class Abc {
	int m = 3;						//�ʵ� (Heap �� ����), ��üȭ ������ �� ��밡��
	int n = 4;
	
	void work1() {					//�޼ҵ�
		int k = 5 ;					//�������� : (Stack ������ ����), �޼ҵ尡 ����� ��������.
		System.out.println(k);
		work2(3);					// �ٸ� �޼ҵ� ȣ��
	}
	
	void work2(int i) {
		int j = 4;					//���� ���� (Stack ������ ������ ���� ����)
		System.out.println(i + j);
		
		int l ;						//�������� , ���� �ʱ�ȭ ���� �ʴ´�.(Stack) --> �ʱⰪ�� ��������� ��
		l = 0;						//�������� �ʱⰪ �Ҵ�
		System.out.println(l);
	}
	
}

public class FiledComponent {

	public static void main(String[] args) {

		//Ŭ������ Ȱ���ؼ� ��ü(abc) ����
		Abc abc = new Abc();		// abc ��ü ����
		
		System.out.println(abc.m);
		System.out.println(abc.n);
		
		//�޼ҵ� ȣ��
		abc.work1();
		
	}

}
