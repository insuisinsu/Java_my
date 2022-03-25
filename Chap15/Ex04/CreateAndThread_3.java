package Chap15.Ex04;

//Runnable 인터페이스의 run() 을 구현하여 쓰레드 생성
class SMIFileRunnable implements Runnable{
	@Override
	public void run() {
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - 자막 번호 " + strArray[i]);
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
			System.out.print("(비디오 프레임)" + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}


public class CreateAndThread_3 {

	public static void main(String[] args) {

		//smi 객체 생성 후 시작
		Runnable smi = new SMIFileRunnable();

		//start() 은 Runnable 인터페이스 내에 존재하지 않음
		//smi.start();
		
		//Runnable 객체를 Thread 생성자 내부에 넣는다.
		Thread thread = new Thread(smi);
		
		
		Runnable video = new VideoRunnable();
		Thread thread2 = new Thread(video);
				
		thread.start();
		thread2.start();
	}

}
