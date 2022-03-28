package Chap15.Ex16;

/*
 	Thread.sleep(1000) -> TimedWaiting ���·� �̵� -> Ư���ð�(1��)�� ����Ǹ� Runnable ���·� �̵�
 												-> ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable
 	�ν��Ͻ���(��ü��)[a].join(1000) -> TimedWaiting ���·� �̵� -> Ư���ð�(1��)�� ����Ǹ� Runnable ���·� �̵�
 		a.join(1000) : �ڽ��� ������� 1�ʸ� ��ٸ���  a ��ü���� cpu �Ҵ� (Runnable).
 						1�� �ڿ��� �ڽ��� �����嵵 Runnable
 	
 	�ν��Ͻ���(��ü��)[a].join() -> Waiting ���·� �̵�
 			�ڽ��� ������� ��� Waiting ���·� ���� a ��ü���� CPU(Runnable) ����ϵ��� �Ҵ�
 			a ��ü�� ��� �Ϸ�� ��� �ڽ��� �����嵵 Runnable
 */

class MyThread extends Thread{
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("---sleep() ������ Interrupt �߻�");
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
