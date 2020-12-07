package main;

import java.util.Random;

public class main03 {

	public static void main(String[] args) {
		
		//ex14 - 줄 바꿈 안하고 출력하기
//		for (int i = 0; i < 10; i++) {
//			System.out.print(" " + i);
//		} System.out.println("");       //print 이후 줄 바꿈 하기 위해 출력문 작성
//		System.out.println("호랑이");
		
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("%02d ", i);
//		} System.out.println("");
//		System.out.println("호랑이");
		
		//ex15 - 피보나치 수열 : swap 활용
//		int a = 0;
//		int b = 1;
//		int sum = 0;
//		
//		for (int i = 0; i < 10; i++) {
//				sum = a + b;
//				System.out.printf("%d ", sum);
//				a = b;
//				b = sum;
//		} System.out.println("");
		
		//ex16 - 각 자릿수 합 더하기
//		Random random = new Random();
//		for (int i = 0; i < 5; i++) {
//			int num = random.nextInt(100);
//			
//			int a = num % 10;
//			int b = num / 10;
//			int sum  = a + b;
//			
//			System.out.println(num + " >> 결과: " + sum);
//		
//		}
		
		//ex17 - 모든 십,일의 자리 값의 합 구하기
//		Random random = new Random();
//		int b = 0;
//		int d = 0;
//		
//		for (int i = 0; i < 5; i++) {
//			int num = random.nextInt(100);
//			System.out.println(num);
//			int a = num / 10;
//			int c = num % 10;
//			
//			int sum = a + b;
//	        b =sum;
//	        	        
//	        int sum1 = c + d;
//	        d = sum1;
//	        	       
//	        if (i == 4) {
//	        	System.out.println("십의 자리의 합: " + sum);
//	        	System.out.println("일의 자리의 합: " + sum1);
//	        	break;
//	        }
//	    		
//		}
		
		//ex18 예제
		//각 자릿수가 중복되는 값이 있으면 안됨
		//반드시 5개가 출력 되어야 한다.
		//배열 사용하지 않는다
				
//		for (int i = 0; i < 5; i++) {
//			Random random = new Random();
//			int num = random.nextInt(900) + 100;
//			
//			int a = num / 100;  
//			int b = num % 100;  
//			int c = b / 10;     
//			int d = b % 10;     
//			
//			if (a == c || c == d || a == d) {
//				System.out.println("ERROR!!!");
//				i--;                    
//				continue;
//			} else {
//				System.out.println(num);
//			}
//			
//							
//		}
		
		
		//반복 횟수를 정확하게 모르기 때문에 while문이 더욱 적합
//		int count = 0;  //count 대신 ct로 주로 사용함
//		while (true) {
//			Random random = new Random();
//			int num = random.nextInt(900) + 100;
//			
//			int a = num / 100;  
//			int b = num % 100;  
//			int c = b / 10;     
//			int d = b % 10;     
//			
//			if (a == c || c == d || a == d) {
////				System.out.println("ERROR!!!");			       
//				continue;
//			} else {
//				System.out.println(num);
//				count++;
//				if (count == 5) {
//					break;
//				}
//			}
//			
//		}
		
	}

}
