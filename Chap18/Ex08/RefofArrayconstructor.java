package Chap18.Ex08;

//�迭�� �����ڿ� ����

interface A{
	int[] abc (int len);
}

public class RefofArrayconstructor {

	public static void main(String[] args) {

		//�迭�� ������ ����
		//1. �͸� �̳� Ŭ����
		A a1 = new A() {				//�迭 ����   int[] arr = new int[���ǰ���];
			public int[] abc(int len) {		//������ len ���� �޾Ƽ�
				return new int[len];		//������ �޾Ƽ� �迭�� �� ũ��� ���� ������
			}
		};
		
		//2. ���ٽ�
		A a2 = (int len) -> {return new int[len];};
		
		//3. �迭�� ������ ���� ǥ����
		A a3 = int[] :: new;

		//�迭 ���� ����
		// int[] arr1 = new int[3];				//�� 3�� ¥�� �迭 ����
		// int[] arr2 = new int[] {1, 2, 3}; 	//����� ���ÿ� �� �Ҵ� + �� ũ�� ����
		// int[] arr3 = {1, 2, 3};
		
		
		int[] array1 = a1.abc(3);
		System.out.println(array1.length);
		int[] array2 = a2.abc(4);
		System.out.println(array2.length);
		int[] array3 = a3.abc(5);
		System.out.println(array3.length);
		
		
		
		
		
		
		
		
	}

}
