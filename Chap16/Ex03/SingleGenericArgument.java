package Chap16.Ex03;

/*
 Object : ��� ��ü�� ������ �� ������,, �ٿ�ĳ���� �ʿ�, ĳ���ý� ���ܰ� �߻� �� �� ����(���� Ÿ�� üũ)
 Generic Ŭ���� : �ϳ��� Ŭ�������� �پ��� ������ Ÿ���� ó���� �� ����.

 ���ʸ� Ÿ�� ���� : T (Type), K (Key), V (Value), N(Number), E (Element)
				 A - Z ���� ���Ƿ� ���� �� ����
			wrapper Ŭ���� : �⺻ Ÿ���� ��üȭ ���ѳ��� Ŭ����
			�⺻Ÿ��	-> ��ü
			int -> Integer
			boolean -> Boolean
			Char -> Charter
			double -> Double
			float -> Float
 */
 
			


//���ʸ� Ŭ����
class MyClass<T>{
	private T t;
	public T get() {		//getter �ʵ��� ���� ��������
		return t;
	}
	public void set(T t) {		//setter �ʵ��� ���� �Ҵ�
		this.t = t;
		
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {

		//���ʸ� Ŭ���� ��ü ���� <String> �Է� 
		MyClass<String> mc1 = new MyClass<String>();	//wrapper �� �־�� ��.
		mc1.set("�ȳ�");
		System.out.println(mc1.get());
		
		//���׸� Ŭ���� ��ü ���� <Integer> �Է�
		MyClass<Integer> mc2 = new MyClass<Integer>();		
		mc2.set(123);
		System.out.println(mc2.get());
		
		//���׸� Ŭ���� ��ü ���� <Double> �Է�
		MyClass<Double> mc3 = new MyClass();	// �������� �ڷ����� ���� ������
		mc3.set(3.14);
		System.out.println(mc3.get());
		
		//���� Ÿ�� üũ (������ �ܰ迡�� ������ ���)
		MyClass<Boolean> mc4 = new MyClass<Boolean>();
		mc4.set(null);
//		mc4.set("�ȳ�");		//����ÿ� ������ ����������7	
		System.out.println(mc4.get());
		
		
		
	}

}
