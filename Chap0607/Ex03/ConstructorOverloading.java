package Chap0607.Ex03;



//������ �����ε�
class Abc{
	int a, b, c;
	String d;
	
	Abc () {System.out.println(a + ", " + b + ", "+ c);}					// �⺻ ������
	
	Abc(int a) {				// �Ű������� 1���� ������
		this.a = a;
		System.out.println(a);
	}				
	
	Abc (String d){
		this.d = d;
		System.out.println(d);
	}
	Abc (int a, int b){			// �Ű������� 2���� ������
		this.a = a;
		this.b = b;
		System.out.println(a+ " " + b);
	}
	
	Abc (int a, int b, int c){	// �Ű������� 3���� ������
		this.a = a; this.b = b; this.c = c;
		System.out.println(a +" " + b +" " + c);
	}
	
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Abc abc = new Abc () ;		// �⺻ ������ ȣ��
		Abc abc1 = new Abc (1);		// �Ű������� 1���� ������ ȣ��
		Abc abc2 = new Abc ("ȣ����");
		Abc abc3 = new Abc (11, 22);
		Abc abc4 = new Abc (111, 222, 333);
		
	}

}
