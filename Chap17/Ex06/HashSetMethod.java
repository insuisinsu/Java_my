package Chap17.Ex06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/*
 	Set
 	. ���ȣ(index) �� ����.
 	. �ߺ��� ���� ���� �� ����.
 	. �������̽�
 	-> HashSet			. �ߺ��� ���� ���� �� ����.
 						. ���� ���� �� ������� �������� ����(index�� ���� ������)
 	
 	-> LinkedHashSet	. �ߺ��� ���� ���� �� ����.
 	  					. ��½� ������� ��µ�(��ũ�� �����ֱ� ������)
 	
 	-> TreeSet			. ���ĵǾ� ���� ����� (ascending - �������� ���� , descending - �������� ����)
 						. ���Ĵ�� ��µ�
 	
 */


public class HashSetMethod {

	public static void main(String[] args) {

		Set<String> hSet1 = new HashSet();		//Set �� Interface �̹Ƿ� Ÿ�����θ� ���� ����

//		1. add(E e) : Set �� ���� �߰�
		hSet1.add("��");
		hSet1.add("��");
		hSet1.add("��");				//�ߺ��� ���� ������� ����
		hSet1.add("��");
		System.out.println(hSet1);
		System.out.println(hSet1.toString()); 	//toString() �� ������ �Ǿ� �ִ�.
		
//		2. addAll (�ٸ� Set ��ü) : ���� ��ü�� �ٸ� Set ��ü �߰�,, �ߺ��� ���� ���ŵ�
		Set<String> hSet2 = new HashSet();
		hSet2.add("��");
		hSet2.add("��");
		hSet2.add("��");
		System.out.println(hSet2);
		hSet2.addAll(hSet1);
		System.out.println(hSet2);
		
//		3. remove(Object o) : ������ ����  <-> List �� �� ��ȣ�� ����
		hSet2.remove("��");
		System.out.println(hSet2);
		
//		4. clear() : ��� ����
		hSet2.clear();
		System.out.println(hSet2);
		
//		5. isEmpty() : ��������� True, ���� ������ false
		System.out.println(hSet2.isEmpty());
		System.out.println(hSet1.isEmpty());
		
//		6. contains(Object o) : ���� Set �� �����ϸ� true, ������ false
		Set<String> hSet3 = new HashSet();
		hSet3.add("��");
		hSet3.add("��");
		hSet3.add("��");
		System.out.println(hSet3);
		System.out.println(hSet3.contains("��"));
		System.out.println(hSet3.contains("��"));
		
//		7. size() : Set�� ���Ե� ���� ����
		System.out.println(hSet3.size());
		
//		8. iterator() : Set �� index �� ������ �ʾ� for �� ��� �Ұ��� enhanced for ���� ��� ����
//						��ȸ��, Set �� ������ ��ȸ�ϸ鼭 ���
//						hasNext() : Set �� ���� �����ϸ� true, �������� ������ false
//						next() : ���� ���� ����ϰ� ���������� �̵�
		Iterator<String> iterator = hSet3.iterator();
		//Ŭ����<E> �߰�    ������ü  = Set ��ü .iterator();
		System.out.println("irerator() �� ����� ��� ===================");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"  ");
		}System.out.println();

		System.out.println("irerator() �� ����� ��� ===================");
		
		for(String k : hSet3) {
			System.out.print(k+"  ");
		}System.out.println();
		
		
//		9. toAttay() : Set �� ������ �迭�� ������. Object Ÿ������ ����, �ٿ� ĳ���� �ʿ���
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		for (int i =0; i<objArray.length; i++) {
			System.out.print(objArray[i]+"  ");
		}System.out.println();
		for (Object k : objArray) {			//Object �迭�� �޾ұ� ������ String �� �ƴ� Object �� ��
											//�ٿ�ĳ���� �ʿ�.. -> 10. toArray(T[] t)
			System.out.print(k+"  ");
		}System.out.println();
		
//		10. toArray(T[] t) : �ٷ� �ٿ� ĳ������ �� �� ���
		String[] strArray1 = hSet3.toArray(new String[0]);	//0 <- �� ũ�� ����, �� ���� ���� ��ü�� �ǹ���
		System.out.println(Arrays.toString(strArray1));
		
//		11. ���� Set�� ������ ��ũ�⸦ ũ�� �����ָ� Null �� ��
		String[] strArray2 = hSet3.toArray(new String[10]);	//10 <- �� ũ�� ����
		System.out.println(Arrays.toString(strArray2));
		System.out.println();System.out.println("======================");
		Set<Integer> intSet1 = new HashSet();
		intSet1.add(30);
		intSet1.add(50);
		intSet1.add(100);
		intSet1.add(10);
		
		//iterator, Enhanced for ����ؼ� ���
		Iterator<Integer> iterator1 = intSet1.iterator();
		while(iterator1.hasNext()) {
			System.out.print(iterator1.next()+" ");
		}System.out.println();System.out.println();
		
		for(Integer k : intSet1) {
			System.out.print(k+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
