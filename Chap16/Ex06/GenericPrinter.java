package Chap16.Ex06;

/* �پ��� ���� ������ �ϴ� ������ (�Ŀ��, �ö�ƽ, ��, ��)
  
 */

//���ʸ� Ŭ���� : �پ��� Ÿ���� ����� �� �ִ� Ŭ����
public class GenericPrinter<T> {
	
	private T material; 		//material : ��������, ��ü, �ν��Ͻ�

	//��ü�� ����
	public T getMaterial() {
		return material;
	}
	
	//��ü�� Ȱ��ȭ
	public void setMaterial(T material) {
		this.material = material;
	}
	
	//�ش� ��ü�� toString() �޼��� ȣ��
	public String toString() {
		return material.toString();
	}
	
	//�޼��常 ����
	public void printing() {
//		material.doPrinting();
	}
	
}
