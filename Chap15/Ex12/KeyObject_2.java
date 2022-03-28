package Chap15.Ex12;


/*
 	여러 쓰레드가 공유된 필드에 접근할 때 동시성의 문제가 발생 --> 동기화를 통해 동시성 문제 해결
 	동기화 : 여러 쓰레드가 공유된 필드를 접근할 때 하나의 쓰레드가 완료되면 다른 쓰레드에서 접근이 가능
 		하나의 쓰레드가 사용중인 경우 lock 을 걸고 작업이 완료되면 다른 쓰레드가 접근 가능하도록 lock 해제
 		
 		. 모든 동기화된 메서드는 (자기 자신의 객체,)this 키만 가짐
 		. 여러 메서드가 동기화된 메서드일 경우 : 하나의 쓰레드만 접근이 가능
 */

class MyData{
	//여러 쓰레드가 접근할때 동시성 문제를 방지하기 위해서 동기화 처리
	
	//동기화 메서드는 key 값을 넣을 수 없다.
	//하나의 쓰레드가 저근할 때 key를 가지고 동기화된 메서드에 접근 가능하다.
	//key 는 객체를 키로 사용할 수 있다.
	//동기화 블럭은 key 값을 임의로 할당 가능하다
	synchronized void abc() {
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for(int i = 0; i < 3; i++) {
			System.out.println(i + " sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	
	synchronized void bcd() {
		try {Thread.sleep(20);} catch (InterruptedException e) {}
		for(int i = 0; i < 3; i++) {
			System.out.println(i + " 초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	
	void cde() {
		synchronized (new Object()) {
			
		try {Thread.sleep(30);} catch (InterruptedException e) {}
		for(int i = 0; i < 3; i++) {
			System.out.println(i + " 땡");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
		}
	}
}

public class KeyObject_2 {

	public static void main(String[] args) {

		MyData myData = new MyData();
		
		new Thread() {				//익명 클래스 : 쓰레드 클래스를 구현하는 자식 익명클래스
			public void run() {
				myData.abc();
			}
		}.start();
		
		new Thread() {				//익명 클래스 : 쓰레드 클래스를 구현하는 자식 익명클래스
			public void run() {
				myData.bcd();
			}
		}.start();
		
		new Thread() {				//익명 클래스 : 쓰레드 클래스를 구현하는 자식 익명클래스
			public void run() {
				myData.cde();
			}
		}.start();
		
		
	}

}
