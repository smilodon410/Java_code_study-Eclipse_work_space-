package main;

public class main09 {

	public static void main(String[] args) {
		
		//ex43
		//Sin 함수( -1 <= sin() <= 1
		//Math.PI = 파이 근사치
//		System.out.println(Math.sin(Math.PI * 30.0f / 180.0));
//		
//		for (int i = 0; i <= 36; i++) {
//			System.out.println(Math.sin(Math.PI * (i * 10) / 180.0));
//		}
		
		
		//ex44
		//배열(Array)
		//순차대로 정렬하기 
		//선택 정렬 - 작은 것을 앞으로 보내는 것
//		int[]ar = {5, 4, 8, 7, 1, 2, 3, 6};
//		for (int i = 0; i < ar.length - 1; i++) {
//			for (int j = i + 1; j < ar.length; j++) {
//				if (ar[i] > ar[j]) {
//					int tmp = ar[j];
//					ar[j] = ar[i];
//					ar[i] = tmp;
//				}					
//			}
//		}
//		for (int i = 0; i < ar.length; i++) {
//			int a = ar[i];
//			System.out.print(a + " ");
//		}System.out.println();
//
//		//역순 정렬 : 순차 정렬이 되어 있다는 가정 아래
//
//		for (int i = 0; i < ar.length/2 ; i++) {
//			int tmp = ar[i];
//			ar[i] = ar[ar.length - i -1];
//			ar[ar.length - i -1] = tmp;
//		}
//
//		for (int i = 0; i < ar.length; i++) {
//			int b = ar[i];
//			System.out.print(b + " ");
//		}System.out.println();
//
//		for (int i : ar) {
//			System.out.print(i + " ");
//		}
		
		//ex45
		//이중 for문 알고리즘
				
		for (int i = 0; i < 5; i++) {
			System.out.println();
			int x = 0;
			for (int j = 0; j < 5-i; j++) {
//				System.out.print("[" + x + " " + (j + 1) + "]");
				System.out.printf("[%d %d]", x, (j + 1) );
				x++;
			}

		}
//		
//		//버블 정렬
//		int[]ar = {5, 2, 6, 1, 3, 4};
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println();
//			for (int j = 0; j < 5-i; j++) {
//				if (ar[j] > ar[i]) {
//					int t = ar[j];
//					ar[j] = ar[j + 1];
//					ar[j + 1] = t;
//				}
//				
//			}
//			
//		}
//		for (int i : ar) {
//			System.out.print(i + " ");
//		}
		
		//ex46
//		for (int i = 0; i < 3; i++) {
//			System.out.println();
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d ", i * 4 + j);
//			}
//		}
		
		
//		for (int i = 0; i <3; i++) {
//			System.out.println();
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d ", (2 - i) * 4 + j);
//			}
//			
//		}System.out.println();
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.println();
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d ", 4 * (3 - i) - j - 1);
//			}
//		}
	}
}
