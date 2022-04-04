package Chap17.Ex06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/*
 	Set
 	. 방번호(index) 가 없다.
 	. 중복된 값을 넣을 수 없다.
 	. 인터페이스
 	-> HashSet			. 중복된 값을 넣을 수 없다.
 						. 값을 꺼낼 때 순서대로 꺼내지지 않음(index가 없기 때문에)
 	
 	-> LinkedHashSet	. 중복된 값을 넣을 수 없다.
 	  					. 출력시 순서대로 출력됨(링크로 묶여있기 때문에)
 	
 	-> TreeSet			. 정렬되어 값이 저장됨 (ascending - 오름차순 정렬 , descending - 내림차순 정렬)
 						. 정렬대로 출력됨
 	
 */


public class HashSetMethod {

	public static void main(String[] args) {

		Set<String> hSet1 = new HashSet();		//Set 은 Interface 이므로 타입으로만 지정 가능

//		1. add(E e) : Set 에 값을 추가
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("가");				//중복된 값은 저장되지 않음
		hSet1.add("다");
		System.out.println(hSet1);
		System.out.println(hSet1.toString()); 	//toString() 가 재정의 되어 있다.
		
//		2. addAll (다른 Set 객체) : 기존 객체에 다른 Set 객체 추가,, 중복된 값은 제거됨
		Set<String> hSet2 = new HashSet();
		hSet2.add("나");
		hSet2.add("다");
		hSet2.add("라");
		System.out.println(hSet2);
		hSet2.addAll(hSet1);
		System.out.println(hSet2);
		
//		3. remove(Object o) : 값으로 삭제  <-> List 는 방 번호로 삭제
		hSet2.remove("나");
		System.out.println(hSet2);
		
//		4. clear() : 모두 삭제
		hSet2.clear();
		System.out.println(hSet2);
		
//		5. isEmpty() : 비어있으면 True, 값이 있으면 false
		System.out.println(hSet2.isEmpty());
		System.out.println(hSet1.isEmpty());
		
//		6. contains(Object o) : 값이 Set 에 존재하면 true, 없으면 false
		Set<String> hSet3 = new HashSet();
		hSet3.add("가");
		hSet3.add("나");
		hSet3.add("다");
		System.out.println(hSet3);
		System.out.println(hSet3.contains("나"));
		System.out.println(hSet3.contains("라"));
		
//		7. size() : Set에 포함된 값의 갯수
		System.out.println(hSet3.size());
		
//		8. iterator() : Set 은 index 를 가지지 않아 for 로 출력 불가능 enhanced for 문은 사용 가능
//						순회자, Set 의 값들을 순회하면서 출력
//						hasNext() : Set 의 값이 존재하면 true, 존재하지 않으면 false
//						next() : 현재 값을 출력하고 다음값으로 이동
		Iterator<String> iterator = hSet3.iterator();
		//클래스<E> 추가    참조객체  = Set 객체 .iterator();
		System.out.println("irerator() 를 사용한 출력 ===================");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"  ");
		}System.out.println();

		System.out.println("irerator() 를 사용한 출력 ===================");
		
		for(String k : hSet3) {
			System.out.print(k+"  ");
		}System.out.println();
		
		
//		9. toAttay() : Set 의 값들을 배열로 보낸다. Object 타입으로 리턴, 다운 캐스팅 필요함
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		for (int i =0; i<objArray.length; i++) {
			System.out.print(objArray[i]+"  ");
		}System.out.println();
		for (Object k : objArray) {			//Object 배열로 받았기 때문에 String 이 아닌 Object 이 들어감
											//다운캐스팅 필요.. -> 10. toArray(T[] t)
			System.out.print(k+"  ");
		}System.out.println();
		
//		10. toArray(T[] t) : 바로 다운 캐스팅을 한 후 출력
		String[] strArray1 = hSet3.toArray(new String[0]);	//0 <- 방 크기 지정, 더 작을 경우는 전체를 의미함
		System.out.println(Arrays.toString(strArray1));
		
//		11. 실제 Set의 값보다 방크기를 크게 정해주면 Null 이 들어감
		String[] strArray2 = hSet3.toArray(new String[10]);	//10 <- 방 크기 지정
		System.out.println(Arrays.toString(strArray2));
		System.out.println();System.out.println("======================");
		Set<Integer> intSet1 = new HashSet();
		intSet1.add(30);
		intSet1.add(50);
		intSet1.add(100);
		intSet1.add(10);
		
		//iterator, Enhanced for 사용해서 출력
		Iterator<Integer> iterator1 = intSet1.iterator();
		while(iterator1.hasNext()) {
			System.out.print(iterator1.next()+" ");
		}System.out.println();System.out.println();
		
		for(Integer k : intSet1) {
			System.out.print(k+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
