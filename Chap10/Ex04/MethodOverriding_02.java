package Chap10.Ex04;

class Animals{
	void run() {
	}
}
class Tiger extends Animals{
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�.");
	}
	void tigerEat() {
		System.out.println("ȣ���̴� ��� �Ծ��");
	}
}
class Egle extends Animals{
	@Override
	void run() {
		System.out.println("�������� ����ٳ��.");
	}
	void egleEat() {
		System.out.println("�������� ��� �Ծ��");
	}
}
class Snake extends Animals{
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ�.");
	}
}

public class MethodOverriding_02 {

	public static void main(String[] args) {

		//1. ��� ��ü�� Animals Ÿ������ ����
		Animals tiger = new Tiger();
		Animals egle = new Egle();
		Animals snake = new Snake();
		
		
		//2. Animals �迭�� �� ��ü�� �����ϰ�
		Animals[] animals = {tiger, egle, snake};
		
		//3. for �� ���� ���
		for(int i = 0; i < animals.length; i++){
			animals[i].run();
		}
		System.out.println();
		//4. Enhanced For ���, run() ��� 
		for(Animals k : animals) {
			k.run();
		}
		
		//5. �ٿ� ĳ����(instanceof) ����Ͽ� ���
		if(tiger instanceof Tiger) {
			Tiger t_down = (Tiger) tiger;
			t_down.tigerEat();
		}else {
			System.out.println("tiger �� Tiger�� �ٿ�ĳ���� �Ұ���");
		}
		
		if(egle instanceof Egle) {
			((Egle) egle).egleEat();
		}else {
			System.out.println("egle�� Egle�� �ٿ�ĳ���� �Ұ���");
		}
		
		
	}

}
