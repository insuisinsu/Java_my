package Chap15.Ex02;
//1. Thread 클래스를 상속해서 run()을 오버라이딩 하여 구현 ( run(){} : 완성된 메소드)
//2. Runable 인터페이스의 run() 을 구현 ( run(); : 미완성된 메소드 )

class SMIFileThread extends Thread{

	//생성된 Thread 에서 작업할 내용을 구현 
	@Override
	public void run() {
		//2 번째 Thread 에서 작업할 내용 - 자막 프레임 출력
		
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막 프레임)" + strArray[i]);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				
			}
		}
		
	}
	
}


public class CreateAndStartThread {

	public static void main(String[] args) {
		//0. 쓰레드 작동
		Thread sm = new SMIFileThread();
		
		// ** run() 을 직접 호출하지 않고 반드시 start() 를 통해서 실행 **
		// run() 을 직접 호출하면 쓰레드가 작동하는 것이 아닌 메서드만 출력됨
		// start() 는 쓰레드를 작동시키기 위한 메모리 할당 후 run() 호출 : 쓰레드로 작업됨
		sm.start(); 	//run() 실행 = 쓰레드 시작
		
		
		//첫 번째 스레드 (main Thread 에서 작동) - 비디오 프레임 출력
		int[] intArray = {1,2,3,4,5};
		
		//비디오 프레임 출력
		for(int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임)" + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
		
		
		
		
		
		
		
	}

}


//권수향, 김겨울, 김문준, 박인수, 신장현, 이준형, 전승연, 조승현