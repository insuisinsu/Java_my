package Chap0607.Ex04;


/*  < ������ this Ű���� �ڵ� �߰� >
 * 1. Ŭ���� ���ο��� �ʵ� or �޼ҵ� �̸� �տ� �ڵ����� this Ű���尡 ����.
 * 		this Ű�� �ڱ� �ڽ��� ��ü�� �ʵ�� �޼ҵ带 ��Ī
 */



class A{
	int m;
	int n;
	
	// A () {} 			// �⺻ ������ ����
	
	void init (int a, int b) {			// ���� a, b c �� �޼ҵ� �ȿ� �ִ� '��������'
		int c; 							// Stack ������ ������� ���� ����
		c = 3;							// �޼ҵ� inti() ���� �ÿ� stack ������ �����ǰ� �޼ҵ尡 ������ �Ҹ��
		this.m = a;			//this Ű ������, �����Ϸ��� �ڵ����� �߰� 
		this.n = b;			//this Ű ������, �����Ϸ��� �ڵ����� �߰�
	}
	
	void work() {
		this.init(2, 3);	//this Ű ������, �����Ϸ��� �ڵ����� �߰�
		System.out.println(this.m + ", "+this.n); // this �� ���� ����, �����Ϸ��� �ڵ����� �߰�
	}
}

public class ThisKeyword_01 {

	public static void main(String[] args) {
	//2. ��ü ����
		A a = new A();
		
	//3. �޼ҵ� ȣ��
		a.work();
		
		
	}

}
