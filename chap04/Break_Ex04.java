package chap04;

public class Break_Ex04 {

	public static void main(String[] args) {

		//1. ���� loop �� ����� ������ break Ż��
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break; 		//break�� ������, �ش� ������ ���� ����
			
		}
		
		//2. for ������ if ������ ����Ͽ� break ���
		
		for (int i = 0; i < 10 ; i++) {
			if (i == 5) {				//i�� 5�� �� for ���� ������ ��������
				break;
			}
			System.out.print(i +" ");
		}System.out.println("=========");
		
		//3. ���� loop �� �� break Ż��  ( �ϳ��� �ݺ����� ���� ���� )
		
		for (int i = 0; i<5; i++) {				//i�� 2�� �� break �� �ɸ��� ������, �� ��° for�� �������� ���� // i �� 2�� �ƴ� ��츸 ������
			for (int j = 0; j < 5; j++) {
				if (i==2) {
					break;
				}
				System.out.println(i +" , "+j);
			}
		}System.out.println("==========");
		
		//4. ���� loop ���� �Ѳ����� Ż��,  i) �� �̸��� ����Ͽ� Ż�� (break �� ,,, ��: ��ġ��)
		
POS1:		for (int i = 0; i < 5 ; i++) {
			for (int j = 0 ; j < 5 ; j++) {
				if (i == 2) {
					break POS1;
				}
				
				System.out.println(i +", " + j);
			}
		}System.out.println("========");
		
		//4. ���� loop ���� �Ѳ����� Ż��,  ii) ������ ������ false �� ���� Ż��  (���� ���� �κп��� / ù��° for ���� false �� �߻��ϰ� �ϴ� / ������ �Ҵ�) 
		
			for (int i = 0; i < 5 ; i++) {
				for (int j = 0 ; j < 5 ; j++) {
					if (i == 2) {
						i = 100;
						break;
					}
				System.out.println(i +", " + j);
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
