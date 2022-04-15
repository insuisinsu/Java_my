package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	����� �ٷ�� ���ô�.
 	������ �����ڿ� super() ���
 	
 	�ڹ� ���ϰ� �������� �Բ� ����
  
 */

class Fruit {
	String fruitName;	//���� �̸�
	String color;		//������ ��
	int large;			//���� ũ��

	public String toString () {		//������ ������ ����ϴ� �޼ҵ�
		return "������ �̸��� < "+fruitName+" > �̰�, ������ < "+color+" > �̰�, ũ��� < "+large+" > �Դϴ�.";
	}
	
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLarge() {
		return large;
	}

	public void setLarge(int large) {
		this.large = large;
	}

	

}

class Apple extends Fruit {
	Apple (String fruitName, String color, int large){
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
	
}

class Orange extends Fruit{
	Orange (String fruitName, String color, int large){
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}

class Banana extends Fruit{
	Banana (String fruitName, String color, int large){
		super.fruitName = fruitName;
		super.color = color;
		super.large = large;
	}
}


public class Fruit_Test {

	public static void main(String[] args) {

		ArrayList<Fruit> fruitList = new ArrayList ();
		Scanner sc = new Scanner(System.in);
		
		String name;
		String col;
		int size;
		
		boolean run = true; 
		while (run) {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("1. ���		|	2. ������		| 	3. �ٳ���		|	4. ���� ���		|	5. ����");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("����>>");
			int selectNO = sc.nextInt(); 
			
			if (selectNO == 1) {
				System.out.println("������ �̸� : ");
				name = sc.next();
				System.out.println("������ ���� : ");
				col = sc.next();
				System.out.println("������ ũ�� : ");
				size = sc.nextInt();
				Apple apple = new Apple(name, col, size);
				fruitList.add(apple);
			}else if (selectNO == 2) {
				System.out.println("������ �̸� : ");
				name = sc.next();
				System.out.println("������ ���� : ");
				col = sc.next();
				System.out.println("������ ũ�� : ");
				size = sc.nextInt();
				Orange orange = new Orange(name, col, size);
				fruitList.add(orange);
			}else if (selectNO == 3) {
				System.out.println("������ �̸� : ");
				name = sc.next();
				System.out.println("������ ���� : ");
				col = sc.next();
				System.out.println("������ ũ�� : ");
				size = sc.nextInt();
				Banana banana = new Banana(name, col, size);
				fruitList.add(banana);
			}else if (selectNO == 4) {
				for(Fruit k : fruitList) {
					System.out.println(k);
				}
			}else if (selectNO == 5) {
				run = false; 
			}
			
		}
		sc.close(); 
		System.out.println("���α׷� ����");
		
		
		/*	1. �ڵ� �ۼ�
		 	��ĳ�ʷ� ��������.
		 	�����ϼ���.
		  	----------------------------------------------------------------------------
		  	1. ���		|	2. ������		| 	3. �ٳ���		|	4. ���� ���		|	5. ����
		  	----------------------------------------------------------------------------
		 
		 	���� >> 1, 2, 3 		�� �ϸ�
		 	���ϸ�	:
		 	����		:
		 	ũ��		:		��ǲ�ޱ�
		 
		2. �ڵ��ۼ� : ��ĳ�ʷ� ��ǲ ���� ������ ������ ��ü�� �����ϰ� ArrayList �� ����
		
		3. ���� 4, ������� - ArrayList �� ��� ��ü�� ���	- Enhanced For �� ���
		������ �̸��� <���> �̰�, ������ <������> �̰�, ũ��� <10> �Դϴ�.
		������ �̸��� <������> �̰�, ������ <��Ȳ��> �̰�, ũ��� <20> �Դϴ�.
		������ �̸��� <�ٳ���> �̰�, ������ <�����> �̰�, ũ��� <30> �Դϴ�.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
