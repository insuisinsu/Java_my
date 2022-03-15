package chap02;

public class TypeCasting_2 {

	public static void main(String[] args) {
		/*
		 * Ÿ�� ĳ���� :	byte < short < char < int < long < float < double
		 * 		- �� ĳ���� : ���� �ڷ������� ū �ڷ������� ��ȯ�ϴ� ��
		 * 		- �ٿ� ĳ���� : ū �ڷ������� ���� �ڷ������� ��ȯ�ϴ� ��
		 * 		
		 * 	   �������� �⺻������ int �� ����
		 *     �Ǽ����� �⺻������ double �� ����
		 *     
		 */
		float value1 = 3;	//int -> float ������ Ÿ������ �ڵ����� ��ĳ����
		long value2 = 5;	//int -> long ������ Ÿ������ �ڵ����� ��ĳ����
		double value3 = 7;	//int -> double ��ĳ����
		byte value4 = 9;	//int -> byte ������ Ÿ������ �ٿ�ĳ����
		short value5 = 11;	//int -> short �ٿ�ĳ����
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println("=======");
		
		
		//�������� Ÿ�� ��ȯ
		byte value6 = (byte) 129;   // int -> byte Ÿ������ �������� Ÿ�� ��ȯ (�ٿ�)
		int value7 = (int) 3.5;		// double -> int Ÿ������ �������� Ÿ�� ��ȯ (�ٿ�)
		float value8 = (float) 7.5;	// double -> float Ÿ������ �������� Ÿ�� ��ȯ (�ٿ�)
		float value9 = 7.7F;	//F or f double -> float
				
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println("=======");
	}

}
