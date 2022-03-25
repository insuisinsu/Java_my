package Chap15.Ex05;

//객체 생성 없이 익명 객체를 사용해서 쓰레드 생성


public class CreateAndThread_4 {

	public static void main(String[] args) {


		//자막 번호 출력 - 쓰레드
		Thread thread1 = new Thread(new Runnable() {
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
			};
		});
		
		
		//비디오 프레임 출력 - 쓰레드
		
		Thread thread2 = new Thread(new Runnable() {
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
			};
		});
		
		thread1.start();
		thread2.start();
		
	}

}
