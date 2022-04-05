package Chap17.Ex12;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 	treeMap<K, V> 	: ����ÿ� Key�� �������� �������� ���ĵǾ� �����
 					: ��½ÿ� �������� ���ĵǾ� ���
 					: Key�� �Ϲ� ��ü�� ������ �� Comparable<E>, compareTo() �� ������ <- ��ü ���� �� ��������
 										   Comeparator<E> compare()�� ������ <- ��ü �������� ���
 										   
 		Map<K, V> <- SortedMap<K,V> (���� �޼ҵ� ����) <- NavigableMap<K,V> (�˻� �޼ҵ� ����) <- TreeMap<K,V>
 		TreeMap �� ����� ���� Ÿ���� TreeMap ���� �����ؼ�  �˻�, ������ �޼ҵ带 ����� �� �ִ�.
 */


public class TreeMapMethod_1 {

	public static void main(String[] args) {

		// TreeMap<K, V> �� Map<K, V> �޼ҵ带 ��� ����ϸ�
		// �߰��� Sortedmap, NacigableMap �� �߰����� �޼ҵ带 ���
		TreeMap<Integer, String> treeMap = new TreeMap();
		
		for (int i = 20; i>0; i-=2) {
			treeMap.put(i, i+"��° ������");
		}
		System.out.println(treeMap);
		
		//1. firstKey() : ���� ù���� Ű�� ���
		System.out.println(treeMap.firstKey());
		
		//2. firstEntry() : entry = Key + Value : 
		System.out.println(treeMap.firstEntry());
		
		//3. lastKey() : ������ Ű
		System.out.println(treeMap.lastKey());

		//4. lastEntry() : ������ entry
		System.out.println(treeMap.lastEntry());
		
		//5. loswerKey(K key) : �Է� ���� Ű ���� ���� Ű�� �ϳ� ��� 
		System.out.println(treeMap.lowerKey(10));
		
		//6. higherKey(K key) : �Է� ���� Ű ���� ���� Ű�� �ϳ� ���
		System.out.println(treeMap.higherKey(10));
		
		//7. pollFirstEntry() : ù��° Ű�� ���� ������ ����. // ������
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		//8. pollLastEntry() : ������ Ű�� ���� ������ ����.
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		System.out.println();
		
		//9. SoredMap<K,V> headMap(K toKey) : ��ǲ ���� Ű�� head �ʸ� ����
		SortedMap<Integer, String> sMap = treeMap.headMap(8);
		System.out.println(sMap);
		//10. NavigableMap<K,V> headMap(K toKey, boolean inclusive) : ��ǲ ���� Ű�� �����Ͽ� head �ʸ� ����
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
