package chap02;

public class PrimaryDataType_1 {

	public static void main(String[] args) {
		
		//boolean : true / false ���� �Ҵ� ����
		boolean bool1 = true;
		boolean bool2 = false;
		//boolean bool3 = 10;
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println("======���� : ���� ��,  ���=====");
		byte value1 = -128;    // byte : 1byte (-128 ~ 127)
				// byte value11 = -129;   // ���� �߻�
		byte value111 = (byte) -129;	// -129�� byte Ÿ������ ��ȯ�ؼ� ����
		byte value1111 = (byte) 129;
		byte value11111 = (byte) 127;
		
		System.out.println(value1);
		System.out.println(value111);
		System.out.println(value1111);
		System.out.println(value11111);
		
		
		short value2 = -10 ; // short : 2byte (-32768 ~ 32767)
		//value = -32769;  // ���� �߻�
		value2 = (short) -32769;
		System.out.println(value2);
		
		int value3 = 100;
		long value4 = 200L;
		
		//�Ǽ� : float, double
		//float
		//double
		
	}

}
