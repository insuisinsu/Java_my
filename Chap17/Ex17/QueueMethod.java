package Chap17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

//Queue : FIFO (First In First Out) ���Լ���

public class QueueMethod {

	public static void main(String[] args) {

		Queue<Integer> queue1 = new LinkedList<Integer>();
		
		//1. ����ó���� �������� �ʴ� �޼ҵ� ( add(), element(), remove() )
		
		// add() : Queue �� ���� �߰��� �� ���
//		System.out.println(queue1.element()); 	//���� ���� �� ����� NoSuchElementException ���� �߻�,, <- ����ó���� �Ǿ����� ����
		System.out.println("add()");
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
		System.out.println(queue1);
		
		// element()  : �������� �غ�����,,, �� �տ� �ִ� �ָ� ������
		System.out.println("element()");
		System.out.println(queue1.element());
		
		// remove()  : ����
		System.out.println("remove()");
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
//		System.out.println(queue1.remove()); // ���� ���µ� �ٽ� remove() �� ȣ���ϸ� �����߻�
		
		//2. ����ó���� �����ϴ� �޼ҵ� ( offer(), peek(), poll() ) <- �̰� ������ ����
		System.out.println();
		Queue<Integer> queue2 = new LinkedList<Integer>();
		
		System.out.println(queue2.peek()); // ����ó�� �Ǿ�����. elements �ҽ�
		
		System.out.println("offer()");
		queue2.add(3);
		queue2.add(4);
		queue2.add(5);
		System.out.println(queue2);
		
		//E peek() : ����� ���� �̸� ���� ��
		System.out.println(queue2.peek());
		System.out.println(queue2);
		
		//poll() : ���� ��������
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2);
		
		
	}

}
