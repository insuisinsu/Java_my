package chap03;

public class OperatorEx04 {

	public static void main(String[] args) {

		/*
		 * ���� ������ (=. +=. -=. *=, /=, >>=, <<=, >>>=) : ���Ŀ��� �켱������ ���� ����
		 * a = b;   <- b������ ���� a �� �Ҵ��϶�� �ǹ�  / .. '==' �� '����' ��
		 * a += b   <- a = a + b
		 * a -= b   <- a = a - b
		 * a *= b   <- a = a * b
		 * a /= b   <- a = a / b
		 * a &= b   <- a = a & b
		 * a |= b   <- a = a | b
		 * a <<= b  <- a = a << b
		 */
		
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		
		
		int value2;  		// �⺻�� �ڷ����� ��� ������ ���� ���� ���� ��� �⺻������ 0�� �Ҵ�.
		value2 = 5;			// ���� �ڷ����� ��� ������ ���� �Ҵ����� ���� ��� �⺻������ NULL
		//���ǥ��
		
		System.out.println(value2 += 2); // value2 = value2 + 2
		System.out.println(value2 -= 2);
		System.out.println(value2 /= 2);
		
		value2 = 5; System.out.println(value2 %= 2);
		value2 = 5; System.out.println(value2 | 3);  // 0101 | 0011 -> 0111 = 7
		value2 = 5; System.out.println(value2 & 2);  // 0101 & 0010 -> 0000 = 0
		value2 = 5; System.out.println(value2 & 3);  // 0101 & 0011 -> 0001 = 1
		
		value2 = 5; System.out.println(value2 <<= 2); // 0101 <<= 2 , 10100 = 20
		value2 = 5; System.out.println(value2 >>= 2); // 0101 >>= 2 , 0001 = 1

		//�� ����Ʈ
		value2 = 5; System.out.println(value2 >>>= 2); // 0101 >>>= 2 , 
		byte value3;
		value3 = -128; System.out.println(value3 >>>= 2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
