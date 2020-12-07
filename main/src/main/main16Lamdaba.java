package main;
// class 는 단일 상속밖에 안된다. 
// class 두개는 안되지만 class + interface 는 가능하다. 
//abstract class Apple {
//	abstract void f01();
//}
//
//class Orange extends Apple {
//	@Override
//	void f01() {
//		System.out.println(1);
//	}
//}

// Interface = abstract class : 일반 함수가 없다는 가정하게 사용 가능
// Interface, implements 를 사용하면 다중 상속이 가능
//interface Apple1 {
//	void f02();		//abstract 생략 가능
//}
//
//class Orange1 implements Apple1 {	// 부모가 Interface 인 경우 Implements 를 사용
//	@Override
//	public void f02() {		// implements 를 사용하게 되면 무조건 override 함수 앞에 public 을 붙여준다.
//		System.out.println(11);
//	}
//}

// 간편 다중 상속 예시
//class A {}
//
//interface B {}
//
//interface C {}
//
//class D extends A implements B, C {}

// Lambda 사용을 위한 class
//interface Apple {
//	void f01(); 
//}
//
//interface Banana {
//	void f02(int n);
//}
//
//interface Orange {
//	void f03(String s, int a);
//}
//
//interface Kiwi {
//	int f04();
//}
//
//interface Mango {
//	int f05(int a);
//}
//
//interface Grape {
//	int f06(int x, int y);
//}
//
//interface Apple01 {
//	void f07();
//}
//
//class Apple02 {
//	void f08(Apple01 app) {
//		app.f07();
//	}
//}

  // 예시 3
//interface Apple03 {
//	void f09();
//}
//
//class Apple04 {
//	Apple03 app;	
//
//	Apple04(Apple03 app) {
//		this.app = app;
////		app.f09();
//	}
//	
//	void f08() {
//		app.f09();
//	}
//}


public class main16Lamdaba {

	public static void main(String[] args) {
		
		// 추상 함수 호출 4가지 방법
//		// 1. 객체 생성
//		Orange o1 = new Orange();
//		o1.f01();
//		
//		// 2. Upcasting(부모 = new 자식)
//		Apple o2 = new Orange();
//		o2.f01();
//		
//		// 3. 익명 클래스 사용
//		Apple o3 = new Apple() {
//			@Override
//			void f01() {
//				System.out.println(2);
//			}
//		};
//		o3.f01();
//		
//		// 4. 익명 개체
//		new Apple() {
//			@Override
//			void f01() {
//				System.out.println(3);
//			}
//		}.f01();
		
		
//		Orange1 o11 = new Orange1();
//		o11.f02();
//		
//		Apple1 o12 = new Orange1();
//		o12.f02();
//		
//		Apple1 o13 = new Apple1() {
//			@Override
//			public void f02() {
//				System.out.println(12);
//			}
//		};
//		
//		new Apple1() {
//			@Override
//			public void f02() {
//				System.out.println(13);
//			}
//		};
		
		//Lambda Expression
//		Apple a1 = new Apple() {
//			@Override
//			public void f01() {
//				System.out.println(1);
//			}
//		};
//		
//		// Lambda : ->, =>(살찐 화살표)
//		Apple a2 = () -> {System.out.println("Lambda Success!!"); };
//		a2.f01();
//		
//		// 함수 문장이 한 문장일때는 {} 생략가능
//		Apple a3 = () -> System.out.println("Lambda Success!!");
//		a3.f01();
//		
//		// 인수 전달이 있는 Lambda
//		Banana b1 = (num) ->System.out.println(num * num);
//		b1.f02(10);
//		
//		// 인수 전달이 하나인 경우 () 생략이 가능하다
//		Banana b2 = nnn -> System.out.println(nnn * nnn);
//		b2.f02(20);
//		
//		// 인수 전달이 두개인 경우 Lambda
//		Orange o1 = (s, n) -> System.out.println(s + n);
//		o1.f03("호랑이", 10);
//		
//		// return 값이 있는 Lambda
//		Kiwi k1 = () -> {System.out.println(200); return 50;};
//		k1.f04();
//		
//		// Lambda Body 가 return 하나 일때는 {} 와 return 이 생략 가능하다
//		Kiwi k2 = () -> 100;
//		System.out.println(k1.f04());
//		
//		// 인수 전달 1개 와 return 이 있는 Lambda 
//		Mango m1 = n -> 100 * n;
//		System.out.println(m1.f05(11));
//		
//		// 인수 전달 2개와 return 이 있는 Lambda
//		Grape g1 = (x, y) -> x * y;
//		System.out.println(g1.f06(50, 3));
//		
//		// Lambda 사용 이유 : 메소드에 전달을 Interface type 으로 줬을때 
//		//					 전달 인수를 수식으로 주기 위하여 사용
//		Apple02 a4 = new Apple02();
//		a4.f08(() -> {
//			System.out.println(1);
//			System.out.println(2);
//			System.out.println(3);
//		});
//		
//		a4.f08(() -> System.out.println(4));
		
		// 예시 1
//		Runnable a4 = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("런닝맨~~");
//			}
//		};
//		a4.run();
//		
//		Runnable a5 = () -> {System.out.println("Yeah~~");};
//		a5.run();
		
		// 예시 2
//		Apple04 a6 = new Apple04(() -> System.out.println("9번"));
//		a6.f08();
//		
//		Apple04 a7 = new Apple04(() -> {
//			System.out.println(1);
//			System.out.println(2);
//			System.out.println(3);
//		});
//		a7.f08();
		
		// 예시 3 : Thread 활용 
//		Thread t1 = new Thread() {
//			@Override
//			public void run() {
//				super.run();
//				System.out.println("달려~~!!");
//			}
//		};
//		t1.start();
//		
//		Thread t2 = new Thread(() -> System.out.println("부와와왕~~!!"));
//		t2.start();
		
		
		
		
	}
}
