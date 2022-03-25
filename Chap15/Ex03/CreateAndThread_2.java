package Chap15.Ex03;


//2 �� ������ - �ڸ�
class SMIFileThread extends Thread{
	@Override
	public void run() {
		// �ڸ� ��ȣ ���
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

//3 �� ������ - ����
class VideoFileThread extends Thread{
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




public class CreateAndThread_2 {

	//1 �� ������
	public static void main(String[] args) {

		//SMIFileThread ��ü ����
		
		Thread smi = new SMIFileThread();
		smi.start();
		
		//VideoFileThread ��ü ����
		Thread video = new VideoFileThread();
		video.start();
		
		
		
	}

}
