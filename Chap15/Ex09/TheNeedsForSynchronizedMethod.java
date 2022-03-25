package Chap15.Ex09;
/*
	"�޼��� ����ȭ"

	����ȭ (Synchronized)
	: ���� �����尡 �ϳ��� ������ �ʵ带 ������ ���
		�� �۾��� ������ �Ϸ� �� ���� �۾��� ó���ϵ��� ����
	���� �۾��� �� lock �� �ɰ�, �۾��� ��ġ�� lock ����	
	
	. �޼��� ����ȭ : �޼����� ��ü�� ����ȭ
		..key ���� this �Ҵ��
	. ��� ����ȭ : 
	
	
*/

//2. ����ȭ ���� ��

// ���������� synchronized ����Ÿ�� �޼���� (){}
// �۾��ϴ� ���� �ٸ� �����尡 �������� ���ϰ� ������
// == �ϳ��� �����尡 �۾��� �Ϸ�Ǹ� ���� �����尡 �۾��� �� �� ����

//�����尡 �����ϴ� ��ü �ʵ� ����
class MyData {
	int data = 3;
	public synchronized void plusData(){
		int mydata = data;
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		data = mydata + 1;
	}
}
//1�� �����ϴ� �� ���� ������ ����
class PlusThread extends Thread{
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName()+" ���� ��� : "+myData.data);
	}
}


public class TheNeedsForSynchronizedMethod {

	public static void main(String[] args) {
		//���� ��ü ����
		MyData mydata = new MyData();
		
		//1. PlusThread 1
		Thread plusThread1 = new PlusThread(mydata);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		//2. PlusThread 2
				Thread plusThread2 = new PlusThread(mydata);
				plusThread2.setName("plusThread2");
				plusThread2.start();
		
		
		
		
		
		
		
		
	}

}
