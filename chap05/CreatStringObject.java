package chap05;

public class CreatStringObject {

	public static void main(String[] args) {

		//String ��ü ����
		
		//1) new Ű�� ����ؼ� ��ü ���� : Heap ������ ������ ������ ����
		// RAM�� ���� ���� �������� �ʴ´�.
		// new Ű�� ��ü�� �����϶�. (Heap �޸𸮿� ����)
		
		String str1 = new String("�ȳ�");	
		System.out.println(str1);	
		//String�� ��ü�� ������� �� ��ü�� ������ �ƴ� ��ü�� ���� ��µ�.
		//String ���� Ư��
		//������ ��ü ��ü�� ����ϸ� Heap �޸��� ������ ��µ�
		//��ü�� ���� ����� ���� ��ü��.toSting() ������ �ؾ���

		String str11 = new String("�ȳ�");
		//str1 �� str11 �� ������ RAM �� �����. (Heap)
		
		if (str1 == str11) {
			System.out.println(true);
		}else {
			System.out.println(false); 		// flase <-- str1 �� str11 �� �ּҰ� �ٸ��ٴ� �ǹ�
		}
		
		
		//2) ���ͷ��� ���� �ٷ� �Ҵ�.
		//���� ���� ��� RAM �� ���� �����ϰ� ��. (Heap)
		String str2 = "�ȳ��ϼ���.";	
		String str22 = "�ȳ��ϼ���.";
		//str2 �� str22 �� ������ �޸� ������ ������ (Heap)
		
		if (str2 == str22) {
			System.out.println(true);		// true <-- str2 �� str22 �� ���� �ּҶ�� �ǹ�
		}else {
			System.out.println(false);
		}
		
		
		
		
	}

}
