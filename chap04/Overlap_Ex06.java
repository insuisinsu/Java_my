package chap04;

public class Overlap_Ex06 {

	public static void main(String[] args) {

		//1. if 안에 if 중복
		
		int value1 = 5;
		int value2 = 3;
		
		if (value1 > 5) {
			if (value2 < 4) {					// 첫 번째 if 가 false 이면,
				System.out.println("실행 1");	// 두 번째 if 가 true 더라도 실행하지 않음
			}else {
				System.out.println(	"실행 2");
			}
		}else {
			System.out.println("실행 3");
		}
		
		System.out.println("==============");
		
		
		//2. switch 안에 for
		
		int value3 = 1;
		switch (value3) {
		
		case 1:
			for (int k = 10; k > 0 ; k--) {
				System.out.print(k +" ");
			}
			System.out.println();
			break;
		case 2:
			for (int k = 0 ; k < 10; k++) {
				System.out.print(k+" ");
			}
			break;							//마지막 줄은 break 필요없지 않나?
			
		}
		
		// 3. for 안에 for
		
		for (int i = 0; i < 3 ; i++) { // 0 부터 2 까지 3 번 실행됨
			for (int j = 0; j < 5; j++) { // 0 부터 4 까지 5번 실행됨
				if (i == j) {
					System.out.println(i + " = " + j);
				}else{
					System.out.println(i + ", " + j);					
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
