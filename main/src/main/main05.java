package main;

public class main05 {

	public static void main(String[] args) {
		//ex24
		//생성자(생성자 함수)
		//특징
		//1. 생성자의 이름은 반드시 클래스의 이름과 동일해야 한다.
		//2. 생성자(함수)도 함수이기 때문에 함수 OverLoading이 가능하다.
		//3. 생성자(함수)는 프로그래머가 임의로 호출 할 수가 없다. 
		//4. 생성자(함수)는 객체가 생성 될 때 자동 호출이 된다.
		//5. 생성자(함수)는 리턴 값을 가질 수 없다. 
		//6. 생성자의 목적은 필드의 초기화!!

//		class Tiger{
//			Tiger() {
//				System.out.println(1);
//			}
//			Tiger(int a) {
//				System.out.println(2);
//			}   //생성자 함수 overloading
//			Tiger(int a, int b) {
//				System.out.println(3);
//			}     //Tiger(int a, int b) {} : 실수를 많이 하는 타입, type 지정을 해주자!
//			Tiger(int a, String b, Tiger c) {
//				System.out.println(4);
//			}
//			Tiger(float a) {
//				System.out.println(5);
//			} // 함수의 전달 인수가 다르거나, 인수의 개수가 같더라도 type이 다를 경우 overloading 허용
//			Tiger(short a) {
//				System.out.println(6);
//			}
//
//		}
//
//		Tiger t1 = new Tiger();		
//		t1.Tiger();  -- 이렇게 사용 할 수 없다.
//		Tiger t2 = new Tiger(10);
//		Tiger t3 = new Tiger(10,20);
//		Tiger t4 = new Tiger(4, "홍희재", t1);  //객체 값을 null을 줘도 결과값이 도출됨
//		Tiger t5 = new Tiger(10.4f);   //double 타입은 f를 안적어 줘도 상관없음
//		Tiger t6 = new Tiger((short)100);  //Type Casting : 중첩이 되어 구별하기 힘든 상황일 때(int와 short의 구별), 구별하고 싶은 타입을 앞에 적어 준다.
//	
//		int x = 10, y = 20;
//		Tiger t7 = new Tiger(x, y);
//		
//		String s1 = new String("조올려");
//		Tiger t8 = new Tiger(x * y, s1, t7);
//		Tiger t9 = new Tiger(x * y, s1, new Tiger());
		
		//멤버 변수 -> 필드
		
		//ex25
		//필드 생성 후 생성자를 이용한 초기화
//		class Eagle {
			
			//일반적으로 변수를 생성자 위에 작성한다
//			int a;  
//			String b;
//			int c = 20;
//			String d = "호랑이";
//			String e = new String("코끼리");
//			
//			Eagle() /*인수 전달이 없는 생성자 : Default 생성자*/ {
//				a = 100;
//				b = "독수리";
//				c = 200;
//				d = "앵무새";
//				e = "날파리";
//			}  // 생성자는 멤버 변수(필드)를 초기화 하는 데 사용
//		}
//		
//		Eagle e1 = new Eagle();
//		System.out.println(e1.a);  //int의 default값은 0
//		System.out.println(e1.b);  //String default 값은 null
//		System.out.println(e1.c);
//		System.out.println(e1.d);
//		System.out.println(e1.e);
		
		//ex26
//		class Lion {
//			
//			int x = 100, y = 100;
//			
//			Lion() {}
//			
//			Lion(int a) {
//				x = a;
//				y = a;
//			}
//			
//			Lion(int a, int b) {
//				x = a;    //x = 필드, a = 인수
//				y = b;
//			}
//		}
//		
//		Lion l1 = new Lion();
//		System.out.println(l1.x + " " + l1.y);
//		
//		Lion l2 = new Lion();
//		System.out.println(l2.x + " " + l2.y);
//		
//		Lion l3 = new Lion(200, 300);
//		System.out.println(l3.x + " " + l3.y);
//		
//		Lion l4 = new Lion(500, 600);
//		System.out.println(l4.x + " " + l4.y);
//	
//		Lion l5 = new Lion(900);
//		System.out.println(l5.x + " " + l5.y);
		
		
		//ex27 : default 생성자는 기본적으로 항상 만들어 놓자
//		class Apple {
//			int x = 0;
//			
//			Apple() {}
//			
//			Apple(int a) {
//				x = a;
//			}
//		}
//		Apple a1 = new Apple();
//		
//		Apple a2 = new Apple(10);
		
		//ex28
		//멤버 함수 -> 메소드
		
//		class Apple {
//			int x = 0;
//			
//			Apple() {}
//			
//			//'void func01()' : 함수 원형
//			void func01() {
//				System.out.println(1);
//			}
//			
//			void func02(int a) {
//				System.out.println(a);
//			}
//			
//			int func03() {
//				return 200;
//			}
//			
//			int func04(int a) {
//				return a * 7;
//			}
//		}
//		
//		Apple a1 = new Apple();
//		a1.func01();  
//		a1.func02(10);
//
//		int num = a1.func03();
//		int count = a1.func03();
//		System.out.println(count);
//		
//		System.out.println(a1.func03() * 100);
//		System.out.println(a1.func03() * a1.func03());
////		System.out.println(a1.func01());    //return값이 없으므로 Error
//		
//		int x = a1.func04(7);
//		System.out.println(x);
//		
//		int y;
//		y = a1.func04(8);
//		System.out.println(y);
		
//		class Banana {
//			
//			Banana() {}
//			
//			void func01() {
//				System.out.println(1);
//			}
//			
//			void func02(int a) {
//				System.out.println(a);
//			}
//			
//			int func03() {
//				System.out.println(3);
//				return 10;
//			}
//			
//			int func04(int a) {
//				System.out.println(4);
//				return a * 10;
//			}
//			
//			void func05(int a, int b) {
//				System.out.println(a + ", " + b);
//			}
//			
//			void func06(int a, int b, int c) {
//				System.out.println(a * b + c);
//			}
//			
//			void func07(int count, String s) {
//				for (int i = 0; i < count; i++) {
//					System.out.println(s);
//				}
//			}
//			
//			void func08() {
//				System.out.println(8);
//				func01();   //함수 안에서 자기 멤버 함수 호출 가능
//				func09();
//			}
//			
//			void func09() {
//				System.out.println(9);
////				func08();   //서로가 서로를 호출하게 되면 무한 루프에 빠짐
//			}
//			
//			void func10() {
//				System.out.println(10);
//			}
//			
//			void func10(int a, int b) {
//				System.out.println(a + b);
//			}
//			
//			int func11(int a, int b) {
//				int c = a * a + b * b;
//				return c;
//			}
//			
//			void func12(int num) {
//				if (num > 0) {
//					if(num % 2 == 0) {
//						System.out.println("짝수입니다.");
//					} else {
//						System.out.println("홀수입니다.");
//					} 
//				} else {
//					System.out.println("입력 오류 : 음수입니다.");
//				}
//			}
//			
//			void func13 (int num) {
//				if(num < 0) {
//					System.out.println("입력 오류 : 음수입니다.");
//					return;      //함수를 종료하게 만듬
//				}
//				if(num % 2 == 0) {
//					System.out.println("짝수입니다.");
//				} else {
//					System.out.println("홀수입니다.");
//				} 
//
//			}
//			
//			void func14 (int num) {
//				
//				if(num % 2 == 0) {
//					System.out.println("짝수입니다.");
//					return;
//				} else {
//					System.out.println("홀수입니다.");
//				}
//				System.out.println("호랑이");
//			}
//			
//			void func15(int num) {
//				if ( num != 1234) {
//					System.out.println("PASSWORD가 맞지 않습니다.");
//					return;
//				}
//				System.out.println("접속을 시도합니다.");
//			}
//			
//			int func16(int num) {      //반드시 리턴값을 받을 수 있도록 흐름 제어를 해주어야 한다
//				if (num % 2 == 0) {
//					return num * 2;
//				} else {
//					return num / 2;
//				}
//				
//			}
//			
//		}


//		Banana b1 = new Banana();
//		b1.func05(10, 2);
//		b1.func06(1, 2, 3);
//		b1.func07(2, "코끼리");
//		b1.func08();
//		b1.func10(10,2);
//		int num = b1.func11(7, 8);
//		System.out.println(num);
//		
//		System.out.println(b1.func11(2, 3));
//		
//		int y;
//		y = b1.func11(4, 5);
//		System.out.println(y);
		
//		b1.func13(3);
//		b1.func15(1233);
	}
}

