//package chap04;
//
//public class Switch_Ex02 {
//
//	public static void main(String[] args) {
//
//		
//		// Break�� ó������ �ʾ��� �� __ �ش� ���̽� ���� �극��ũ�� ���� �� ���� ���� ���̽��� ��� ����
//		int value1 = 2;
//		switch (value1) {
//		case 1:								//case 1   <- ���� Ȥ�� ���ڿ� ����
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
//		// Break �� ���Ե� ���
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
//			System.out.println("F");		// switch�� ������ ������ default �� break ����
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
//		 * switch ����ؼ� ������ 7�� �̻��̸� pass, 7�� �̸��� fail �� ��� (1~10)
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
