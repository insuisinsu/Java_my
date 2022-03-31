package Chap17.Ex03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListMethod_1 {

	public static void main(String[] args) {

		/*
		 	List �� �޼ҵ� 13��
		 	- ArrayList, Vector, LinkedList ������ ����
		
		 1. add(E element)				: �����ٰ� �� �߰�   
		 2. add(int index, E element)	: �ش� ���ȣ�� �� �߰�
		 3. addAll 						: �� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�  
		 4. addAll(int index, �ٸ� ��ü)	: �ش� ���ȣ�� �ٸ� ��ü �����ֱ�
		 5. set(int index, E element) 	: Ư�� ���ȣ�� ���� ������
		 6. remove(int index) 			: �ش� ���ȣ�� �� ����
		 7. remove(Object o) 			: ������ ����
		 8. clear() 					: ��� ����
		 9. isEmpty() 					: ���� ������� True, ���� ������ False
		 10. size() 					: ���� ����
		 11. get(int index) 			: ���ȣ�� ���� ���
		 12. toArray()					: List Ÿ���� Array Ÿ������(�迭��) �ٲ�
		 13-1. toArray(T[] t)	: t[]	: Integer �� �ٷ� ĳ����
		 									new Integer[0] ��ȯ�� �� ���ϴ� �� ���� �Է�,
		 									���� ��ũ�� ���� ������ ��ü�� �ǹ�
		 13-2. toArray(T[] t)	: t[]	: Integer �� �ٷ� ĳ����
		 
		 */
		
		List<Integer> linkedList1 = new LinkedList<Integer>();
		
//		1. add(E element)		: �����ٰ� �� �߰�
		linkedList1.add(3);
		linkedList1.add(4);
		linkedList1.add(5);
		System.out.println(linkedList1);
		System.out.println(linkedList1.size());
		
//		2. add(int index, E element)
		linkedList1.add(1, 6);					// 1 �� �濡 6�� �߰�
		System.out.println(linkedList1);
		System.out.println(linkedList1.size());
		
//		3. addAll : �� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�
		List<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.add(1);
		linkedList2.add(1);
		linkedList2.addAll(linkedList2);
		System.out.println(linkedList2);
		
//		4. addAll(int index, �� �ٸ� ��ü)
		List<Integer> linkedList3 = new LinkedList();
		linkedList3.add(1);
		linkedList3.add(1);
		linkedList3.addAll(1, linkedList1);
		System.out.println(linkedList3);
		
//		5. set(int index, E element) : Ư�� ���ȣ�� ���� ������
		linkedList3.set(1, 5);
//		linkedList3.set(10, 3);		: ���� �� ��ȣ�� �� �߰��� �Ұ� : IndexOutOfBoundsException �߻�
		System.out.println(linkedList3);
		
//		6. remove(int index) : �ش� ���ȣ�� �� ����
		linkedList3.remove(4);
		System.out.println(linkedList3);
		
//		7. remove(Object o) : ������ ����
		linkedList3.remove(new Integer(1));
		System.out.println(linkedList3);
		
//		8. clear() : ��� ����
		linkedList3.clear();
		System.out.println(linkedList3);
		
//		9. isEmpty() : ���� ������� True, ���� ������ False
		System.out.println(linkedList3.isEmpty());
		linkedList3.add(4);
		System.out.println(linkedList3);
		System.out.println(linkedList3.isEmpty());
		
//		10. size() : ���� ����
		System.out.println(linkedList3.size());
		linkedList3.add(5);
		linkedList3.add(6);
		System.out.println(linkedList3.size());
		
//		11. get(int index) : ���ȣ�� ���� ���
		System.out.println(linkedList3.get(0));
		System.out.println(linkedList3.get(1));
		System.out.println(linkedList3.get(2));
		System.out.println();
		
//		12. toArray() : List Ÿ���� Array Ÿ������(�迭��) �ٲ�
		System.out.println(linkedList3);			// List �� ���� ��ü�� ����ϸ� ���� �����
		Object[] object = linkedList3.toArray(); 	//�⺻������ toArray() �޼ҵ�� Object Ÿ������ ������ ��
				// �ٿ�ĳ���� �ʿ�
		System.out.println(object);
		System.out.println(Arrays.toString(object));	// �迭�� ���� ����Ϸ��� Arrays.toString �� ����ؾ� ��
		System.out.println();
		
//		13-1. toArray(T[] t)	: t[] : Integer �� �ٷ� ĳ����
		Integer[] integer1 = linkedList3.toArray(new Integer[0]); //new Integer[0] ��ȯ�� �� ���ϴ� �� ���� �Է�
															// ���� ��ũ�� ���� ������ ��ü�� �ǹ�
		System.out.println(Arrays.toString(integer1));
		linkedList1.clear();
		Integer[] integer3 = linkedList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer3));

//		13-2. toArray(T[] t)	: t[] : Integer �� �ٷ� ĳ����
		Integer[] integer2 = linkedList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
		
		
		
		
		
		
		
	}

}
