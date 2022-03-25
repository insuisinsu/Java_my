package Chap15.Ex02;
//1. Thread Ŭ������ ����ؼ� run()�� �������̵� �Ͽ� ���� ( run(){} : �ϼ��� �޼ҵ�)
//2. Runable �������̽��� run() �� ���� ( run(); : �̿ϼ��� �޼ҵ� )

class SMIFileThread extends Thread{

	//������ Thread ���� �۾��� ������ ���� 
	@Override
	public void run() {
		//2 ��° Thread ���� �۾��� ���� - �ڸ� ������ ���
		
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (�ڸ� ������)" + strArray[i]);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				
			}
		}
		
	}
	
}


public class CreateAndStartThread {

	public static void main(String[] args) {
		//0. ������ �۵�
		Thread sm = new SMIFileThread();
		
		// ** run() �� ���� ȣ������ �ʰ� �ݵ�� start() �� ���ؼ� ���� **
		// run() �� ���� ȣ���ϸ� �����尡 �۵��ϴ� ���� �ƴ� �޼��常 ��µ�
		// start() �� �����带 �۵���Ű�� ���� �޸� �Ҵ� �� run() ȣ�� : ������� �۾���
		sm.start(); 	//run() ���� = ������ ����
		
		
		//ù ��° ������ (main Thread ���� �۵�) - ���� ������ ���
		int[] intArray = {1,2,3,4,5};
		
		//���� ������ ���
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("(���� ������)" + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
		
		
		
		
		
		
		
	}

}


//�Ǽ���, ��ܿ�, �蹮��, ���μ�, ������, ������, ���¿�, ������