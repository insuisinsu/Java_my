package Chap0607.Ex02;

public class EffectOfPrimariDataArgument {

	int abc ;					//�ʵ� : (Heap������ ����) ��üȭ ���Ѿ� ����� �� ����
	
	
	static int twice (int a) {					// �Ű������� ������ �޾Ƽ� *2 �� ���� return
		a = a * 2;
		return a;
	}
	
	
	public static void main(String[] args) {

		int a = 3;								//�������� (stack ������ ������� ���� ����
		int result1 = twice(4);
		System.out.println(result1);
		System.out.println(a);
		System.out.println(twice(a));
		System.out.println();
		
		
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);
		
		
	}

}
