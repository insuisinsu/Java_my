package Chap15.Ex07;

//일반 쓰레드 : setDaemon(false) default 임 : 마지막 쓰레드가 종료되더라도 자신의 일을 모두 마치고 종료한다.
//데몬 쓰레드 : setDaemon(true) : 쓰레드를 start 할 때 설정(수정, 변경 불가),
//			- 마지막 쓰레드가 종료되는 시점에 종료
//			- 일반적으로는 다른 쓰레드의 작업을 돕는 보조 쓰레드
//			- 종료시점이 마지막 일반쓰레드 종료될 대 종료되는 것 외에는 일반쓰레드와 동일
//			- 가비지 컬렉트 : 메모리의 사용되지 않는 객체를 자동으로 제거함
//				- 프로세서가 종료시점에 자동저장, 화면 자동 갱신... 등
//			- 무한 루프를 사용해서 항시 대기하고 있다가 특정 조건이 만족되면 작업을 수행하고 다시 대기상태로 돌아감 



//스레드를 작동시킬 클래스
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+" : "+(isDaemon()?"데몬쓰레드":"일반쓰레드"));
		for (int i = 0; i<6; i++) {
			System.out.println(getName() + " : "+i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}


public class ThreadProperities_3 {

	public static void main(String[] args) {

		//1. 일반 쓰레드
		Thread thread1 = new MyThread();
		thread1.setDaemon(false); // 디폴트임
		thread1.setName("thread1");
		thread1.start();
		
		//2. Daemon Thread : 마지막 쓰레드가 종료되는 시점에 종료됨
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		
		//2. 3.5초 후에 main Thread 종료
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
		}
		System.out.println("main Thread 종료");
		
		
		
		
		
		
	}

}
