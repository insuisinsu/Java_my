package Chap15.Ex12;


/*
 	���� �����尡 ������ �ʵ忡 ������ �� ���ü��� ������ �߻� --> ����ȭ�� ���� ���ü� ���� �ذ�
 	����ȭ : ���� �����尡 ������ �ʵ带 ������ �� �ϳ��� �����尡 �Ϸ�Ǹ� �ٸ� �����忡�� ������ ����
 		�ϳ��� �����尡 ������� ��� lock �� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ� �����尡 ���� �����ϵ��� lock ����
 		
 		. ��� ����ȭ�� �޼���� (�ڱ� �ڽ��� ��ü,)this Ű�� ����
 		. ���� �޼��尡 ����ȭ�� �޼����� ��� : �ϳ��� �����常 ������ ����
 */

class MyData{
	//���� �����尡 �����Ҷ� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
	
	//����ȭ �޼���� key ���� ���� �� ����.
	//�ϳ��� �����尡 ������ �� key�� ������ ����ȭ�� �޼��忡 ���� �����ϴ�.
	//key �� ��ü�� Ű�� ����� �� �ִ�.
	//����ȭ ���� key ���� ���Ƿ� �Ҵ� �����ϴ�
	synchronized void abc() {
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for(int i = 0; i < 3; i++) {
			System.out.println(i + " sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	
	synchronized void bcd() {
		try {Thread.sleep(20);} catch (InterruptedException e) {}
		for(int i = 0; i < 3; i++) {
			System.out.println(i + " ��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	
	void cde() {
		synchronized (new Object()) {
			
		try {Thread.sleep(30);} catch (InterruptedException e) {}
		for(int i = 0; i < 3; i++) {
			System.out.println(i + " ��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
		}
	}
}

public class KeyObject_2 {

	public static void main(String[] args) {

		MyData myData = new MyData();
		
		new Thread() {				//�͸� Ŭ���� : ������ Ŭ������ �����ϴ� �ڽ� �͸�Ŭ����
			public void run() {
				myData.abc();
			}
		}.start();
		
		new Thread() {				//�͸� Ŭ���� : ������ Ŭ������ �����ϴ� �ڽ� �͸�Ŭ����
			public void run() {
				myData.bcd();
			}
		}.start();
		
		new Thread() {				//�͸� Ŭ���� : ������ Ŭ������ �����ϴ� �ڽ� �͸�Ŭ����
			public void run() {
				myData.cde();
			}
		}.start();
		
		
	}

}
