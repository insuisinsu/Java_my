package chap04;

public class Work {

	public static void main(String[] args) {
		System.out.println("홀수 단");
		for (int i = 1; i <= 19; i++) {
			for (int j = 1; j <= 19; j++) {
				if (i % 2 == 0) {
					continue;
				}
				System.out.println(i+" * " + j +" = "+ (i*j));
			}System.out.println("=============");
		}
		
		System.out.println("3의 배수 단");
		for (int i = 1; i <= 19; i++) {
			for (int j = 1; j <= 19; j++) {
				if (i % 3 != 0) {
					continue;
				}
				System.out.println(i+" * " + j +" = "+ (i*j));
			}System.out.println("=============");
		}
	}

}
