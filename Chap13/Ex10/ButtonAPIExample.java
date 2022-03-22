package Chap13.Ex10;

class Button {
//	OnClickListener : ��ü Ÿ��, ocl : ���� ����
	// ocl �⺻������ null
	OnClickListener ocl ;
	
	//setter �� ���ؼ� OnClickListener �� �������� ocl�� ��ü �ּҸ� ��´�.
	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	//InnerInterface ��, static Ű�� �����Ǿ� ����
	//Button.OnClickListener Ÿ������ ȣ�� ����
	//�������̽��� �����ϰ� ������ �ڽ� Ŭ������ �������� �ʱ� ������
	// ȣ���ϴ� ������ ocClick() �޼��带 �������ؼ� ȣ�� �ʿ�
	interface OnClickListener{
		//�߻� �޼��� ����. -> �������� �������̵� �ؼ� ������ �ʿ�
		void onClick();
	}
	
	//���� ���� ��  ocl.onClick() ȣ��
	void click() {
		ocl.onClick();		
		System.out.println(ocl);
	}
}

public class ButtonAPIExample {

	public static void main(String[] args) {

		//������ 1 : Ŭ���� ���� ���
		
		Button button1 = new Button();

		//OnClickListener Ÿ������ ��ü �����Ͽ� �Ű������� ����
		/*
		 	A.B = new A.B(){�̳��������̽� B�� �޼��带 ������ �ڵ�};
		 */
		
		button1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������ 1. �������");
			}
		}
		);
		button1.click();
		
		//������ 2 : Ŭ���� ���̹� ����
		Button button2 = new Button();
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������ 2. ���̹� ����");
			}
		});
		button2.click();
		
		
		
		
		
		
	}

}
