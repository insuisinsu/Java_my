package Chap0607.Ex04;


/*1. this �� Ű����� ���Ǵ� ���
 * : this.m -> �ʵ��� m / this.init() -> �ڱ� �ڽ� ��ü�� �޼ҵ�
 * 
 * 2. this �� �޼ҵ�� ���Ǵ� ���
 * : this(); -> ������ ������ �ٸ� �����ڸ� ȣ���� �� ���
 * 			 -> �ݵ�� ������ ������ ù �ٿ� �;���
 * 			 -> �޼ҵ� ���ο����� ����� �� ����. (������ ���ο����� ��밡��)
 */

class Abc{
	Abc(){				//�������� �Ű����� ���� ���� ������
		System.out.println("ù ��° �������Դϴ�.");
	}
	Abc(int a){
		this();			//�Ű������� ���� ������ ȣ��,, this(); �� '�������� ù����'�� �;���.
		System.out.println("�� ��° �������Դϴ�.");
	}

	Abc(int a, String b){
		this(30);
		System.out.println("�� ��° �������Դϴ�.");
	}
	
//	�����߻� - �޼ҵ� ���ο��� this(); �� ����ϴ� ���
	void abc () {
//		this();			//this(); �� �޼ҵ� �������� ����� �� ����
						//this(); �� �ٸ� �����ڸ� ȣ���� �� ���
	}
	
}

public class ThisMethod {

	public static void main(String[] args) {

		//1. ��ü ����
		Abc abc = new Abc();		//�Ű������� ���� ������ ȣ��
		System.out.println("=================");
		
		Abc abc1 = new Abc(1);		//�Ű������� ���� 1���� ������ ȣ��
		System.out.println("================");
		
		Abc abc2 = new Abc(1, "��");
		
		
		
		
		
	}

}
