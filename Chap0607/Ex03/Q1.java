package Chap0607.Ex03;

class Car{
	String company;				//�ʵ�(�ν��Ͻ� �ʵ�)�� company�� �˷��ִ� this,   Heap �޸𸮿� ����
	String model;				// �ν��Ͻ� : ��üȭ�� ���� �� ����� ������ �ʵ�
	String color;
	double maxSpeed;
	
	Car (String company, String model, String c, double d){
		this.company = company;
		this.model = model;
		color = c;				//this. �� ������ ����
		maxSpeed = d;			//this. �� ������ ����
	}
	
	void work() {				//�޼ҵ�(�ν��Ͻ� �޼ҵ�) : Heap ������ �޼ҵ��� �����͸� ����
								//�޼ҵ��� ��ü ������ Ŭ���� ������ �޼ҵ� ������ ����
		System.out.println("�� ������ ������ "+company+" �� " + model + " �̸�,");
		System.out.println("�ִ� �ü� "+maxSpeed+"km/h �� �ڶ��մϴ�.");
		System.out.println("���� �α��ִ� ������ "+color+" �Դϴ�.");
	}
	
	
	
}


public class Q1 {

	public static void main(String[] args) {
		//�����ڸ� ���ؼ� �⺻ ���� �Ҵ� �� �޸��� ������ work() �޼ҵ带 ����ؼ� ���
		
		Car sonata = new Car("�����ڵ���", "Sonata", "������", 230.5);
		sonata.work();
		
		
		
		
	}

}
