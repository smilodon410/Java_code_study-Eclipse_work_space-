package main;

import java.util.Random;
import java.util.Scanner;

//class Apple {
//	// 호출한 놈이 책임져~
//	void f1() throws Exception {
//		throw new Exception();
//	}
//
//	// 호출해도 책임을 지지 않아도 된다.
//	void f2() {
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//
//		}
//	}
//	
//	void f3() throws Exception {
//		throw new Exception();
//	}
//	
//	void f4() {
//		f3();
//	}
//}

public class main14 {

	public static void main(String[] args) throws Exception {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 배열에 값 입력하는 방법
//		int[] ar = new int[7];
//				
//		ar[0] = 10;
//		ar[6] = 20;
////		ar[7] = 30;		// index num out of bound
////		ar[-1] = 40;	// index num out of bound
//		ar[1] = ar[0] + ar[6];	// 산술 연산 가능
//		
//		int num = 3;
//		ar[num] = 40;
//		
//		ar[num * 2 - 1] = 100;
//		
//		for (int i : ar) {
//			System.out.print(i + " ");
//		}System.out.println();
//		
//		ar[0] = 3;
//		ar[6] = ar[ar[0] * 2 - 1];
//		
//		for (int i : ar) {
//			System.out.print(i + " ");
//		}System.out.println();
//		
//		// 2차원 배열
//		// 차원이 늘어날 때 마다 앞쪽에 []를 넣으면 된다.
//		int[][] br = new int[4][6];		// 앞 =  세로, 뒤 = 가로
//		
//		br[0][0] = 10;
//		br[0][4] = 20;
//		br[2][4] = 30;
//		
//		// 2차원 배열 값 보기 
//		int x = 1;
//		for (int i = 0; i < br.length; i++) {
//			System.out.println();
//			for (int j = 0; j < br[i].length; j++) {
//				System.out.printf("%02d" + " ", x);
//				x++;
//			}
//		}
//		System.out.println();
//		
//		for (int i = 0; i < br.length; i++) {
//			System.out.println();
//			for (int j = 0; j < br[i].length; j++) {
//				System.out.printf("%02d" + " ", br[i][j] );
//			}
//		}
//		System.out.println();
//		
//		System.out.println();
		 
		
		// ar 값을 br, 로 옮기자
//		System.out.print("가로세로 값을 입력하세요: ");
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println();
//		
//		int[][] ar = new int[b][a];
//		int[][] br = new int[a][b];
//		int[][] cr = new int[b][a];
//		int[][] dr = new int[a][b];
//		
//		// ar 값 
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println();
//			for (int j = 0; j < ar[i].length; j++) {
//				int x = random.nextInt(100);
//				ar[i][j] = x;
//				System.out.printf("%02d" + " ", ar[i][j]);
//			}
//		}
//		System.out.println();
		
		// br 값
//		int i = 0;
//		int j = ar.length - 1;
//		for (int k = 0; k < br.length; k++) {
//			System.out.println();
//			for (int l = 0; l < br[k].length; l++) {
//				br[k][l] = ar[j][i];
//				System.out.printf("%02d" + " ", br[k][l]);
//				j--;
//			}
//			j = ar.length - 1;
//			i++;
//			if ( i == a) {
//				i = 0;
//			}
//		}
		
		// cr 값
//		int i = ar.length - 1;
//		int j = ar[i].length - 1;
//		for (int x = 0; x < cr.length; x++) {
//			System.out.println();
//			for (int y = 0; y < cr[x].length; y++) {
//				cr[x][y] = ar[i][j];
//				System.out.printf("%02d" + " ", cr[x][y]);
//				j--;
//			}
//			j = ar[i].length - 1;
//			i--;
//		}
		
		// dr 값
//		int i = ar.length;
//		int j = 0;
//		for (int s = 0; s < dr.length; s++) {
//			System.out.println();
//			for (int t = 0; t < dr[s].length; t++) {
//				dr[s][t] = ar[j][i];
//				System.out.printf("%02d" + " ", dr[s][t]);
//				j++;
//			}
//			j = 0;
//			i--;
//		}
		
		
//		int[] ar = new int[3];
//		
//		String s = null;
//		s.hashCode();
//		
				
		
		// 예외처리 공부( try, catch, finally )
		
//		for (int i = 0; i < 6; i++) {
//			System.out.println(i);
//			try { 
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}		
		
		
		// Exception 떠넘기기
//		Apple a = new Apple();
//		try {
//			a.f1();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		a.f2();
//		a.f1();
//		
//		Thread.sleep(3000);
		
	}

}
