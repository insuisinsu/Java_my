package Chap0607.Ex04;

//����� this Ű���� �߰�  - �ݵ�� this �� �߰��ؾ� �ϴ� ���


//this key�� ������� �ʴ� ���
//this Ű�� ������� �ʾ� '�ʵ��� m' �� �ƴ� '�������� m'�� �ǹ�
class Aa {						
	int m;						//-> ���������� �ν�
	int n;
	void init (int m, int n) {
		m = m ;					
		n = n ;
	}
}

// this �� ����ϴ� ���
// this Ű�� ����Ͽ� '�ʵ��� m' �̶�� ���� �˷������
class Bb {			
	int m;
	int n;
	void init (int m, int n) {
		this.m = m;				
		this.n = n;
	}
}

public class ThisKeyword_02 {

	public static void main(String[] args) {

		//1. �ʵ��� ��� ���������� ���� ���� ��쿡
		//this Ű���带 ������� �ʴ� ���
		//���������� ����
		
		Aa aa = new Aa();
		aa.init(2, 3);
		System.out.println(aa.m);		//0
		System.out.println(aa.n);		//0
				
		
		//2. �ʵ��� ��� ���������� ���� ���� ���
		//this Ű���帣 ����ϴ� ���
		//�ʵ� ������ ����
		
		Bb bb = new Bb();
		bb.init(2, 3);
		System.out.println(bb.m);		//2
		System.out.println(bb.n);		//3
		
	}

}
