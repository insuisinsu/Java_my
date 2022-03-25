package Chap15.Ex07;

//�Ϲ� ������ : setDaemon(false) default �� : ������ �����尡 ����Ǵ��� �ڽ��� ���� ��� ��ġ�� �����Ѵ�.
//���� ������ : setDaemon(true) : �����带 start �� �� ����(����, ���� �Ұ�),
//			- ������ �����尡 ����Ǵ� ������ ����
//			- �Ϲ������δ� �ٸ� �������� �۾��� ���� ���� ������
//			- ��������� ������ �Ϲݾ����� ����� �� ����Ǵ� �� �ܿ��� �Ϲݾ������ ����
//			- ������ �÷�Ʈ : �޸��� ������ �ʴ� ��ü�� �ڵ����� ������
//				- ���μ����� ��������� �ڵ�����, ȭ�� �ڵ� ����... ��
//			- ���� ������ ����ؼ� �׽� ����ϰ� �ִٰ� Ư�� ������ �����Ǹ� �۾��� �����ϰ� �ٽ� �����·� ���ư� 



//�����带 �۵���ų Ŭ����
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+" : "+(isDaemon()?"���󾲷���":"�Ϲݾ�����"));
		for (int i = 0; i<6; i++) {
			System.out.println(getName() + " : "+i+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}


public class ThreadProperities_3 {

	public static void main(String[] args) {

		//1. �Ϲ� ������
		Thread thread1 = new MyThread();
		thread1.setDaemon(false); // ����Ʈ��
		thread1.setName("thread1");
		thread1.start();
		
		//2. Daemon Thread : ������ �����尡 ����Ǵ� ������ �����
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		
		//2. 3.5�� �Ŀ� main Thread ����
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
		}
		System.out.println("main Thread ����");
		
		
		
		
		
		
	}

}
