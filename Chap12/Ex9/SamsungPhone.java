package Chap12.Ex9;

public class SamsungPhone implements PhoneInterface{

	//�������̽����� ������ �޼ҵ带 �����ϱ�
	@Override
	public void sendCall() {
		System.out.println("�층�층~");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��");
	}
	
	//�߰����� SamsungPhone ���� ��� �߰��ϱ�
	public void flash() {
		System.out.println("�Һ��� ��½");
	}
	
}
