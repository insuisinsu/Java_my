package Chap01;

public class Hello02 {
	//�޼ҵ� ���� (�޼ҵ� : ��ü���� ���� �Լ��� �޼ҵ��� ȣĪ�Ѵ�.)
			   // �Լ� : ��ǲ���� �־ �׷α׷��� ���� ����� ���
	
	public static int sum (int n, int m) {
		return n+m;
	}
	
	public static void main(String[] args) {

		// ���� ����
		int i = 20; // i ������ ������(int) ���� �� �ְ�, �ʱⰪ���� 20�� �Ҵ�����
		int s ;     // s ������ ��������(int) ���� �� �ְ�, �ʱⰪ�� �����
		char a ;    // a ������ �� ����(char)�� ���� �� ����. (char �� �ƽ�Ű��), char ������ ""�� �ƴ� ''�� ����Ͽ� ���� �Ҵ�
		String b ;  // 
		
		b = "������ ������ ����ϴ�";
		
		s = sum (i,10); // sum �޼ҵ� ȣ��
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		
		System.out.println(b);
	}

}
