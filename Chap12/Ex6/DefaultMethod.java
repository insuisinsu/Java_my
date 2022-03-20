package Chap12.Ex6;

//Interface �� default �޼ҵ�
// : �������̽� ������ �����ΰ� �ִ� �޼ҵ�
// : ������ �����Ǿ� �ִ� �������̽����� ���ο� ����� �߰��� ��,
//   ���� Ŭ�������� ������ �ʿ���� ���ο� ����� �߰��� �� ���
	//java 1.8 ���Ŀ� ���Ӱ� �߰��� ���
// �� ��� default Ű�� �־�� �Ѵ�. ��, ���⼭�� default �� ���������ڰ� �ƴ�

interface A{
	//2020�� ������ �޼ҵ�
	//public abstract �� �����Ǿ����� �����ΰ� ���� �߻�޼ҵ� ��
	void abc(); 		
	//2030�� ������ �޼ҵ�
	default void bcd() {	
		System.out.println("A interface, bcd()");
	}
}
	//2020�� ������ Ŭ����
class B implements A{
	public void abc() {
		System.out.println("B class abc()");
	}
}
	//2030�� ������ Ŭ����
class C implements A {
	public void abc() {
		System.out.println("C class abc()");
	}
	//default �޼ҵ嵵 �������̵� �� �� ����
	public void bcd() {
		System.out.println("C class bcd()");
	}
}

public class DefaultMethod {

	public static void main(String[] args) {
		//1. ��ü ����
		A a1 = new B();
		A a2 = new C();
		
		//2. �޼ҵ� ȣ��
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
		
		
	}

}
