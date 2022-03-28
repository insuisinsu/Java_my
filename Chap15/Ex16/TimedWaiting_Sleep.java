package Chap15.Ex16;

/*
 	Thread.sleep(1000) -> TimedWaiting 상태로 이동 -> 특정시간(1초)이 경과되면 Runnable 상태로 이동
 												-> 인터럽트가 발생되면 예외를 발생시키고 Runnable
 	인스턴스명(객체명)[a].join(1000) -> TimedWaiting 상태로 이동 -> 특정시간(1초)이 경과되면 Runnable 상태로 이동
 		a.join(1000) : 자신의 쓰레드는 1초를 기다리고  a 객체에게 cpu 할당 (Runnable).
 						1초 뒤에는 자신의 쓰레드도 Runnable
 	
 	인스턴스명(객체명)[a].join() -> Waiting 상태로 이동
 			자신의 쓰레드는 잠시 Waiting 상태로 가고 a 객체에게 CPU(Runnable) 사용하도록 할당
 			a 객체가 모두 완료된 경우 자신의 쓰레드도 Runnable
 */

class MyThread extends Thread{
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("---sleep() 진행중 Interrupt 발생");
			for(long i =0; i < 100000000L; i++) {
			}
		}
	};
}

public class TimedWaiting_Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
