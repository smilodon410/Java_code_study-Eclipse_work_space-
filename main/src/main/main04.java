package main;

import java.util.Random;

public class main04 {

	public static void main(String[] args) {
		Random random = new Random();
		
		//ex19
//		System.out.println(Integer.MAX_VALUE);  //attach source -> external location -> external file -> 'C:\Program Files\Java\jdk-11.0.8\src' 선택
//		for (int i = 0; i < 10; i++) {
//			System.out.println(random.nextInt(Integer.MAX_VALUE));
//			System.out.println(Short.MAX_VALUE);
//		}
		
		//ex20
		//랜덤으로 나온 수의 각 자릿수의 합
		
//		int num = random.nextInt(Integer.MAX_VALUE);
//		
//		System.out.println(num);
//
//		int sum = 0;
//
//		while ( true ) {
//			int a = num / 10;
//			int b = num % 10;
//
//			sum = sum + b;
//			num = a;
//
//			if( num == 0) {
//				System.out.println("결과는: " + sum);
//				break;
//			}
//		}         // while문에 조건이 들어가게 되면 출력 값이 0이 될 경우 작동하지 않음 -> 'while(true) : break'활용
		
		//ex21
		//final이 쓰일 수 있는 곳
		//필드 앞에 붙일 수 있다.  -> 변수 앞에 붙이게 되면 상수화한다.
		//class 앞에 붙일 수 있다.  -> 상속을 받을 수 없다. = 부모가 될 수 없음 = extends 불가
		//메소드 앞에 붙일 수 있다.  -> overriding을 할 수가 없다.
		
		
		//ex22
		//1. o, x의 개수
		//2. 연속된 o, x값의 최댓값
		
//		int a = 0;
//		int b = 0;
//		int b1 = 0;
//		
//		int c = 0;
//		int d = 0;
//		int d1 = 0;
//
//		for (int i = 0; i < 10; i++) {
//			int num = random.nextInt(2);
//
//			if(num == 0) {
//				a += 1;
//				System.out.print("O ");
//				b += 1;
//				d = 0;
//				if (b >= b1)
//					b1 = b;
//			} else {
//				c += 1;
//				System.out.print("x ");
//				d += 1;
//				b = 0;
//				if (d >= d1) {
//					d1 =d;
//				}
//			}
//		}System.out.println("");
//		System.out.println("O의 총 개수: " + a);
//		System.out.println("x의 총 개수: " + c);
//		System.out.println("연속된 O의 최댓 값: " + b1);
//		System.out.println("연속된 X의 최댓 값: " + d1);

	
	
	//ex23
	//내부 클래스
//		class Apple {
//			public void f1() {
//				System.out.println("호랑이");
//			}
//			
//			public void f2() {
//				System.out.println(this);    // 객체 생성전까지는 존재 없음~ 객체 생성후 객체를 지시할때 사용
//			}
//			
//			int f3() {                      // 리턴 값이 int로 와야함
//				return 100;
//			}
//			
//			String f4() {                   // 리턴 값이 Str
//				return "호랑이";
//			}
//			
//			Apple f5() {                    // 리턴 값이 Apple
//				return this;
//			}
//			
//			void pretty() {
//				System.out.println("프리티");
//			}
//		}
//	
//		Apple a1 = new Apple();  //단축키 new + ctrl + space
//		Apple a2 = new Apple();
//		Apple a3 = new Apple();
//		
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(Integer.toHexString(a2.hashCode()));
//		
//		a1.f1();
//		a2.f1();
//		
//		a1.f2();  
//		a2.f2();
//		a3.f2();
//		
//		a3.f5().f2();
//		a3.f5().f5().f1();       // chaining
//		
//		a3.f5().pretty();
//
	}
}



