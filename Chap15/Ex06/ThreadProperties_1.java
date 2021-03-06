package Chap15.Ex06;

public class ThreadProperties_1 {

	public static void main(String[] args) {

		//1. 객체 가져오기 (currentThread()) // 쓰레드 수 (activeCount())
			//static
		Thread curThread = Thread.currentThread();		//main Thread
		//클래스(타입) 참조변수 = 클래스명.메소드명
		System.out.println("현재 스레드의 이름 : "+curThread.getName());
		System.out.println("동작하는 쓰레드 수 "+Thread.activeCount());
		
		//2. 쓰레드 이름 지정
		//2.1 자동출력 - 쓰레드 이름을 지정하지 않으면, JVM 이 쓰레드의 이름을 자동으로 할당함(Thread-0, Thread-1, ... , )
		for(int i = 0; i <10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println("========================");
		//2.2 쓰레드 이름 직접 지정
		//객체명.setName()
		for(int i = 0; i<10; i++) {
			Thread thread = new Thread();
			thread.setName(i + " 번째 쓰레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println("========================");
		
		//4. 스레드의 이름 출력 (자동 출력) - JVM이 스레드 이름을 자동으로 할당  Thread-0 ~ ...
		for(int i = 0; i <10; i++) {
			Thread a = new Thread();
			System.out.println(a.getName());
			a.start();
		}
		
		//5. Tmfpem tn cnffurgkrl
		System.out.println("동작하는 쓰레드 수 : "+Thread.activeCount());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
