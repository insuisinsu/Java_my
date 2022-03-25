package Chap15.Ex09;
/*
	"메서드 동기화"

	동기화 (Synchronized)
	: 여러 쓰레드가 하나의 공유된 필드를 접근할 경우
		한 작업을 완전히 완료 후 다음 작없을 처리하도록 설정
	내가 작업할 때 lock 을 걸고, 작업을 마치면 lock 해제	
	
	. 메서드 동기화 : 메서드의 전체를 동기화
		..key 값이 this 할당됨
	. 블록 동기화 : 
	
	
*/

//2. 동기화 했을 때

// 접근지정자 synchronized 리턴타입 메서드명 (){}
// 작업하는 동안 다른 쓰레드가 접근하지 못하게 막아줌
// == 하나의 쓰레드가 작업이 완료되면 다음 쓰레드가 작업을 할 수 있음

//쓰레드가 공유하는 객체 필드 생성
class MyData {
	int data = 3;
	public synchronized void plusData(){
		int mydata = data;
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		data = mydata + 1;
	}
}
//1씩 증가하는 두 개의 쓰레드 생성
class PlusThread extends Thread{
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName()+" 실행 결과 : "+myData.data);
	}
}


public class TheNeedsForSynchronizedMethod {

	public static void main(String[] args) {
		//공유 객체 생성
		MyData mydata = new MyData();
		
		//1. PlusThread 1
		Thread plusThread1 = new PlusThread(mydata);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		//2. PlusThread 2
				Thread plusThread2 = new PlusThread(mydata);
				plusThread2.setName("plusThread2");
				plusThread2.start();
		
		
		
		
		
		
		
		
	}

}
