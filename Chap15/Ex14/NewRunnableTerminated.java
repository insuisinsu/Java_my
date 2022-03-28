package Chap15.Ex14;

/*
 	������ ����
 	1. NEW			: ������ ��ü ������ .start() �޼��尡 ȣ��Ǳ� �� ����
 	2. RUNNABLE		: .start() �޼��尡 ȣ��Ǹ� run() �޼��� ������ �ڵ尡 CPU���� ����ǰ� �ִ� ����
 	3. Terminated	: run()�� ��� �ڵ尡 ����Ǹ� ������ ����
 	4. Timed waiting	: Ư�� �ð����ȸ� ������, Thread.sleep(1000);
 					  a.join(1000) <-- ���� �ڽ��� ������� 1�� ��� ���¿� �ְ�, a ��ü�� ���� ���·� ���� ����
 					  Ư�� �ð��� ����Ǹ� ���� ���·� ��
 					  ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� ������·� ��
 	5. Block		: ����ȭ ó������ lock �� �ɷ��� ������ ��� ���ܵ� ����, Ű�� �ݳ��� ��� Ű�� ȹ���ؼ� ���� ���·� ��
 	6. waiting		: ������ ��� ����. ���� ������� �������� �� �� �ִ�. �ٸ� �����尡 ������� �Ѵ�.
 */



public class NewRunnableTerminated {

	public static void main(String[] args) {
		//�������� ���¸� ������ ���� Ŭ����
		Thread.State state;		//state �������� 6���� ����� ���� ����

		//��ü ���� (NEW)
		//NEW : ������ ��ü ���� �� start() ȣ��Ǳ� �� ����
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i = 0; i < 100000000L; i++) {}
				//��ü ������ �ణ�� �ð��� �ʿ�
				//�޸��� �Ҵ� �ð��� �ʿ�
			}
		};
		
		state = myThread.getState();		// �������� ���¸� ������ �ͼ� state ������ �Ҵ�
		System.out.println("myThread state : " + state);
		
		//2. myThread ����
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread State : "+ state);
		
		//3. myThread ����
		//myThread.join();  �� ������(main)�� ����ϰ�, myThread �� ó���϶�
		try {myThread.join();} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread Strate : "+state);
		
		
		
	}

}
