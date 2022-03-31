package Chap17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 	ArrayList vs. LikedLiset
 	
 	ArrayList
 		. ���� index ���� ������ �־� �˻��ӵ��� ����
 		. �߰��� �� �߰�/���� �� ���ϰ� ���� �ɸ�(�ϳ��� �� ����ų� �о�ߵ�)
	LinkedList
		. ������ ���� �յ��� ������� ������ ����
		. �˻��ÿ� index �� �Ҵ��ϱ� ������ �˻��ӵ��� ����
		. �߰��� �� �߰�/���� �� ���ϰ� ����(�ٷ� ���� ��ġ������ �����ϸ� ��, �ٸ� ���� ������ ���� ����)
  
 */
public class ArrayListVSLinkedList {

	public static void main(String[] args) {

//		1. ������ �߰� �ð� ��				���� 250�� ���� ���̳��ٰ� ��
//		ArrayList	 405,681,700ns
//		LinkedList 	   4,355,200ns	�� �ξ� ����
		
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0 , endTime=0;
		
//		1-1 ArrayList �� ������ �߰� �ð�
		startTime = System.nanoTime();		//ù ���ڰ� �빮�� = static // java.lang Ŭ������ �޼ҵ�� import ���ʿ�
		for (int i =0; i < 100000; i++) {
			aList.add(0, i);				// 0��° �濡�� i �� �߰��ؼ� �Ź� �ڷ� �и��鼭 ���� �߰��ǵ��� ��
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �� ������ �߰� �ð� : "+(endTime - startTime));
//		405681700ns
		
		
//		1-2 LinkedList �� ������ �߰� �ð�
		startTime = System.nanoTime();
		for (int i =0; i < 100000; i++) {
			linkedList.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �� ������ �߰� �ð� : "+(endTime - startTime));
//		4355200ns 		
		
//		2. ������ �˻� �ð� ��
		
//		2-1 ArrayList �� ������ �˻� �ð�
//		ArrayList 	   1,067,900	�� �ξ� ����
//		LinkedList 3,858,837,500
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �� ������ �˻� �ð� : "+(endTime - startTime));
		
//		2-2 LinkedList �� ������ �˻� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �� ������ �˻� �ð� : "+(endTime - startTime));
		
//		3. ������ �輼 �ð� ��
//		ArrayList 	396,736,200
//		LinkedList    3,359,000 	�� �ξ� ����
		
//		3-1  ArrayList �� ������ ���� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �� ������ ���� �ð� : "+(endTime - startTime));
		
//		3-2  LinkedList �� ������ ���� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �� ������ ���� �ð� : "+(endTime - startTime));
		
		
		
		
	}

}
