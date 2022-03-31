package Chap16.EX13;

//�� ���� ��ǥ ���� ����ؼ� ���̸� ���ϴ� ���α׷��� �ۼ� �ϼ���. ���ʸ� Ŭ���� / ���ʸ� �޼ҵ带 ���. 
//6:10 ���� �Ϸ� ,  p.jangwoo@gmail.com 

class Point <T,V> {		//������ ��ǥ�� ��� Ŭ���� 
	T x ; 	//������ x ��ǥ
	V y ;   //������ y ��ǥ 
	
	Point (T x, V y){   // ������.  Setter ���  �����ڸ� ���ؼ� ��ǥ�� �Ҵ�. 
		this.x = x;
		this.y = y; 
	}
	
	public T getX () { 
		return x; 
	}
	public V getY() {
		return y; 
	}	
}
class GenericMethod {
	public static <T, V> double makeRectangle (Point <T,V> p1, Point<T,V> p2) {
		// �ڵ� �ۼ� 
		
		double width = (double)p2.getX() - (double)p1.getX();
		double height = (double)p2.getY() - (double)p1.getY();
		
		return width * height;     //���� * ���� = ����    �� ���� 
	}
}
public class EX_Make_Rectangle {
	public static void main(String[] args) {
		Point <Double , Double> p1 = new Point <Double, Double>(1.0, 2.0);
		Point <Double , Double> p2 = new Point <Double, Double>(10.0, 50.0);
		
		double rect = GenericMethod.<Double,Double> makeRectangle(p1, p2);
		System.out.println("������ ���̴� : " + rect + " �Դϴ�. ");
	}
}
