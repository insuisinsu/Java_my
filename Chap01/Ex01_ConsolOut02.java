package Chap01;

public class Ex01_ConsolOut02 {

	public static void main(String[] args) {
		System.out.printf("%d\n", 30);
		// �������, ����, ����   %d �� �ڿ� �ִ� ���ڸ� �ҷ���
		// %d �� �������� ���ڷ� ���� �� ��� (10����)
		// �������� %d �� �ڿ��ִ� 30�� �޾Ƽ�  30/n ���� ��µ�
		System.out.printf("���� ���̴� %d �Դϴ�\n", 30);
		
		System.out.printf("%o\n", 10); //%o �� 8������ ���ڰ����� ���� ��
		System.out.printf("%x\n", 10); //%x �� 16������ ���ڰ����� ���� ��
		System.out.printf("%s\n", "���"); //%s �� ���ڿ��� ���ڰ����� ���� ��
		System.out.printf("%f\n", 5.983); //%f �� �Ǽ����� ���ڰ����� ���� ��
		System.out.printf("%4.2f\n", 5.8); //%4.2f �� ��ü 4�ڸ�, �Ҽ��� ���� 2�ڸ��� ���ڰ����� ���� ��
						// $n.mf �� ��ü n �ڸ�, �Ҽ��� ���� m �ڸ��� ���ڰ����� ���� ��
		System.out.printf("%d �� %4.2f", 10, 5.8); //%4.2f �� ��ü 4�ڸ�, �Ҽ��� ���� 2�ڸ��� ���ڰ����� ���� ��
		
	}

}
