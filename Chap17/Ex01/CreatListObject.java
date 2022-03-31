package Chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreatListObject {

	public static void main(String[] args) {

		//1. List 를 구현한 클래스의 생성자를 사용하여 객체 생성
		
		//List 는 인터페이스 이므로 new 키 뒤에 올 수 없음
		//capacity : 메모리의 방 크기를 할당, (기본값 10)
		//size() : 방에 저장된 값의 갯수
		
		List<Integer> aList1 = new ArrayList();		//capacity = 10
		List<Integer> aList2 = new ArrayList<>(30);	//capacity = 30
		
		List<Integer> aList3 = new Vector();
		List<Integer> aList4 = new Vector(30);
		
		List<Integer> aList5 = new LinkedList();
//		List<Integer> aList6 = new LinkedList(30);  //LinkedList 는 저장공간 할당불가
		
		//2. Arrays 클래스의 정적 메소드를 이용하는 방법

		//	데이터 크기를 바꿀 수 없음
		// -> 요일, 계절, 하루 24시간 등 고정되어 있는 값을 저장할 때 사용함
		
		List<Integer> aList7 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		List<String> aList8 = Arrays.asList("월", "화", "수", "목", "금", "토", "일");
		aList7.set(1, 7);	//set() : 기존의 값을 수정 or 추가할 때 사용
//		aList7.add(1); 		//add() : 마지막에 값을 추가할 때 사용// Arrays.asList 는 방크기가 고정이라 추가하면 에러남
		System.out.println(aList7);
		
		aList8.set(0, "일");
		System.out.println(aList8);
		
	}

}
