package Chap15.Ex06;

//������ �켱 ����


class MyThread extends Thread{
	@Override
	public void run() {
		for (long i = 0; i<10000000;i++) {		//�ð� ������
			System.out.println(getName() + "�켱����"+getPriority());
		}
	}
}



public class ThreadProperties_2 {

	public static void main(String[] args) {

		//1. ���� : CPU core Ȯ���ϱ�
		System.out.println("�ھ�� : "+Runtime.getRuntime().availableProcessors());
		
		//2. �켱 ����	
		//(����) 0 ~ 5(default) ~ 10 (����)
		for(int i = 0; i < 3 ; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName()+"\t");
			System.out.println(thread.getPriority());
			thread.start();
		}
		//1�� ����
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		//3. �켱���� ���� ����
		for (int i = 0; i < 10; i++) {
			Thread thread = new MyThread();
			thread.setName(i+" ��° ������");
			if(i==9) {							//������ �������� �켱������ 10���� ����
				thread.setPriority(10);
			}
			thread.start();
			//System.out.print(thread.getName()+"\t");
			//System.out.println(thread.getPriority());
		}
		
		
		
		
		
	}

}