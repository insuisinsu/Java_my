package Chap0607.Ex01;

class Aaa {
	String name;				//�ʵ� : ��üȭ ���Ѿ� ����� ����, Ŭ���� ��Ͽ��� ����
	int age;					//�ʵ��� ������ Heap ������ ����, Heap ������ ������ ������ ���� �ʱ�ȭ ��
	double weight;
	String email;				//�ʵ�� ���� �ǰ� ���� �Ҵ��� �����ʴ� ��� : 
	boolean man;				//�������� : Null, int : 0; double : 0.0, boolean : false
	
	
	
	
	public String getName() {					//�޼ҵ� ȣ��
		return name;
	}
	public void setName(String name) {			//��ǲ�Ǵ� ����, �޴� ���� �̸�, �޸� �̸��� ��� ������ ���
		this.name = name;						// �޸� �̸��� this : �ڱ� �ڽ��� Ŭ������ ����
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean getMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	
	
	
}


public class CreatObject_02 {

	public static void main(String[] args) {

		Aaa aaa = new Aaa();		//��ü ���� (aaa)
		
		//�ʵ��� �ʱⰪ�� ��� (Heap ������ ���� �ʱ�ȭ)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		System.out.println("============");
		
		//������ ���� ���� ���� // �޸𸮿� ���� ���� �Ҵ��ϴ� ���� ���Ȼ� ���� �ʴ�. ĸ��ȭ
		aaa.name = "ȫ�浿";
		aaa.age	=	30 ;
		aaa.weight = 70.1 ;
		aaa.man	= true;
		aaa.email = "aaa@aa.com";
		
		//������ ���� ���
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		
		//setter�� ���ؼ� ���� ���� [Heap] 
			// �޸𸮿� ���� ���� �� ������ �� �ִ�.
				// ���� �����ϴ� ���� (1�� ~ 12��)
		
		aaa.setName("�������");
		aaa.setAge(1209);
		aaa.setEmail("bbb@bbb.co");
		aaa.setWeight(76.4);
		aaa.setMan(true);
		
		//getter�� ���ؼ� �� ���
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getWeight());
		System.out.println(aaa.getMan());
		
		//�ϳ��� Ŭ�������� �������� ��ü�� ���� �� ���
		Aaa bbb = new Aaa();
		Aaa ccc = new Aaa();
		Aaa ddd = new Aaa();
		
		
		
				
				
				
		
		
	}

}
