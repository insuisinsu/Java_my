package Chap15.Ex14;

/*
 	쓰레드 상태
 	1. NEW			: 쓰레드 객체 생성후 .start() 메서드가 호출되기 전 상태
 	2. RUNNABLE		: .start() 메서드가 호출되면 run() 메서드 내부의 코드가 CPU에서 실행되고 있는 상태
 	3. Terminated	: run()의 모든 코드가 실행되면 쓰레드 종료
 	4. Timed waiting	: 특정 시간동안만 대기상태, Thread.sleep(1000);
 					  a.join(1000) <-- 현재 자신의 쓰레드는 1초 대기 상태에 있고, a 객체를 실행 상태로 먼저 보냄
 					  특정 시간이 종료되면 실행 상태로 감
 					  인터럽트가 발생되면 예외를 발생시키고 실행상태로 감
 	5. Block		: 동기화 처리에서 lock 이 걸려서 접근이 잠시 차단된 상태, 키를 반납한 경우 키를 획득해서 실행 상태로 감
 	6. waiting		: 무한정 대기 상태. 누가 깨워줘야 실행으로 갈 수 있다. 다른 쓰레드가 깨워줘야 한다.
 */



public class NewRunnableTerminated {

	public static void main(String[] args) {
		//쓰레드의 상태를 저장해 놓은 클래스
		Thread.State state;		//state 변수에는 6가지 상수만 저장 가능

		//객체 생성 (NEW)
		//NEW : 쓰레드 객체 생성 후 start() 호출되기 전 까지
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i = 0; i < 100000000L; i++) {}
				//객체 생성시 약간의 시간이 필요
				//메모리의 할당 시간이 필요
			}
		};
		
		state = myThread.getState();		// 쓰레드의 상태를 가지고 와서 state 변수에 할당
		System.out.println("myThread state : " + state);
		
		//2. myThread 시작
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread State : "+ state);
		
		//3. myThread 종료
		//myThread.join();  내 쓰레드(main)는 대기하고, myThread 를 처리하라
		try {myThread.join();} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread Strate : "+state);
		
		
		
	}

}
