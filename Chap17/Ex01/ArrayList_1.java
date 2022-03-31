package Chap17.Ex01;

//java.lang 패키지의 클래스들은 import 하지 않아도 사용 가능
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 	컬렉션	: 동일한 자료형을 저장, 방 크기 동적으로 변화
 	배열 	: 동일한 자료형을 저장, 방 크기 고정됨
 			  배열 생성시 방 크기 지정되며 수정불가 
 
 	
 	
 	List<E> : 제너릭 인터페이스 -> 다양한 데이터 타입을 사용 가능
 			: 인덱스를 가지고 있음. ( 방번호 )
 			: 방의 크기는 동적으로 변화함
 		- ArrayList<E>	: 싱글 쓰레드 환경에서 사용
 						  검색은 빠르지만(index가 있기 때문에),
 						  값 추가 또는 삭제시 느림
 		- Vector<E>		: 멀티 쓰레드 환경에서 사용
 						  모든 메소드가 동기화 되어있음
 		- LinkedList<E>	: 검색은 느리나 값을 추가하거나 삭제시 빠르다
 */

public class ArrayList_1 {

	public static void main(String[] args) {

		//1. 배열
		String[] array = new String[] {"가", "나", "다", "라", "마", "바", "사"};
		System.out.println(array.length);
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);

		// Arrays.toString(배열변수)
		System.out.println(Arrays.toString(array));
		// For
		for(int i=0; i < array.length; i++) {
			if(i == array.length -1) {			// 마지막 방번호에서는 
				System.out.print(array[i]+"]");
			}else if(i == 0){
				System.out.print("["+array[i]+", ");
			}
			else {
				System.out.print(array[i]+", ");	
			}
		}System.out.println();
		//enhanced For
		for (String k : array) {
			System.out.print(k + ", ");
		}System.out.println(); System.out.println();
		
		//2. List : 인터페이스->객체생성 불가, 타입으로 지정 가능
		List<String> aList = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList();
	
		//List 에서 방의 갯수 출력 : aList.size();  // 배열에서는 .length();  
		System.out.println(aList.size());
	
		//List 에 값 할당하기 : aList.add(); --> 제일 마지막에 값 추가
		aList.add("가");
		aList.add("나");
		aList.add("다");
		aList.add("라");
		aList.add("마");
		aList.add("바");
		aList.add("사");
		aList.add("아");
		aList.add("자");
		aList.add("차");
		aList.add("카");
		aList.add("타");
		aList.add("파");

		//List 에 저장된 데이터의 갯수 구하기 = List 에서 방의 갯수 출력
		System.out.println(aList.size());
		
		//List 에 저장된 값 제거 : aList.remove("삭제할 내용")
		aList.remove(5);
		aList.remove("다");
		aList.remove("바");
		aList.remove("카");
		System.out.println(aList.size());
		
		//List 출력
		
		//List 는 for 사용 가능 <- index 를 가지고 있기 때문
		// .size() 로 방의 갯수 출력   <-> .length
		// .get() 으로 값 출력      <-> array[i]
		for(int i =0; i < aList.size(); i++) {
			System.out.print(aList.get(i)+", ");
		}System.out.println();

		//EnHanced For
		for(String k : aList) {
			System.out.print(k+", ");
		}System.out.println();
		//객체의 toString()을 호출해서 출력
		System.out.println(aList);	//List 는 toString 메소드가 재정의 되어있음->바로 출력 가능
		System.out.println(aList.toString()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
