package chap04;

public class If_Ex01 {

	public static void main(String[] args) {

		/*
		 * if �� (����) {
		 * 		������ ���� �� ����� �ڵ�;
		 * }
		 */
		
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("����1 : ������ ���� �� ����");
		}
		
		/*
		 * if (����) {
		 * 		������ ���� �� ����� �ڵ�;
		 * } else {
		 * 		������ ������ �� ������ ����;
		 * }
		 */
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool2) {
			System.out.println("����3");
		} else {
			System.out.println("����4");
		}
		
		//if ~ else  �� ���� �����ڷ� ��ȯ ����
		System.out.println((bool1) ? "����3" : "����4");
		
		/*
		 * if�� ������ ���� �� �϶�
		 * 
		 * if (����1) {
		 * 		����1�� ���� �� ����
		 * } else if (����2) {
		 * 		����2�� ���� �� ����
		 * } else if (����3) {
		 * 		����3�� ���� �� ����
		 * } else {
		 * 		���� ������ ��� �������� ���� �� ����
		 * }
		 */
		
		int value3 = 85;
		
		if (value3 >= 90) {
			System.out.println("A, ���� : " + value3);
		}else if (value3 >= 80) {
			System.out.println("B, ���� : " + value3); // ���� �Ŀ� if���� ��������
		}else if (value3 >= 70) {
			System.out.println("C, ���� : " + value3);
		}else {
			System.out.println("F, ���� : " + value3);
		}
		
		/*
		 * if ������ ������ ������ �ٲ�� ���� ���
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
