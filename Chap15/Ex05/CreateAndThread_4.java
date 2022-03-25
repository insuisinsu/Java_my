package Chap15.Ex05;

//��ü ���� ���� �͸� ��ü�� ����ؼ� ������ ����


public class CreateAndThread_4 {

	public static void main(String[] args) {


		//�ڸ� ��ȣ ��� - ������
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				for(int i = 0; i < strArray.length; i++) {
					System.out.println(" - �ڸ� ��ȣ " + strArray[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			};
		});
		
		
		//���� ������ ��� - ������
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				int[] intArray = {1,2,3,4,5};
				for(int i = 0; i < intArray.length; i++) {
					System.out.print("(���� ������)" + intArray[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
					}
				}
			};
		});
		
		thread1.start();
		thread2.start();
		
	}

}
