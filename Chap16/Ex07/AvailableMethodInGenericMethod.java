package Chap16.Ex07;

//���ʸ� �޼��� ���ο��� ��� ������ �޼��� : Object Ŭ������ �޼��常 ��� ����

class A{
	public <T> void method1(T t){
//		System.out.println(t.length()); 	//t.length() �� String Ŭ�������� ���ڼ��� ��������//���Ұ�
		System.out.println(t.equals("�ȳ�"));	//t.equals() �� Object Ŭ������ �޼����̱� ������ ��밡��
		
	}
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		
		A a = new A();
		a.<String>method1("�ȳ�");
		
		
	}

}
