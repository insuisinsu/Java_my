package chap05;

public class ArgumentOfMainMethod {
	public static void main(String[] ar) {		// ���� �޼ҵ�[�Լ�,
		//�޼ҵ��� �⺻ ����
		/*
		 * 
		 * void main(String[] args) {       		//void : ���� ���� ���� ��
		 * 		�޼ҵ� ȣ��� ������ �ڵ�;				//main : �޼ҵ��
		 * }										// (��ǲ �Ű�����)
		 */
		
		
		String a = ar[0];	// "�ȳ��ϼ���" 	: ���ڿ� ����
		String b = ar[1];	// 3			: ����
		String c = ar[2];	// 3.8			: �Ǽ�
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// main �޼ҵ忡 ���ڰ����� ������ �Ǽ��� �Ѱ��� �� String Ÿ������ ��ȯ�ȴ�.
		System.out.println(b + 1);	// 3 �� 1 --> 31			
		System.out.println(c + 1);	// 3.8 �� 1 -- 3.81
		
		//String �� ������ ���� ������ ��ȯ�ؼ� ����
		int d = Integer.parseInt(b);
		double e = Double.parseDouble(c);
		
		System.out.println(d + 1);
		System.out.println(e + 1);
		
		
		
		
	}
}
