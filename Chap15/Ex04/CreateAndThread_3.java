package Chap15.Ex04;

//Runnable �������̽��� run() �� �����Ͽ� ������ ����
class SMIFileRunnable implements Runnable{
	@Override
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
	}
}

class VideoRunnable implements Runnable{
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
	}
}


public class CreateAndThread_3 {

	public static void main(String[] args) {

		//smi ��ü ���� �� ����
		Runnable smi = new SMIFileRunnable();

		//start() �� Runnable �������̽� ���� �������� ����
		//smi.start();
		
		//Runnable ��ü�� Thread ������ ���ο� �ִ´�.
		Thread thread = new Thread(smi);
		
		
		Runnable video = new VideoRunnable();
		Thread thread2 = new Thread(video);
				
		thread.start();
		thread2.start();
	}

}
