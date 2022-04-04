package Chap17.EX08;

import java.util.TreeSet;

//TreeSet �� ���� : 1. �ߺ� ������� �ʴ´�.(Set)  2. �������� ���ĵǾ� �Է�, 3. ���ĵǾ� ��� (��������), 4. �˻������ ���
				// 5. Ư�������� ���� ����, 6. asc(�������� ����), desc (�������� ����)

//TreeSet �� �Ϲ� ��ü�� ������ ���, Ư�� �ʵ带 ũ�� �� ���� �ʵ尡 �����ؾ� �Ѵ�. 
	//1. Comparable<E> �������̽��� compareTo() �޼ҵ� ������: TreeSet�� �Ϲ� ��ü�� �����Ҷ� �Ϲ� ��ü�� Ư�� �ʵ带 ������ �ؾ� �Ѵ�.
	//2. Comparator<E> �������̽� compare() �޼ҵ带 ������ ��. 
	//3. �͸� ���� ��ü�� ����ؼ� ó�� �ϴ� ���. 


class MyClass{
	int data1; 
	int data2; 
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2; 
	}
}

//Comparable<E> �������̽��� ������ Ŭ���� ����
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1; 			// <<== �ʵ带 �񱳱������� ���� , compareTo() ������ 
	int data2; 
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2; 
	}
	@Override
	public int compareTo(MyComparableClass o) {  //��ü�� ũ��� ������ �����ϴ� �޼ҵ�, <<TreeSet���� ���>> (����, 0, ���)
									//�������� ó�� ��� 
		
		if (this.data1 < o.data1) {				//this.data1 ���� ���� ���� ��� : 1 (����)
			return -1; 
		}else if (this.data1 == o.data1) {		//this.data1 ���� ���� ���� ��� : 0
			return 0 ; 
		}else {									//this.data1 ���� ���� Ŭ ��� : -1 (���)
			return 1; 
		}
		
	}
	
	@Override
	public String toString() {
		
		return data1 + " " + data2;
	}
	
	
	
}





public class TreeSetMethod_2 {
	public static void main(String[] args) {
		// wrapper Ŭ������ comparable<E> �������̽��� compareTo() �޼ҵ带 ������ �ϰ� �ִ�. 
			//wrapperŬ������ ���� TreeSet�� ������ ���ĵǾ� ����. 
		
		//1. Integer wrapper Ŭ���� �� ũ�� ��. 
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>(); 
		Integer intValue1 = new Integer(20);  //ū�� 
		//Integer intValue3 = 3; 
		Integer intvalue2 = new Integer(10);  //������
		
		treeSet1.add(intValue1); 
		treeSet1.add(intvalue2); 
		
		System.out.println(treeSet1);   //�������� ���� ���.
		
		//2. String wrapper Ŭ������ ũ�� ��. 
		TreeSet<String> treeSet2 = new TreeSet<String>(); 
		String str1 = new String("����");    //������
		//String str1 = "����" ; 
		String str2 = new String("�ٶ�"); 	//ū��
		
		treeSet2.add(str1);		//treeSet2.add()�� ����ؼ� ��ü�� ������ ��� ���� ũ�⸦ ���ϴ� �ʵ尡 ���� �Ǿ� �־�� �Ѵ�. 
		treeSet2.add(str2); 	//  Comparable<E> �������̽��� compareTo() �޼ҵ尡 ������ �Ǿ�� �Ѵ�. 
		
		System.out.println(treeSet2);
		
		//3. MyClass�� TreeSet�� ������ �ɱ�? , Comparable<E> �������̽��� compareTo() �޼ҵ尡 ������ �Ǿ�� TreeSet �÷��ǿ� ���� ���� 
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>(); 
//		MyClass myClass1 = new MyClass(2,5); 
//		MyClass myClass2 = new MyClass(3,3); 
//		
//		treeSet3.add(myClass1);   //TreeSet���� Comparable<E> �������̽��� compareTo() �޼ҵ带 �������� Ŭ������ ������ �ִ�. 
//		treeSet3.add(myClass2);    //<<<<����� ���� �߻���. >>>>
//		
//		System.out.println(treeSet3);
		
		
		//4. MyComparableClass ��ü ũ�� ��. 
		TreeSet<MyComparableClass> treeSet4 = new TreeSet(); 
		
		MyComparableClass m1 = new MyComparableClass(2, 5); 
		MyComparableClass m2 = new MyComparableClass(5, 3); 
		MyComparableClass m3 = new MyComparableClass(4, 3);
		
		treeSet4.add(m1); 
		treeSet4.add(m2); 
		treeSet4.add(m3);
		
		System.out.println(treeSet4);
		
		
		
		

		
		
		
	}
}
