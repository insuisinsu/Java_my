package Chap0607.Ex01;

class AA {
	String name;							//�ʵ�(���) : �ν��Ͻ�ȭ ���Ѿ� ����� ����
	int age;
	String email;
	
	AA() {	} 					// �⺻ ������, ���� ����
								// �ٸ� �����ڰ� ������ ��쿡�� ������ �� ����
	
	public String getName() {				//�޼ҵ�(���) : �ν��Ͻ�ȭ ���Ѿ� ��밡��
		return name;						//Heap ������ �ּҸ� ����, Ŭ���� ���� ���� �޼ҵ� ������ ����
	}										//return : �޼ҵ带 ȣ���ϴ� ������ ������ ���� �����ش�.
	public void setName(String name) {		//void : ���� ���� 
		this.name = name;					
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}


public class CreatObject {

	public static void main(String[] args) {

		
		AA aa = new AA();		//AAŬ����(���赵)�� aa(��ü) �� ����
		// AA : Ŭ���� �̸�, aa : ��ü�� (�ν��Ͻ���), new : Heap ������ �ʵ�� �޼ҵ�
		// AA() : ������ : ��ü�� �ʵ尪�� �ʱ�ȭ. �����ڵ� �ϳ��� �޼ҵ�
			//1. ������ �̸��� Ŭ���� �̸��� ���� �޼ҵ�
			//2. ����Ÿ���� ����.
			//3. �������� �Ű������� ���� �����ڸ� �⺻ ������
			//4. �⺻ �����ڴ� ������ �����ϴ�.
			//5. ��ü�� ���� �� �� �ݵ�� �����ڸ� ȣ��
		
		
		
		
		//setters : ��ü�� �޸𸮿� ���� �Ҵ� �� ��
		aa.setName("ȫ�浿");				//��ü�� �޸𸮸� �Ҵ�
		aa.setAge(30);
		aa.setEmail("aa@aa.com");
		//ghetters : ��ü�� �޸��� ���� ������ �� ��
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		
		
		
		
		
	}

}
