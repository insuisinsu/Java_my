package Chap0607.Ex02;

public class Car {


	String company ; 
	String model ;
	String color ;
	int maxSpeed ;
	
	public String getCompany() {
		return company;
	}
	// RAM ���� �ο��� �� setter
	// this : �ڽ��� ��ü
	public void setCompany(String company) {	//�޼ҵ忡 ��ǲ�Ǵ� ������ company	
		this.company = company;		// ��ǲ�� ������ �޴� ������ company			
	}	// �޸𸮿� �ε��� ������ this.company				
		// �� ������ �������� ������ ��� this. Ű ���
	public String getModel() {
		return model;
	}
	public void setModel(String mo) {	
		model = mo;	//��ǲ(mo), ��ǲ�� �޴� ����(mo), �޸𸮿� �ε��� ����(model)��
					//�̸��� ���� �ʴٸ� this. ���� ����	
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	

}
