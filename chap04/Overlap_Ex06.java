package chap04;

public class Overlap_Ex06 {

	public static void main(String[] args) {

		//1. if �ȿ� if �ߺ�
		
		int value1 = 5;
		int value2 = 3;
		
		if (value1 > 5) {
			if (value2 < 4) {					// ù ��° if �� false �̸�,
				System.out.println("���� 1");	// �� ��° if �� true ���� �������� ����
			}else {
				System.out.println(	"���� 2");
			}
		}else {
			System.out.println("���� 3");
		}
		
		System.out.println("==============");
		
		
		//2. switch �ȿ� for
		
		int value3 = 1;
		switch (value3) {
		
		case 1:
			for (int k = 10; k > 0 ; k--) {
				System.out.print(k +" ");
			}
			System.out.println();
			break;
		case 2:
			for (int k = 0 ; k < 10; k++) {
				System.out.print(k+" ");
			}
			break;							//������ ���� break �ʿ���� �ʳ�?
			
		}
		
		// 3. for �ȿ� for
		
		for (int i = 0; i < 3 ; i++) { // 0 ���� 2 ���� 3 �� �����
			for (int j = 0; j < 5; j++) { // 0 ���� 4 ���� 5�� �����
				if (i == j) {
					System.out.println(i + " = " + j);
				}else{
					System.out.println(i + ", " + j);					
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
