package Chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod_1 {

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
		
		List<Integer> aList1 = new ArrayList<Integer>();
		
//		1. add(E element)		: �����ٰ� �� �߰�
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1);
		System.out.println(aList1.size());
		
//		2. add(int index, E element)
		aList1.add(1, 6);					// 1 �� �濡 6�� �߰�
		System.out.println(aList1);
		System.out.println(aList1.size());
		
//		3. addAll : �� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�
		List<Integer> aList2 = new ArrayList<Integer>();
		aList2.add(1);
		aList2.add(1);
		aList2.addAll(aList1);
		System.out.println(aList2);
		
//		4. addAll(int index, �� �ٸ� ��ü)
		List<Integer> aList3 = new ArrayList();
		aList3.add(1);
		aList3.add(1);
		aList3.addAll(1, aList1);
		System.out.println(aList3);
		
//		5. set(int index, E element) : Ư�� ���ȣ�� ���� ������
		aList3.set(1, 5);
//		aList3.set(10, 3);		: ���� �� ��ȣ�� �� �߰��� �Ұ� : IndexOutOfBoundsException �߻�
		System.out.println(aList3);
		
//		6. remove(int index) : �ش� ���ȣ�� �� ����
		aList3.remove(4);
		System.out.println(aList3);
		
//		7. remove(Object o) : ������ ����
		aList3.remove(new Integer(1));
		System.out.println(aList3);
		
//		8. clear() : ��� ����
		aList3.clear();
		System.out.println(aList3);
		
//		9. isEmpty() : ���� ������� True, ���� ������ False
		System.out.println(aList3.isEmpty());
		aList3.add(4);
		System.out.println(aList3);
		System.out.println(aList3.isEmpty());
		
//		10. size() : ���� ����
		System.out.println(aList3.size());
		aList3.add(5);
		aList3.add(6);
		System.out.println(aList3.size());
		
//		11. get(int index) : ���ȣ�� ���� ���
		System.out.println(aList3.get(0));
		System.out.println(aList3.get(1));
		System.out.println(aList3.get(2));
		System.out.println();
		
//		12. toArray() : List Ÿ���� Array Ÿ������(�迭��) �ٲ�
		System.out.println(aList3);			// List �� ���� ��ü�� ����ϸ� ���� �����
		Object[] object = aList3.toArray(); 	//�⺻������ toArray() �޼ҵ�� Object Ÿ������ ������ ��
				// �ٿ�ĳ���� �ʿ�
		System.out.println(object);
		System.out.println(Arrays.toString(object));	// �迭�� ���� ����Ϸ��� Arrays.toString �� ����ؾ� ��
		System.out.println();
		
//		13-1. toArray(T[] t)	: t[] : Integer �� �ٷ� ĳ����
		Integer[] integer1 = aList3.toArray(new Integer[0]); //new Integer[0] ��ȯ�� �� ���ϴ� �� ���� �Է�
															// ���� ��ũ�� ���� ������ ��ü�� �ǹ�
		System.out.println(Arrays.toString(integer1));
		aList1.clear();
		Integer[] integer3 = aList1.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer3));

//		13-2. toArray(T[] t)	: t[] : Integer �� �ٷ� ĳ����
		Integer[] integer2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
		
		
		
		
		
		
		
	}

}
