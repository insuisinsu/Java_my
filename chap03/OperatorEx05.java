package chap03;

public class OperatorEx05 {

	public static void main(String[] args) {

		//���� ������ :  (����) ? �� : ����
		int value1 = (3>5) ? 6 : 9;		// ������ false -> value1 �� 9 
		System.out.println(value1);
		
		int value2 = (5>3) ? 10 : 20; // ������ true -> value2 �� 10
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println((value3 % 2 == 0) ? "¦��" : "Ȧ��");
		
		//if ������ ó��
		if (value3 % 2 == 0) {
			System.out.println("¦��");		//������ ���� �� ����Ǵ� ����
		}else {
			System.out.println("Ȧ��");		//������ ������ �� ����Ǵ� ����
		}
		
	}

}
