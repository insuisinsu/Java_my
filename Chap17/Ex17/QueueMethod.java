package Chap17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

//Queue : FIFO (First In First Out) 선입선출

public class QueueMethod {

	public static void main(String[] args) {

		Queue<Integer> queue1 = new LinkedList<Integer>();
		
		//1. 예외처리를 포함하지 않는 메소드 ( add(), element(), remove() )
		
		// add() : Queue 에 값을 추가할 때 사용
//		System.out.println(queue1.element()); 	//값이 없을 때 실행시 NoSuchElementException 오류 발생,, <- 예외처리가 되어있지 않음
		System.out.println("add()");
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
		System.out.println(queue1);
		
		// element()  : 나오려고 준비중인,,, 맨 앞에 있는 애를 보여줌
		System.out.println("element()");
		System.out.println(queue1.element());
		
		// remove()  : 꺼냄
		System.out.println("remove()");
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
//		System.out.println(queue1.remove()); // 값이 없는데 다시 remove() 를 호출하면 오류발생
		
		//2. 예외처리를 포함하는 메소드 ( offer(), peek(), poll() ) <- 이거 쓰세요 제발
		System.out.println();
		Queue<Integer> queue2 = new LinkedList<Integer>();
		
		System.out.println(queue2.peek()); // 예외처리 되어있음. elements 불쌍
		
		System.out.println("offer()");
		queue2.add(3);
		queue2.add(4);
		queue2.add(5);
		System.out.println(queue2);
		
		//E peek() : 출력할 값을 미리 보는 것
		System.out.println(queue2.peek());
		System.out.println(queue2);
		
		//poll() : 값을 꺼내오기
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2.poll());
		System.out.println(queue2);
		
		
	}

}
