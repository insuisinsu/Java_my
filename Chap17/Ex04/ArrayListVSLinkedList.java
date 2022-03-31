package Chap17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 	ArrayList vs. LikedLiset
 	
 	ArrayList
 		. 값에 index 값을 가지고 있어 검색속도가 빠름
 		. 중간에 값 추가/삭제 시 부하가 많이 걸림(하나씩 다 땡기거나 밀어야됨)
	LinkedList
		. 각각의 값은 앞뒤의 연결고리만 가지고 있음
		. 검색시에 index 를 할당하기 때문에 검색속도가 느림
		. 중간에 값 추가/삭제 시 부하가 적음(바로 옆의 위치정보만 수정하면 됨, 다른 값에 영향을 주지 않음)
  
 */
public class ArrayListVSLinkedList {

	public static void main(String[] args) {

//		1. 데이터 추가 시간 비교				보통 250배 정도 차이난다고 함
//		ArrayList	 405,681,700ns
//		LinkedList 	   4,355,200ns	가 훨씬 빠름
		
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0 , endTime=0;
		
//		1-1 ArrayList 의 데이터 추가 시간
		startTime = System.nanoTime();		//첫 글자가 대문자 = static // java.lang 클래스의 메소드라 import 불필요
		for (int i =0; i < 100000; i++) {
			aList.add(0, i);				// 0번째 방에만 i 를 추가해서 매번 뒤로 밀리면서 값이 추가되도록 함
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 의 데이터 추가 시간 : "+(endTime - startTime));
//		405681700ns
		
		
//		1-2 LinkedList 의 데이터 추가 시간
		startTime = System.nanoTime();
		for (int i =0; i < 100000; i++) {
			linkedList.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 의 데이터 추가 시간 : "+(endTime - startTime));
//		4355200ns 		
		
//		2. 데이터 검색 시간 비교
		
//		2-1 ArrayList 의 데이터 검색 시간
//		ArrayList 	   1,067,900	가 훨씬 빠름
//		LinkedList 3,858,837,500
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 의 데이터 검색 시간 : "+(endTime - startTime));
		
//		2-2 LinkedList 의 데이터 검색 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 의 데이터 검색 시간 : "+(endTime - startTime));
		
//		3. 데이터 삭세 시간 비교
//		ArrayList 	396,736,200
//		LinkedList    3,359,000 	가 훨씬 빠름
		
//		3-1  ArrayList 의 데이터 삭제 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 의 데이터 삭제 시간 : "+(endTime - startTime));
		
//		3-2  LinkedList 의 데이터 삭제 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 의 데이터 삭제 시간 : "+(endTime - startTime));
		
		
		
		
	}

}
