package Chap14.Ex01;

public class ArrayIndexOutOfBoundsException_1 {

	public static void main(String[] args) {

		//arr �迭 �� �� ���� ����,, index : 0, 1, 2, 3, 4
		int[] arr = new int[5];
		
		try {
			
			for(int i = 0; i<=5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();		// ���ܿ� ���� ������ ���
			System.out.println("�迭�� �ε��� ���ȣ�� �Ѱ���ϴ�.");
		}finally {
			System.out.println("���(finally)");
		}

		
		
		System.out.println("���α׷� ����");
	}

}
