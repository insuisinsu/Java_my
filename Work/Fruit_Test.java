package Work;

import java.util.ArrayList;
import java.util.Scanner;

/*
 	����� �ٷ�� ���� ������ �����ڿ� super() �޼ҵ� ���.
 	
 */

class Fruit {
	String fruitName;	//���� �̸�
	String color;		//���� ����
	int large;			//���� ũ��
	
	public Fruit() {};
	
	public Fruit(String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
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

	public String toString() {	//������ ������ ����ϴ� �޼ҵ�
		return "������ �̸��� " + fruitName + "�̰�, ������ " + color + "�̰�, ũ��� " + large + " �Դϴ�." ;
	}
}

class Apple extends Fruit {

	Apple(String fruitName, String color, int large) {
		super(fruitName, color, large);
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}
	
	
}

class Orange extends Fruit {

	Orange(String fruitName, String color, int large) {
		super(fruitName, color, large);
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}
	
}

class Banana extends Fruit{

	Banana(String fruitName, String color, int large) {
		super(fruitName, color, large);
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}
	
}

/*  1. �ڵ� �ۼ� : ��ĳ�� ��ǲ �޴� �ڵ�
 *  ���� >>
 	=================================================
 	 1. ���  |  2. ������ | 3. �ٳ��� | 4. ���� ��� |5. ����
 	==================================================
 	
 	 ���� >> 1
 	 ���ϸ� :
 	 ���� :
 	 ũ�� :
 	 
 	 2. �ڵ� �ۼ� : ��ĳ�ʷ� ��ǲ ���� ������ ������ ��ü�� �����ؼ� ArrayList�� ����
 	 
 	 3. ���� >> 4 ��ü�� �����ͼ� ��ü�� ������� �� ArrayList�� ��� ��ü�� �����ͼ� 
 	 			 ��ü ���� ���, Enhanced For �� ���
 			��� ��� : ������ �̸��� <���>�̰�, ������ <������>�̰�, ũ��� <10> �Դϴ�.
 				     ������ �̸��� <������>�̰�, ������ <��������>�̰�, ũ��� <20>�Դϴ�.
 */


public class Fruit_Test {
	public static void main(String[] args) {
		
		ArrayList<Fruit> fruitList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
		System.out.println("=================================================");
		System.out.println(" 1. ��� | 2. ������ | 3. �ٳ��� | 4. ���� ��� | 5. ����");
		System.out.println("=================================================");
		System.out.println("���� >>");
		int Num = sc.nextInt();
		
		if(Num == 1) {
			System.out.println("- ���ϸ� : ");
			String fruitName = sc.next();
			System.out.println("- ���� : ");
			String color = sc.next();
			System.out.println("- ũ�� : ");
			int large = sc.nextInt();
			
			fruitList.add(new Apple(fruitName, color, large));
			System.out.println(fruitName + "�� ������ ���������� �ԷµǾ����ϴ�.");
		} else if(Num == 2){
			System.out.println("- ���ϸ� : ");
			String fruitName = sc.next();
			System.out.println("- ���� : ");
			String color = sc.next();
			System.out.println("- ũ�� : ");
			int large = sc.nextInt();
			
			fruitList.add(new Fruit(fruitName, color, large));
			System.out.println(fruitName + "�� ������ ���������� �ԷµǾ����ϴ�.");
		} else if(Num == 3) {
			System.out.println("- ���ϸ� : ");
			String fruitName = sc.next();
			System.out.println("- ���� : ");
			String color = sc.next();
			System.out.println("- ũ�� : ");
			int large = sc.nextInt();
			
			fruitList.add(new Fruit(fruitName, color, large));
			System.out.println(fruitName + "�� ������ ���������� �ԷµǾ����ϴ�.");
		} else if (Num == 4) {
			for(Fruit k : fruitList) {
				System.out.println(k);
			}
		} else if (Num == 5) {
			break;
		}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

	
	}
