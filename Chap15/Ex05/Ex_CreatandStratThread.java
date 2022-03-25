package Chap15.Ex05;

/*
 	1. Thread ���
 	2. Runnable ����
 	3. �͸�
 	4. �͸�
 	
 	�� ���� String �迭�� ���� �� �Ʒ��� ���� ��� �ϼ���
 	
 	1. 		2.		3.		4. 
 	�̸�		ȫ�浿	�̼���	�Ż��Ӵ�
 	����		40		50		60
 	����		100		90		80
 	����		70		60		100
 	����		50		70		80
 	
 */


class A extends Thread{
	@Override
	public void run() {
		String[] strArray = {"�̸�","����","����","����","����"};
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
		String[] gd = {"ȫ�浿","40 ","100","70 ","50 "};
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
				String[] ss = {"�̼���","  50 ","  90 ","  60 ","  70 "};
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
				String[] id = {"�Ż��Ӵ�","  60 ","  80 ","  100","  80 "};
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
