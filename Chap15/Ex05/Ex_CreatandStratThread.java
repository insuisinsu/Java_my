package Chap15.Ex05;

/*
 	1. Thread 상속
 	2. Runnable 구현
 	3. 익명
 	4. 익명
 	
 	각 값을 String 배열에 저장 후 아래와 같이 출력 하세용
 	
 	1. 		2.		3.		4. 
 	이름		홍길동	이순신	신사임당
 	나이		40		50		60
 	국어		100		90		80
 	영어		70		60		100
 	수학		50		70		80
 	
 */


class A extends Thread{
	@Override
	public void run() {
		String[] strArray = {"이름","나이","국어","영어","수학"};
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]+" : ");
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Hgd implements Runnable{
	public void run() {
		String[] gd = {"홍길동","40 ","100","70 ","50 "};
		for(int i = 0; i < gd.length; i++) {
			System.out.print(" "+gd[i]);
			try {
				Thread.sleep(980);
			} catch (InterruptedException e) {
			}
		}
	};
}



public class Ex_CreatandStratThread {

	public static void main(String[] args) {

		Thread a = new A();
		a.start();
		
		Runnable hgd = new Hgd();
		Thread threadgd = new Thread(hgd);
		threadgd.start();
		
		
		Thread threadss = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] ss = {"이순신","  50 ","  90 ","  60 ","  70 "};
				for(int i = 0; i < ss.length; i++) {
					System.out.print("   "+ss[i]);
					try {
						Thread.sleep(990);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		threadss.start();
		
		Thread threadid = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] id = {"신사임당","  60 ","  80 ","  100","  80 "};
				for(int i = 0; i < id.length; i++) {
					System.out.println("   "+id[i]);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		threadid.start();
		
	}

}
