package Chap0607.Ex05;

// ���� ������ (ĸ��ȭ: �����͸� �ܺη� ���� ��ȣ) : public, protected, default(����), private
	// Ŭ���� �̸�, �ʵ��, �޼ҵ��, �����ڸ�  �տ�  ���������ڰ� �ݵ�� �Ҵ�Ǿ� ����
	// Ŭ���� �̸� : Public, default


public class A {

	//�ʵ��� �⺻ ���� �����ڴ� default (����)
	//default �����ڴ� ���� ��Ű�� ���� �ִ� �ٸ� Ŭ���������� ���� ����
	//�ٸ� ��Ű���� Ŭ���������� ���� �Ұ�
	int m = 3;				
	
	//private : �ܺ� Ŭ�������� ���� �Ұ�
	private int n = 4;
	
	//public : �ٸ� ��Ű�������� ���� ����
	public int k = 30;
	
	
	void print() {			//���������� default ���� : ���� ��Ű�� ���� Ŭ���������� ��� ����
		System.out.println("import ����"+m);
	}
	
	public void print2() {
		System.out.println("�ܺ� ��Ű���� �ٸ� Ŭ�������� ���ٰ��� Public"+k);
	}

	public static void main(String[] args) {

		
	}

	}
