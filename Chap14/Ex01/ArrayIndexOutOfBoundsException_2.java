package Chap14.Ex01;

//Exception �� ������ �ֻ��� Ŭ���� ��
// ArrayIndexOutOfBoundsException �� Exception �� �����
public class ArrayIndexOutOfBoundsException_2 {

	public static void main(String[] args) {

		
		//arr �迭 �� �� ���� ����,, index : 0, 1, 2, 3, 4
		int[] arr = new int[5];
		
		try {
			
			for(int i = 0; i<=5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch (Exception e) {			//������ ��� ���ܸ� ó���� �� ����
//			e.printStackTrace();		// ���ܿ� ���� ������ ���
			System.out.println("�迭�� �ε��� ���ȣ�� �Ѱ���ϴ�.");
		}finally {
			System.out.println("���(finally)");
		}

		
		
		System.out.println("���α׷� ����");
		
		
	}

}
