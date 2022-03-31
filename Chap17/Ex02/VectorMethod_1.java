package Chap17.Ex02;

//Vector : ArrayList �� ��� �޼ҵ带 �����ϰ� ���
// �ٸ�, Vector �� ��� �޼ҵ尡 ����ȭ ó���Ǿ� �ִ�

//�̱� ������ ȯ�� : ArrayList
//��Ƽ ������ ȯ�� : Vector


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod_1 {

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
		
		List<Integer> vector1 = new Vector<Integer>();
		
//		1. add(E element)		: �����ٰ� �� �߰�
		vector1.add(3);
		vector1.add(4);
		vector1.add(5);
		System.out.println(vector1);
		System.out.println(vector1.size());
		
//		2. add(int index, E element)
		vector1.add(1, 6);					// 1 �� �濡 6�� �߰�
		System.out.println(vector1);
		System.out.println(vector1.size());
		
//		3. addAll : �� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�
		List<Integer> vector2 = new Vector<Integer>();
		vector2.add(1);
		vector2.add(1);
		vector2.addAll(vector1);
		System.out.println(vector2);
		
//		4. addAll(int index, �� �ٸ� ��ü)
		List<Integer> vector3 = new Vector();
		vector3.add(1);
		vector3.add(1);
		vector3.addAll(1, vector1);
		System.out.println(vector3);
		
//		5. set(int index, E element) : Ư�� ���ȣ�� ���� ������
		vector3.set(1, 5);
//		vector3.set(10, 3);		: ���� �� ��ȣ�� �� �߰��� �Ұ� : IndexOutOfBoundsException �߻�
		System.out.println(vector3);
		
//		6. remove(int index) : �ش� ���ȣ�� �� ����
		vector3.remove(4);
		System.out.println(vector3);
		
//		7. remove(Object o) : ������ ����
		vector3.remove(new Integer(1));
		System.out.println(vector3);
		
//		8. clear() : ��� ����
		vector3.clear();
		System.out.println(vector3);
		
//		9. isEmpty() : ���� ������� True, ���� ������ False
		System.out.println(vector3.isEmpty());
		vector3.add(4);
		System.out.println(vector3);
		System.out.println(vector3.isEmpty());
		
//		10. size() : ���� ����
		System.out.println(vector3.size());
		vector3.add(5);
		vector3.add(6);
		System.out.println(vector3.size());
		
//		11. get(int index) : ���ȣ�� ���� ���
		System.out.println(vector3.get(0));
		System.out.println(vector3.get(1));
		System.out.println(vector3.get(2));
		System.out.println();
		
//		12. toArray() : List Ÿ���� Array Ÿ������(�迭��) �ٲ�
		System.out.println(vector3);			// List �� ���� ��ü�� ����ϸ� ���� �����
		Object[] object = vector3.toArray(); 	//�⺻������ toArray() �޼ҵ�� Object Ÿ������ ������ ��
				// �ٿ�ĳ���� �ʿ�
		System.out.println(object);
		System.out.println(Arrays.toString(object));	// �迭�� ���� ����Ϸ��� Arrays.toString �� ����ؾ� ��
		System.out.println();
		
//		13-1. toArray(T[] t)	: t[] : Integer �� �ٷ� ĳ����
		Integer[] integer1 = vector3.toArray(new Integer[0]); //new Integer[0] ��ȯ�� �� ���ϴ� �� ���� �Է�
															// ���� ��ũ�� ���� ������ ��ü�� �ǹ�
		System.out.println(Arrays.toString(integer1));
		vector1.clear();
		Integer[] integer3 = vector3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer3));

//		13-2. toArray(T[] t)	: t[] : Integer �� �ٷ� ĳ����
		Integer[] integer2 = vector3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
		
		
		
		
		
		
		
	}

}
