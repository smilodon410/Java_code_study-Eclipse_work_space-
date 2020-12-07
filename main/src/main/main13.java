package main;

// 추상 함수를 하나라도 가지고 있으면 class도 추상 클래스여야 한다.
//abstract class Apple {
//	Apple() {}
//	
//	// 추상 함수(미완성) - 상속과 관계가 있음 : 자식에게 상속을 강요함
//	abstract void f1();
//	
//	//일반 함수 
//	void f2() {
//		System.out.println(2);
//	}
//}
//
//
//class Banana extends Apple {
//	Banana() {}
//	@Override	// 어노테이션 : 한 번 check 해봐!! = 혹시 모를 상황을 대비하여 오타 방지 
//	void f1() {
//		System.out.println(1);
//	}	// 부모가 추상 클래스인 경우 자식은 무조건 추상 함수를 Overriding 해야 한다. 
//	
//	void f3() {
//		System.out.println(3);
//	}
//}


//abstract class A {
//	A() {}
//	
//	abstract void f1();
//}
//
//class B extends A {
//	//1번 방법
//	@Override
//	void f1() {
//		System.out.println(1);
//	}
//}

public class main13 {

	public static void main(String[] args) {
		
//		Banana b1 = new Banana();
//		
//		b1.f1();
//		b1.f2();
//		b1.f3();
		
//		Apple a1 = new Apple();		// 미완성 코드가 있기 때문에 객채 생성을 할 수가 없음
		
		
		
//		B b1 = new B();
//		b1.f1();
//		
//		// 두번째 방법 : Upcasting
//		A b2 = new B();
//		b2.f1();
//		
//		// 세번쨰 방법 : 익명 클래스
//		A b3 = new A() {
//			@Override
//			void f1() {
//				System.out.println(2);
//			}
//		};
//		
//		b3.f1();
//		
//		// 4번째 방법 : 익명 개체
//		new A() {
//			@Override
//			void f1() {
//				System.out.println(4);
//			}
//		}.f1();

	
	}

}
