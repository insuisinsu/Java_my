//package chap04;
//
//public class Switch_Ex02 {
//
//	public static void main(String[] args) {
//
//		
//		// Break를 처리하지 않았을 때 __ 해당 케이스 부터 브레이크를 만날 때 까지 하위 케이스를 모두 실행
//		int value1 = 2;
//		switch (value1) {
//		case 1:								//case 1   <- 정수 혹은 문자열 가능
//			System.out.println("A");
//		case 2:
//			System.out.println("B");
//		case 3:
//			System.out.println("C");
//		default:
//			System.out.println("F");
//		}
//		
//		System.out.println("==========");
//		// Break 가 포함된 경우
//		int value2 = 3;
//		switch (value2) {
//		case 1:								
//			System.out.println("A");
//			break;
//		case 2:
//			System.out.println("B");
//			break;
//		case 3:
//			System.out.println("C");
//			break;
//		default:
//			System.out.println("F");		// switch의 마지막 구문인 default 는 break 생략
//		}
//		
//		System.out.println("=========");
//		value2 = 2;
//		if (value2 == 1) {
//			System.out.println("A");
//		} else if (value2 == 2) {
//			System.out.println("B");
//		} else if (value2 == 3) {
//			System.out.println("C");
//		} else {
//			System.out.println("F");
//		}
//		
//		/*
//		 * switch 사용해서 점수가 7점 이상이면 pass, 7점 미만은 fail 을 출력 (1~10)
//		 */
//		
//		int a = 8;
//		
//		switch (a) {
//		case 10 :
//		case 9 :
//		case 8 :
//		case 7 :
//			System.out.println("Pass");
//			break;
//		default :
//			System.out.println("Fail");
//		}
//		
//		int b = 5;
//		
//		switch (b) {
////		case 7, 8, 9, 10 :
//			System.out.println("Pass");
//			break;
//		default :
//			System.out.println("Fail");
//		}
//		
//		
//		
//		
//		
//	}
//
//}
