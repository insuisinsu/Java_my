package Chap17.Ex17;

import java.util.Stack;

/*Stack 자료구조 : LIFO (Last In First Out) 후입선출
	

*/
public class StackMethod {

	public static void main(String[] args) {

	Stack<Integer> stack = new Stack<Integer>();
	
	//1. E push(E element) : 스택에 값을 넣을 때 사용
	stack.push(2);
	stack.push(5);
	stack.push(3);
	stack.push(7);
	
	//2. E peek() : 가져올 값을 위에서 내려다보는 것
	System.out.println(stack.peek());
	System.out.println(stack.size());
	System.out.println();
	
	//3. search(Object o) : 검색인데 ,,, 값을 넣으면 index 번호를 출력함
	//    방 번호는 위에서 부터, 1번 부터 시작함
	System.out.println(stack.search(7));
	System.out.println(stack.search(3));
	System.out.println(stack.search(5));
	System.out.println(stack.search(2));

	// " 값이 존재하지 않는 경우 -1 을 리턴
	System.out.println(stack.search(9));
	System.out.println();
	
	//4. E pop() : 스택의 값을 가져오기,, 제일 마지막에 넣은 값부터 가져옴
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.size());
	System.out.println();
	
	//5. boolean empty() : 비어있을 때 true 리턴
	System.out.println(stack.empty());
	
	
	
	
	
	
	
		
		
	}

}
