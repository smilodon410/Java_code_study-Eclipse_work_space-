package main;

import java.util.Random;
import java.util.Scanner;

public class main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		// ex47
//		System.out.print("숫자를 입력하세요: ");
//		int x = sc.nextInt();
//		for (int i = 0; i < x; i++) {
//			System.out.println();
//			for (int j = 0; j < i+1; j++) {
//				System.out.print("*" + " ");
//			}
//		}
		
		//ex48
//		System.out.print("숫자를 입력하세요: ");
//		int y = sc.nextInt();
//		for (int i = 0; i < y; i++) {
//			System.out.println();
//			for (int j = 0; j < y - i; j++) {
//				System.out.print("*" + " ");
//			}
//		}

		//ex49 - 다이아몬드 만들기
//		System.out.print("홀수를 입력하세요: ");
//		int z = sc.nextInt();
//		for (int i = 0; i < z ; i++) {
//			System.out.println();
//			for (int j = 0; j < z ; j++) {
//				if (Math.abs(i - (z / 2 )) + Math.abs(j - (z / 2)) <= (z / 2)) {
//					System.out.print("*" + " ");
//				} else {
//					System.out.print(" " + " ");
//				}
//			}
//		}

		
		//ex50 - 랜덤 3값 중 중간 값 찾기
//		int a = random.nextInt(100);
//		int b = random.nextInt(100);
//		int c = random.nextInt(100);
//		int d;
//		System.out.println("(" + a + " " + b + " " + c + ")");
//		
//		if (a > b) {
//			d = a;
//			a = b;
//			b = d;
//			if (b > c) {
//				d = b;
//				b = c;
//				c = d;
//				if (a > b) {
//					d = a;
//					a = b;
//					b = d;
//				}
//			}
//		} else {
//			if (b > c) {
//				d = b;
//				b = c;
//				c = d;
//			}		
//		} if(a > b) {
//			d = a;
//			a = b;
//			b = d;
//		}
//		System.out.println("중간 값은: " + b);
	
		// 강사님 해설
//		// 1차 버전
//				Random rnd = new Random();
//				for (int i = 0; i < 20; i++)
//				{
//					int a = rnd.nextInt(100);
//					int b = rnd.nextInt(100);
//					int c = rnd.nextInt(100);
//					int m;
//					
//					if (a > b) { // a는 최대 아니면 중간 : 왜냐하면 a가 최소가 아니니까.
//						if (a > c) { // a는 최대
//							m = Math.max(b, c);
//						}
//						else { // 중간
//							m = a;
//						}
//					}
//					else {// (a<b) a는 최소 아니면 중간
//						if (a < c) { // a는 최소
//							m = Math.min(b, c);
//						}
//						else {
//							m = a;
//						}
//					}
//					System.out.printf("%2d %2d %2d : %2d\n", a, b, c, m);
//				}
//				
//				
//		 		// 2차 버전
//				Random rnd = new Random();
//				for (int i = 0; i < 20; i++)
//				{
//					int a = rnd.nextInt(100);
//					int b = rnd.nextInt(100);
//					int c = rnd.nextInt(100);
//					int m;
//					
//					if (a > b) {
//						m = (a > c) ? Math.max(b, c) : a;
//					}
//					else {
//						m = (a < c) ? Math.min(b, c) : a;
//					}
//					System.out.printf("%2d %2d %2d : %2d\n", a, b, c, m);
//				}
//				
//				// 3차 버전
//				Random rnd = new Random();
//				for (int i = 0; i < 20; i++)
//				{
//					int a = rnd.nextInt(100);
//					int b = rnd.nextInt(100);
//					int c = rnd.nextInt(100);
//					int m;
//					
//					m= (a > b)
//							? (a > c) ? Math.max(b, c) : a
//							: (a < c) ? Math.min(b, c) : a;
//					
//					System.out.printf("%2d %2d %2d : %2d\n", a, b, c, m);
//				}		
		
	}
}	




