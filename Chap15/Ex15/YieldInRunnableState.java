package Chap15.Ex15;



//Thread.yield() : 쓰레드의 실행상태 (RUNNABLE) 에 있는 특정 쓰레드에게 자신의 쓰레드를 일시 양보
	// 실행 상태 내부에서 다른 쓰레드를 먼저 실행하도록 양보
	// 동기화에서 key 를 서로 점유하는 현상 발생..-> 키를 양보해서 균등하게 처리하도록 할 때 사용

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {
			if(yieldFlag) {			//yieldFlag 가 True 일때 쓰레드를 양보 해줌
				Thread.yield(); 	//쓰레드를 양보해줌
			}else {
				System.out.println(getName() + "실행");  //yieldFlag 가 false 일때 쓰레드 정보를 출력 해줌
				for (long i = 0; i < 100000000; i++) {
					
				}
			}
		}
	}
}

public class YieldInRunnableState {

	public static void main(String[] args) {

		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;		//false 일 때 쓰레드 정보 출력
		thread1.setDaemon(true); 		//마지막 쓰레드가 종료될 때 같이 종료됨 // while 무한 루프에서 빠져나오기 위함
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = false;		//false 일 때 쓰레드 정보 출력
		thread2.setDaemon(true); 		//마지막 쓰레드가 종료될 때 같이 종료됨
		thread2.start();
		
		//쓰레드 6초 지연 ( 1초 마다 한 번씩 양보)
		for (int i = 0 ; i < 6; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			thread1.yieldFlag =! thread1.yieldFlag;		// 참일 땐 거짓을 저장, 거짓을 땐 참을 저장
			thread2.yieldFlag =! thread2.yieldFlag;
		}
		
	}

}
