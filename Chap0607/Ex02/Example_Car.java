package Chap0607.Ex02;



public class Example_Car {

	public static void main(String[] args) {

		//Car Class �� ��üȭ �ؼ� 5���� ��ü�� �����ؼ� ���� �Ҵ��ؼ� ����غ��ô�!

		
		Car avante = new Car();				//��üȭ
		
		// ������ ���� ���� �Ҵ�, ������� �ƴ� // �޸𸮿� ������ �ʴ� ���� ���� �Ҵ�
		// private ������ : ĸ��ȭ , ���� ������ ���� �Ҵ����� ���ϵ��� �Ѵ�.
		
		avante.company = "����";
		avante.model = "�ƹݶ�";
		avante.color = "������";
		avante.maxSpeed = 210;
		
		System.out.println(avante.company);
		System.out.println(avante.model);
		System.out.println(avante.color);
		System.out.println(avante.maxSpeed);
		System.out.println();		
		
		Car sonata = new Car();
		
		//setter �� ���ؼ� ���� �ο� : ������ �ԷµǴ� ���� ������ �� �ִ�.
		
		sonata.setCompany("����");
		sonata.setModel("�Ÿ");
		sonata.setColor("���");
		sonata.setMaxSpeed(220);		// - or 300 �� �̻��� ���� �� ������ ���� 
		
		//getter �� �޸��� ���� ����� ��
		System.out.println(sonata.getModel());
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		System.out.println();
		
		Car k3 = new Car();
		
		k3.setCompany("���");
		k3.setModel("K3");
		k3.setColor("������");
		k3.setMaxSpeed(210);
		
		System.out.println(k3.getModel());
		System.out.println(k3.getCompany());
		System.out.println(k3.getColor());
		System.out.println(k3.getMaxSpeed());
		System.out.println();
		
		Car k5 = new Car();

		k5.company = "���";
		k5.model = "K5";
		k5.color = "Ȳ�ݻ�";
		k5.maxSpeed = 240;
		
		System.out.println(k5.company);
		System.out.println(k5.model);
		System.out.println(k5.color);
		System.out.println(k5.maxSpeed);
		System.out.println();
		
		Car k7 = new Car();
		
		k7.setModel("K7");
		k7.setCompany("���");
		k7.setColor("����");
		k7.setMaxSpeed(320);
		
		System.out.println(k7.getCompany());
		System.out.println(k7.getModel());
		System.out.println(k7.getColor());
		System.out.println(k7.getMaxSpeed());
		System.out.println();
		
	}

}
