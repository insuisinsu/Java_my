package Chap19.Ex01;

public class System_getProperty {

	public static void main(String[] args) {

		//System.getProperty() �޼ҵ��� ������ ������
		
		//���� �۾� ���丮 ���
		System.out.println(System.getProperty("user.dir"));
		
		//�ڹ� ���� ���
		System.out.println(System.getProperty("java.version"));
		
		//
		System.out.println(System.getProperty("java.vendor"));
		
		//
		System.out.println(System.getProperty("java.vendor.url"));
		
		//�ڹ� ��ġ Ȩ����
		System.out.println(System.getProperty("java.home"));
		
		//
		System.out.println(System.getProperty("java.class.version"));
		
		//
		System.out.println(System.getProperty("java.class.path"));
		
		//�α׿��� ����
		System.out.println(System.getProperty("user.name"));
		
		//�α׿��� ������ Ȩ����
		System.out.println(System.getProperty("user.home"));
		
		//�ü�� ����
		System.out.println(System.getProperty("os.name"));
		
		//OS ��Ű��ó
		System.out.println(System.getProperty("os.arch"));
		
		//OS ����
		System.out.println(System.getProperty("os.version"));
		
		//���� ������
		System.out.println(System.getProperty("file.separator"));
		
		//path ������
		System.out.println(System.getProperty("path.separator"));
		
		//�� ������
		System.out.println(System.getProperty("line.separator"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
