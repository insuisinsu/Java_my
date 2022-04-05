package Chap17.Ex12;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 	treeMap<K, V> 	: 저장시에 Key를 기준으로 오름차순 정렬되어 저장됨
 					: 출력시에 오름차순 정렬되어 출력
 					: Key에 일반 객체를 저장할 때 Comparable<E>, compareTo() 를 재정의 <- 객체 수정 및 재컴파일
 										   Comeparator<E> compare()를 재정의 <- 객체 수정없이 사용
 										   
 		Map<K, V> <- SortedMap<K,V> (정렬 메소드 정의) <- NavigableMap<K,V> (검색 메소드 정의) <- TreeMap<K,V>
 		TreeMap 을 사용할 때는 타입을 TreeMap 으로 지정해서  검색, 정력의 메소드를 사용할 수 있다.
 */


public class TreeMapMethod_1 {

	public static void main(String[] args) {

		// TreeMap<K, V> 은 Map<K, V> 메소드를 모두 사용하며
		// 추가로 Sortedmap, NacigableMap 의 추가적인 메소드를 사용
		TreeMap<Integer, String> treeMap = new TreeMap();
		
		for (int i = 20; i>0; i-=2) {
			treeMap.put(i, i+"번째 데이터");
		}
		System.out.println(treeMap);
		
		//1. firstKey() : 제일 첫번재 키를 출력
		System.out.println(treeMap.firstKey());
		
		//2. firstEntry() : entry = Key + Value : 
		System.out.println(treeMap.firstEntry());
		
		//3. lastKey() : 마지막 키
		System.out.println(treeMap.lastKey());

		//4. lastEntry() : 마지막 entry
		System.out.println(treeMap.lastEntry());
		
		//5. loswerKey(K key) : 입력 받은 키 보다 낮은 키값 하나 출력 
		System.out.println(treeMap.lowerKey(10));
		
		//6. higherKey(K key) : 입력 받은 키 보다 높은 키값 하나 출력
		System.out.println(treeMap.higherKey(10));
		
		//7. pollFirstEntry() : 첫번째 키와 값을 끄집어 낸다. // 없어짐
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		//8. pollLastEntry() : 마지막 키의 값을 끄집어 낸다.
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		System.out.println();
		
		//9. SoredMap<K,V> headMap(K toKey) : 인풋 받은 키의 head 쪽만 저장
		SortedMap<Integer, String> sMap = treeMap.headMap(8);
		System.out.println(sMap);
		//10. NavigableMap<K,V> headMap(K toKey, boolean inclusive) : 인풋 받은 키를 포함하여 head 쪽만 저장
		NavigableMap<Integer, String> nMap = treeMap.headMap(8, true);
		System.out.println(nMap);
		NavigableMap<Integer, String> nMap4 = treeMap.headMap(8, false);
		System.out.println(nMap4);
		
		//11. SortedMap<K,V> tailMap(K toKdy)
		SortedMap<Integer, String> sMap2 = treeMap.tailMap(14);
		System.out.println(sMap2);
		
		//12. NavigableMap<K, V> tailMap( K toKey, boolean inclusive)
		NavigableMap<Integer, String> nMap2 = treeMap.tailMap(14, true);
		System.out.println(nMap2);
		NavigableMap<Integer, String> nMap3 = treeMap.tailMap(14, false);
		System.out.println(nMap3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
