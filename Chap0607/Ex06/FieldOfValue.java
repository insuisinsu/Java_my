package Chap0607.Ex06;

//��ü�� �ʵ忡 ���� �Ҵ��ϴ� ��� 3����
//1. �ʵ忡 ���� ���� �ο��ϴ� ���						// ��ü ���� ��
//2. setter �� ���ؼ� ��ü�� �ʵ忡 ���� �ο� (��Ʈ�� ����)	// ��ü ���� ��
//3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο� (��Ʈ�� ����)		// ��ü ������ �� �ʱⰪ���� �ʵ忡 �� �Ҵ�


//1. ��ü ���� �� ���� �ʵ忡 �� �Ҵ�
class Aa { 				
	String name ;
	int age;
	String mail;
	
	void print() {
		System.out.println("name : "+name +".  age : "+age+".  mail : "+mail);
	}
	
}

//2. setter �� ���ؼ� ��ü�� �ʵ忡 ���� �ο�
class Bb{
	String name ;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	int age;
	String mail;
	
	void print() {
		System.out.println("name : "+name +".  age : "+age+".  mail : "+mail);
	}
	
}

//3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο�
class Cc{
	String name ;
	int age;
	String mail;
	
	void work (String name, int age, String mail) {
		this.name = name;
		this.age = age;
		this.mail = mail;
		print();
	}
	
	void print() {
		System.out.println("name : "+name +".  age : "+age+".  mail : "+mail);
	}
}

public class FieldOfValue {

	public static void main(String[] args) {

		//1. ��ü�� �ʵ忡 ���� ���� �ο��ϴ� ���						// ��ü ���� ��
		Aa aa = new Aa();
		
		aa.name = "���μ�";
		aa.age = 30;
		aa.mail = "aaa@aaaa.com";
		aa.print();
		
		//2. ��ü�� setter �� ���ؼ� ��ü�� �ʵ忡 ���� �ο� (��Ʈ�� ����)	// ��ü ���� ��
		Bb bb = new Bb();
		
		bb.setName("ȫ�浿");
		bb.setAge(20);
		bb.setMail("bbb@bbbbb.com");
		bb.print();
		
		//3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο� (��Ʈ�� ����)			// ��ü ������ �� �ʱⰪ���� �ʵ忡 �� �Ҵ�
		Cc cc = new Cc();
		
		cc.work("�����", 32, "ccc@ccccc.com");
	}

}
