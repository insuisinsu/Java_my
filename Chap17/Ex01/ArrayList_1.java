package Chap17.Ex01;

//java.lang ��Ű���� Ŭ�������� import ���� �ʾƵ� ��� ����
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 	�÷���	: ������ �ڷ����� ����, �� ũ�� �������� ��ȭ
 	�迭 	: ������ �ڷ����� ����, �� ũ�� ������
 			  �迭 ������ �� ũ�� �����Ǹ� �����Ұ� 
 
 	
 	
 	List<E> : ���ʸ� �������̽� -> �پ��� ������ Ÿ���� ��� ����
 			: �ε����� ������ ����. ( ���ȣ )
 			: ���� ũ��� �������� ��ȭ��
 		- ArrayList<E>	: �̱� ������ ȯ�濡�� ���
 						  �˻��� ��������(index�� �ֱ� ������),
 						  �� �߰� �Ǵ� ������ ����
 		- Vector<E>		: ��Ƽ ������ ȯ�濡�� ���
 						  ��� �޼ҵ尡 ����ȭ �Ǿ�����
 		- LinkedList<E>	: �˻��� ������ ���� �߰��ϰų� ������ ������
 */

public class ArrayList_1 {

	public static void main(String[] args) {

		//1. �迭
		String[] array = new String[] {"��", "��", "��", "��", "��", "��", "��"};
		System.out.println(array.length);
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);

		// Arrays.toString(�迭����)
		System.out.println(Arrays.toString(array));
		// For
		for(int i=0; i < array.length; i++) {
			if(i == array.length -1) {			// ������ ���ȣ������ 
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
		
		//2. List : �������̽�->��ü���� �Ұ�, Ÿ������ ���� ����
		List<String> aList = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList();
	
		//List ���� ���� ���� ��� : aList.size();  // �迭������ .length();  
		System.out.println(aList.size());
	
		//List �� �� �Ҵ��ϱ� : aList.add(); --> ���� �������� �� �߰�
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("��");
		aList.add("ī");
		aList.add("Ÿ");
		aList.add("��");

		//List �� ����� �������� ���� ���ϱ� = List ���� ���� ���� ���
		System.out.println(aList.size());
		
		//List �� ����� �� ���� : aList.remove("������ ����")
		aList.remove(5);
		aList.remove("��");
		aList.remove("��");
		aList.remove("ī");
		System.out.println(aList.size());
		
		//List ���
		
		//List �� for ��� ���� <- index �� ������ �ֱ� ����
		// .size() �� ���� ���� ���   <-> .length
		// .get() ���� �� ���      <-> array[i]
		for(int i =0; i < aList.size(); i++) {
			System.out.print(aList.get(i)+", ");
		}System.out.println();

		//EnHanced For
		for(String k : aList) {
			System.out.print(k+", ");
		}System.out.println();
		//��ü�� toString()�� ȣ���ؼ� ���
		System.out.println(aList);	//List �� toString �޼ҵ尡 ������ �Ǿ�����->�ٷ� ��� ����
		System.out.println(aList.toString()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
