package main;

//class Apple {
//	Apple() {
//		System.out.println("나는 부모");
//	}
//}
//
//class Banana extends Apple {
//	Banana() {
//		System.out.println("나는 자식");
//	}
//}
//
//class A {
//	A() {}
//	A(int n) {
//		System.out.println(n);
//	}
//}
//
//class B extends A{
//	B () {
//		super();    //Super()는 무조건 생성자의 첫 줄에 있어야 함 : 없으면 Default 값으로 존재함
//		System.out.println("자식생성자");
//	}
//}

//class Apple{
//	Apple() {}
//	
//	void f1() {
//		System.out.println("부모 1");
//	}
//	
//	void f3() {
//		System.out.println("부모 3");
//	}
//	
//	void f5() {
//		f3();
//	}
//	
//	void f6() {
//		this.f3();
//	}
//}
//
//class Orange extends Apple {
//	Orange() {}
//	
//	void f2() {
//		System.out.println("자식 2");
//	}
//	
//	@Override
//	void f3() {
//		System.out.println("자식 3");
//	}
//	
//	void f4() {
//		super.f3();    // 부모 함수 받아오는 방법 : Super
//	}
//}

//class Apple {
//	Apple(){}
//
//	void f1() {
//		System.out.println("1번 콜");
//	}
//	
//	void f3() {
//		System.out.println("부모");
//	}
//}
//
//class Orange extends Apple {
//	Orange(){}
//	
//	void f2() {
//		System.out.println("2번 콜");
//	}
//	
//	@Override
//	void f3() {
//		System.out.println("자식");
//	}
//}

//class Animal {
//	Animal() {};
//	
//	void Bark() {
//		System.out.println("저는 울지 못해요ㅠ^ㅠ");
//	}
//}
//
//class Dog extends Animal{
//	Dog() {};
//	
//	void Bark() {
//		System.out.println("멍멍");
//	}
//}
//
//class Cat extends Animal{
//	Cat() {};
//	
//	void Bark() {
//		System.out.println("냥냥");
//	}
//}
//
//class Snake extends Animal{
//	Snake() {};
//	
//}

//class Zoo {
//	Animal animal;
//	
//	Zoo() {}
////	Zoo(Dog dog) {}
////	Zoo(Cat cat) {}
////	Zoo(Snake snake) {}
//	// Upcasting 을 활용한 코드 최적화 : 추가 생성자 생성을 하지 않아도 됨
//	Zoo(Animal animal) {
//		this.animal = animal;
//	}
//	
//	void Bark() {
//		animal.Bark();
//	}
//}
//
//class Animal{
//	void Bark() {}
//}
//
//class Dog extends Animal {
//	Dog() {}
//	void Bark() {
//		System.out.println("멍멍");
//	}
//}
//
//class Cat extends Animal {
//	Cat() {}
//	void Bark() {
//		System.out.println("냥냥");
//	}
//}
//
//class Snake extends Animal {
//	Snake() {}
//	void Bark() {
//		System.out.println("??");
//	}
//}
	
//class Apple {
//	Apple() {}
//	
//	void f1() {
//		System.out.println(1);
//	}
//}

public class main12and3 {

	public static void main(String[] args) {
		
//		Apple a1 = new Apple();
//		
//		Banana b1 = new Banana();	// 결과 = 부모 쪽으로 올라갔다가 다시 자식으로 내려옴
//		
//		B b = new B();    // 호출 순서 = B -> A
		
//		Orange o1 = new Orange();
//		
//		o1.f1();
//		o1.f2();
//		o1.f3();
//		o1.f4();
//		o1.f5();	// Overriding 된 함수는 무조건 자식 함수를 호출함
//		o1.f6();    // this 를 사용해도 결과는 같음^^
		
//		Apple t1 = new Apple();
//		Orange t2 = new Orange();
////		Orange t3 = new Apple();    // Error!
//		Apple t4 = new Orange();	//UpCasting Java의 하이라이트!! 문법 = Apple(부모), 메모리 = Orange(자식)
//		
//		t4.f1();
////		t4.f2();    //자식 함수 호출 불가
//		t4.f3();
//		
//		t2.f1();
//		t2.f3();
//		t2.f2();
		
//		Animal a1 = new Dog();
//		a1.Bark();
//		
//		Animal a2 = new Cat();
//		a2.Bark();
//		
//		Animal a3 = new Snake();
//		a3.Bark();
//		
//		Dog a4 = new Dog();
//		a4.Bark();
//		
//		Cat a5 = new Cat();
//		a5.Bark();
//		
//		Snake a6 = new Snake();
//		a6.Bark();
		
//		String s1 = "호랑이";
//		String s2 = new String();
//		String[] s3 = {"호랑이1", "호랑이2", "호랑이3"};
//		String[] s4 = {new String("코끼리1"), new String("코끼리2"), new String("코끼리3")};
		
//		Animal[] a7 = {new Dog(), new Cat(), new Snake(), new Dog(), new Cat()};
		
		// Upcasting 을 하지 않으면 for문을 사용 할 수 없다
//		for (int i = 0; i < a7.length; i++) {
//			a7[i].Bark();
//		}
		
		//Upcasting : 코드 최적화 = 생성자 생성을 계속 안해도 된다.
//		Dog d1 = new Dog();
//		
//		Zoo z1 = new Zoo(d1);
//		Zoo z2 = new Zoo(new Dog());
//		Zoo z3 = new Zoo(new Cat());
//		Zoo z4 = new Zoo(new Snake());
//		
//		z2.Bark();
//		z3.Bark();
//		z4.Bark();
		
//		String[] str = new String[3];	//문자열 3개를 받을 수 있는 str 생성
//		str[0] = "호랑이";
//		str[1] = new String("코끼리");
//		str[2] = "독수리";
//		
//		Apple a1 = new Apple();
//		Apple[] a2 = new Apple[3];
//		
//		a2[0] = new Apple();
//		a2[0].f1();
//		
//		
//		
//		
//		int a, b, c;
//		int[] ar = new int[3];	// 두 선언의 메모리가 차지하는 값은 같다. 
//		
//		a = 10;
//		ar[0] = 10;
//		
//		b = 20;
//		ar[1] = 20;
//		
//		c = 30;
//		ar[2] = 30;
//		
//		String s1, s2, s3;
//		
////		System.out.println(s1);
//		
//		String[] br = new String[3];
//		br[0] = new String("호랑이");
		
		
		
	}
}