package main;

import java.util.Scanner;

public class main01 {
	
	public static void main(String[] args) {
		//ex01
//		System.out.println(10);
		//ex02 : 표준 변수
//		alt + 방향키 = 한칸씩 미루기
//		ctrl + alt + 방향키 = 전체 문장 복사
		
//		byte(1);
//		short(2);
//		char(2);
//		int(4);
//		long(8);
//		float(4);
//		double(8);
//		boolean(1);
		
		//ex03 : int랑 Integer의 차이
		
//		int는 표준 변수
//		Integer는 클레스 : 함수 사용 가능
//		int -> Integer : boxing
//		Integer -> int : unboxing
		
		//ex04 : for문은 봤을때 몇번 반복되는지 바로 알아야 함 : 다음과 같은 3가지 방식을 벗어날 수 없음.
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		for (int i = -5; i <= 5; i++) {
//			System.out.println(i);
//		}	
		
		//ex05 : 반복 횟수를 알 수 있을때 = for문 , 모를 때 = while
		
//		int x = 0;
//		for (int j = 0; j < 10; j++) {
//			x = 5 * j;
//			System.out.println( 5 + "*" + j + "=" + x);
//		}
		
		// printf : 문자열만 올 수 있다.
		// 줄바꿈 : "\n"
		// 치환 : "%d" = , 뒤 치환 값을 정해준다. %d와 치환 값의 개수는 항상 일치해야 한다.
//		for (int j = 0; j < 10; j++) {
//			System.out.printf("5 * %d = %d\n", j, j * 5);			
//		}
		
		//ex06
//		int sum = 0;
//		for (int i = 1; i <= 10 ; i++) {
//			sum = sum + i;
//			System.out.println(sum);
//		}
//		
//		
//		int sum1 = 0;
//		for (int i = 1; i <= 10 ; i++) {
//			sum1 = sum1 + i;
//		}
//		System.out.println(sum1);
		
		//ex07 : input
		// 방법1
//		Scanner scanner = new Scanner( System.in );
//		int num = scanner.nextInt();
//		System.out.println(num);
		
		// 방법2
//		int num = (new Scanner( System.in )).nextInt();
//		System.out.println(num);
		
//		// 방법3
//		System.out.println(new Scanner( System.in ));
		
		//예제 : 입력받은 숫자로 구구단 출력하기
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("단을 입력하세요 :");
//		
//		int x = scanner.nextInt();
//		int y = 0;
//		for (int i = 0; i < 10 ; i++) {
//			y = x * i;
//			System.out.println(x + "*" + i + "=" + y);
			
//		}

	}

}