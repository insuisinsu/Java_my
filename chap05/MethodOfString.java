package chap05;

public class MethodOfString {

	public static void main(String[] args) {

		//1. ���ڿ� ���� (length()) : int Ÿ������ ��ȯ
		String str1 = "Hello Java!";
		String str2 = "�ȳ��ϼ���! �ݰ����ϴ�.";
		
			//str1 : ��������, ��ü, �ν��Ͻ�
		
		System.out.println(str1.length()); // 11
		System.out.println(str2.length()); // 13
			// �ڹٿ��� length �� ���ڼ��� ����. (�ѱ۵� ��������)
		
		//2. ���ڿ� �˻� ( charAt(), indexOf(), lastIndexOf() )
		System.out.println(str1.charAt(1));		// 1�� ���� ���ڸ� ���
		System.out.println(str2.charAt(1));
		System.out.println();
		
		//indexOf() 0��° �濡�� ���� ������ �� ���� ������ ���ȣ(index)�� ���
		//lastIndexOf()	������ ����� 0��° ������ ������ �� ��ȣ ���
		
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('a'));
		
		
		
		
		
	}

}
