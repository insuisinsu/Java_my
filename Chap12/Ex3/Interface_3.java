package Chap12.Ex3;

interface A{}
interface B{}

//1. ���� �������̽� ���
//C Ŭ������ A �������̽��� ����(���)
class C implements A {}

//2. ���� �������̽� ���
class D implements A, B {}

//3. Ŭ������ �������̽��� �� ���� ���
// extends �� impements �� ������ ���� �Ұ�
class E extends C implements A, B{}


public class Interface_3 {

	public static void main(String[] args) {

	}

}
