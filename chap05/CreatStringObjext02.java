package chap05;
import java.util.Arrays;
public class CreatStringObjext02 {

	public static void main(String[] args) {

		//��ü�� ���� ������ �� ���� ���� ���� ��ȭ
		//1. ���ڿ� ���� (��ü ���� ������ ������ �Ұ� --> ���ο� ��ü�� ������)
		
		String str1 = new String("�ȳ�");
		String str2 = str1;		//���� �ڷ����� ���� Stack �� �ּҰ� ����
		
		str1 = "�ȳ��ϼ���.";		//������ �޸� ������ "�ȳ��ϼ���'�� ������.
		
		System.out.println(str1);
		System.out.println(str2);
		
		//�迭�� ���
		//���� �����ϸ� ������.
		int[] arr1 = new int[] { 3, 4, 5};
		int[] arr2 = arr1;
		
		arr1[0] = 6;
		arr1[1] = 7;
		arr1[2] = 8;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
