package Chap17.Ex03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListMethod_1 {

	public static void main(String[] args) {

		/*
		 	List 의 메소드 13개
		 	- ArrayList, Vector, LinkedList 에서도 사용됨
		
		 1. add(E element)				: 끝에다가 값 추가   
		 2. add(int index, E element)	: 해당 방번호에 값 추가
		 3. addAll 						: 또 다른 리스트의 객체를 복사해서 추가  
		 4. addAll(int index, 다른 객체)	: 해당 방번호에 다른 객체 끼워넣기
		 5. set(int index, E element) 	: 특정 방번호의 값을 수정함
		 6. remove(int index) 			: 해당 방번호의 값 삭제
		 7. remove(Object o) 			: 값으로 삭제
		 8. clear() 					: 모두 삭제
		 9. isEmpty() 					: 값이 비었으면 True, 값이 있으면 False
		 10. size() 					: 값의 갯수
		 11. get(int index) 			: 방번호의 값을 출력
		 12. toArray()					: List 타입을 Array 타입으로(배열로) 바꿈
		 13-1. toArray(T[] t)	: t[]	: Integer 로 바로 캐스팅
		 									new Integer[0] 변환할 때 원하는 방 갯수 입력,
		 									원래 방크기 보다 작으면 전체를 의미
		 13-2. toArray(T[] t)	: t[]	: Integer 로 바로 캐스팅
		 
		 */
		
		List<Integer> linkedList1 = new LinkedList<Integer>();
		
//		1. add(E element)		: 끝에다가 값 추가
		linkedList1.add(3);
		linkedList1.add(4);
		linkedList1.add(5);
		System.out.println(linkedList1);
		System.out.println(linkedList1.size());
		
//		2. add(int index, E element)
		linkedList1.add(1, 6);					// 1 번 방에 6을 추가
		System.out.println(linkedList1);
		System.out.println(linkedList1.size());
		
//		3. addAll : 또 다른 리스트의 객체를 복사해서 추가
		List<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.add(1);
		linkedList2.add(1);
		linkedList2.addAll(linkedList2);
		System.out.println(linkedList2);
		
//		4. addAll(int index, 또 다른 객체)
		List<Integer> linkedList3 = new LinkedList();
		linkedList3.add(1);
		linkedList3.add(1);
		linkedList3.addAll(1, linkedList1);
		System.out.println(linkedList3);
		
//		5. set(int index, E element) : 특정 방번호의 값을 수정함
		linkedList3.set(1, 5);
//		linkedList3.set(10, 3);		: 없는 방 번호에 값 추가는 불가 : IndexOutOfBoundsException 발생
		System.out.println(linkedList3);
		
//		6. remove(int index) : 해당 방번호의 값 삭제
		linkedList3.remove(4);
		System.out.println(linkedList3);
		
//		7. remove(Object o) : 값으로 삭제
		linkedList3.remove(new Integer(1));
		System.out.println(linkedList3);
		
//		8. clear() : 모두 삭제
		linkedList3.clear();
		System.out.println(linkedList3);
		
//		9. isEmpty() : 값이 비었으면 True, 값이 있으면 False
		System.out.println(linkedList3.isEmpty());
		linkedList3.add(4);
		System.out.println(linkedList3);
		System.out.println(linkedList3.isEmpty());
		
//		10. size() : 값의 갯수
		System.out.println(linkedList3.size());
		linkedList3.add(5);
		linkedList3.add(6);
		System.out.println(linkedList3.size());
		
//		11. get(int index) : 방번호의 값을 출력
		System.out.println(linkedList3.get(0));
		System.out.println(linkedList3.get(1));
		System.out.println(linkedList3.get(2));
		System.out.println();
		
//		12. toArray() : List 타입을 Array 타입으로(배열로) 바꿈
		System.out.println(linkedList3);			// List 일 때는 객체를 출력하면 값을 출력함
		Object[] object = linkedList3.toArray(); 	//기본적으로 toArray() 메소드는 Object 타입으로 리턴이 됨
				// 다운캐스팅 필요
		System.out.println(object);
		System.out.println(Arrays.toString(object));	// 배열은 값을 출력하려면 Arrays.toString 을 사용해야 함
		System.out.println();
		
//		13-1. toArray(T[] t)	: t[] : Integer 로 바로 캐스팅
		Integer[] integer1 = linkedList3.toArray(new Integer[0]); //new Integer[0] 변환할 때 원하는 방 갯수 입력
															// 원래 방크기 보다 작으면 전체를 의미
		System.out.println(Arrays.toString(integer1));
		linkedList1.clear();
		Integer[] integer3 = linkedList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer3));

//		13-2. toArray(T[] t)	: t[] : Integer 로 바로 캐스팅
		Integer[] integer2 = linkedList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
		
		
		
		
		
		
		
	}

}
