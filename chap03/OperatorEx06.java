package chap03;

public class OperatorEx06 {

	public static void main(String[] args) {
		
		/*
		 * �� ����Ʈ�� �̿��ؼ� �� ��Ʈ�� ��ġ ���� �˾Ƴ���
		 */
		
		int flags = 0b10110110;
		System.out.println(flags >>> 0 & 1);	// 0��° �ڸ��� ��Ʈ��
		System.out.println(flags >>> 1 & 1);	// 1��° �ڸ��� ��Ʈ��
		System.out.println(flags >>> 2 & 1);	// 2��° �ڸ��� ��Ʈ��
		System.out.println(flags >>> 3 & 1);	// 3��° �ڸ��� ��Ʈ��
		System.out.println(flags >>> 4 & 1);	// 4��° �ڸ��� ��Ʈ��
		System.out.println(flags >>> 5 & 1);	// 5��° �ڸ��� ��Ʈ��
		System.out.println(flags >>> 6 & 1);	// 6��° �ڸ��� ��Ʈ��
		System.out.println(flags >>> 7 & 1);	// 7��° �ڸ��� ��Ʈ��
		
		
	}

}
