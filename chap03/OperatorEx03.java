package chap03;

public class OperatorEx03 {

	public static void main(String[] args) {

		/*
		 * �� ������ (&&, ||, ^, !) : ��Ʈ ��Ŷ�� �߻��� 
		 * ��Ʈ ������ (&, |, ^)      : ��Ʈ ��Ŷ�� �߻����� ����
		 * .��Ʈ ��Ŷ : �պκ��� ���� ����� ������ �� ���� �� �޺κ��� ������ ����
		 */
		
		//1. �� ������ AND (&&)
		
		System.out.println(true && true); //true, ��Ʈ ��Ŷ�� �߻����� ����
		System.out.println(true && false); // false, ��Ʈ ��Ŷ�� �߻����� ����
		System.out.println(false && true); // false, ��Ʈ ��Ŷ �߻�..
		System.out.println(true && (5 < 3)); // false
		System.out.println((5 <= 5) && (7 > 2)); //true
		System.out.println((3 < 2) && (8 < 10)); //false, ��Ʈ ��Ŷ �߻�
		
		//2. �� ������ OR (||)
		System.out.println(true || true); // true, ��Ʈ ��Ŷ �߻� (�տ��� true �� �ڿ� ��� ����)
		System.out.println(false || (5<3));
		
		//3. �� ������ XOR (^) :  �� ���� ���ٸ� False, �� ���� �ٸ��ٸ� True
		System.out.println(true ^ true); // false
		System.out.println(false ^ false); // false
		System.out.println(true ^ false); 	// true
		System.out.println(false ^ true);  //true
		System.out.println((5<=5) ^ (7>2)); //false
		System.out.println("=========");
		
		//4. �� ������ NOT (!) : true �ӳ� false, false �̸� true
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5<3)); //true
		
		// �� ��Ŷ ��� ���� (�� �������� �� �߻�. ��Ʈ�������� ���� �߻����� ����)
		int value2 = 3;
		System.out.println(false && ++value2 > 6); // false, ��Ʈ��Ŷ �߻�
		System.out.println(value2); //3, ���� false���� ��Ʈ��Ŷ�� �߻��ؼ� �޺κ�(++value2 > 6)�� �������� �ʾ� 3�̵�
		
		int value34 = 3;
		System.out.println(true && ++value34 > 6); //false, ��Ʈ ��Ŷ�� �߻����� �ʾƼ� ++value34 �� ����Ǿ� 4�� ��
		System.out.println(value34);
		
		int value3 = 3;
		System.out.println(false & ++value3 > 6); //false, ��Ʈ�����ڴ� ��Ʈ ��Ŷ�� �߻����� �ʾƼ� ++value3 �� ����Ǿ� 4�� ��
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true || ++value4 > 6); //true, �տ��� true �� ��Ʈ ��Ŷ �߻�, ++value4�� �������� ����
		System.out.println(value4); // 3
		
		int value5 = 3;
		System.out.println(true | ++value5 > 6);  //true, ��Ʈ�����ڴ� ��Ʈ ��Ŷ�� �߻����� ����
		System.out.println(value5); // 4
		
		
		
		
		
		
		
	}

}
