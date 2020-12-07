package main;

import java.util.Random;
import java.util.Scanner;

public class main02 {

	public static void main(String[] args) {
		//ex08
		//1부터 입력 숫자까지의 합을 구하세요
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요: ");
//		
//		int x = scanner.nextInt();
//		int sum = 0;
//				
//		for (int j = 0; j <= x; j++) {
//			sum += j;			
//		}
//		System.out.println("1부터" + x + "까지의 합 :" + sum);
		
		//ex09 - 대입 증가
//		int a = 3; 
//		int b;
//		b = a++;
//		System.out.println(a + " " + b); 
//		
//		int c = 3, d;
//		d = ++c;
//		System.out.println(c + " " + d);
		
		//ex10
		//i가 짝수이면 호랑이 홀수이면 꼬끼리
//		for (int i = 1; i <= 20; i++) {
//			if( i % 2 == 0) {
//				System.out.println( i + " = " + "호랑이");
//			} else {
//				System.out.println( i + " = " + "코끼리");
//			}
//		}
//		
		//if else 문장은 반드시 삼항연산이 되는지 확인하자
//		for (int i = 1; i <= 20; i++) {
//			System.out.println((i % 2 == 0)? "호랑이" : "독수리");
//		}
		
	    //삼항 연산
//		int a = 10;
//	    if( 3 > 2) {
//	    	a += 1;
//	    } else {
//	    	a -= 1;
//	    }
//		//위와 완전 같음
//		a = ( 3 > 2 ? a++ : a -- );
		
		//3의 4승을 구하는 프로그램을 작성하세요
//		int num = scanner.nextInt();
//		int num2 = scanner1.nextInt();
//		System.out.println(num+"의 " + num2 + "승은 " + Math.pow(num, num2));
//		
//		int sum = 1;
//		for (int i = 0; i < 6; i++) {
//			sum = sum * 3;
//		}
//		System.out.println(sum);
		
		//ex11
		//"!"값을 구하자
//		int num = scanner.nextInt();
//		long sum = 1;
//		for (int i = 1; i <= num; i++) {
//			sum = sum * i;			
//		}
//		System.out.println( num + "! = " + sum);
		
		//ex12
		//예제 - swap 프로그램
//		int a = 10, b = 20;
//		int temp;
//		System.out.println(a + " " + b);
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println(a + " " + b);
		
		//ex13
//		Random rnd = new Random();
//		int r = rnd.nextInt(100);   //0~99까지 랜덤하게 숫자를 생성해줌
//		System.out.println(r);
//		
//		System.out.println(rnd.nextInt(6));
//		
//		System.out.println("");     //seperate : 구분 할 때 활용한다.
//		
//		for (int i = 0; i < 10; i++) {
//			r = rnd.nextInt(100);
//			System.out.println(r);
//		}
//		
//		System.out.println("");
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(rnd.nextInt(100));
//		}
		
	}

}
