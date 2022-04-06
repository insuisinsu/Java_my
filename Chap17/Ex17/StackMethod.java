package Chap17.Ex17;

import java.util.Stack;

/*Stack �ڷᱸ�� : LIFO (Last In First Out) ���Լ���
	

*/
public class StackMethod {

	public static void main(String[] args) {

	Stack<Integer> stack = new Stack<Integer>();
	
	//1. E push(E element) : ���ÿ� ���� ���� �� ���
	stack.push(2);
	stack.push(5);
	stack.push(3);
	stack.push(7);
	
	//2. E peek() : ������ ���� ������ �����ٺ��� ��
	System.out.println(stack.peek());
	System.out.println(stack.size());
	System.out.println();
	
	//3. search(Object o) : �˻��ε� ,,, ���� ������ index ��ȣ�� �����
	//    �� ��ȣ�� ������ ����, 1�� ���� ������
	System.out.println(stack.search(7));
	System.out.println(stack.search(3));
	System.out.println(stack.search(5));
	System.out.println(stack.search(2));

	// " ���� �������� �ʴ� ��� -1 �� ����
	System.out.println(stack.search(9));
	System.out.println();
	
	//4. E pop() : ������ ���� ��������,, ���� �������� ���� ������ ������
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.size());
	System.out.println();
	
	//5. boolean empty() : ������� �� true ����
	System.out.println(stack.empty());
	
	
	
	
	
	
	
		
		
	}

}
