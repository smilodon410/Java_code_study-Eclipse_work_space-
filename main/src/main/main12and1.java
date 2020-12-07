package main;
	//ex56
// Getter 와 Setter 함수 
// Source -> Generate Getter and Setter 로 자동생성 가능

//class Car{
//	//Private 사용 이유 : 데이터(정보) 은닉
//	private	String name = "제네시스 G90";	
//	private int money = 1000;
//	// Private 정보 받기 : get 에서 정보 받기
//	String getName() {
//		return name;
//	};
//	
//	int getMoney() {
//		return money;
//	}
//	//Private 내용 변경하기 : set 활용
//	void setName(String name) {
//		this.name = name;
//	}
//	
//	void setMoney(int money) {
//		this.money = money;
//	}
//}
//class Clothes {
//	private String name = "SUPREME";
//	private int money = 1000;
//	
//	Clothes() {}
//	public Clothes(String name, int money) {
//		this.name = name;
//		this.money = money;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getMoney() {
//		return money;
//	}
//	public void setMoney(int money) {
//		this.money = money;
//	}
//	
//		
//}

//class Apple{
//	
//	String func01() {
//		return null;
//	}
//	
//	Integer func02() {
//		return 0;
//	}
//	
//	Apple func03() {
//		return func03();
//	}
//	
//	Apple func04() {
//		return this;	// this 의 두번째 용도 : Chaining =  return 으로 this = 객체 재 호출
//	}
//	
//	void func05() {
//		System.out.println("호출!");
//	}
//}

public class main12and1 {

	public static void main(String[] args) {
		
//		Car car = new Car();
//		
//		// Private 이기 때문에 값을 받을 수 없어서 Error!
////		System.out.println(car.name);
////		System.out.println(car.money);
//		
//		System.out.println(car.getName());
//		System.out.println(car.getMoney());
//		
//		car.setName("람보르기니");
//		car.setMoney(2000);
//		
//		System.out.println(car.getName());
//		System.out.println(car.getMoney());
		
				
//		Apple apple = new Apple();
//		apple.func05();
//		apple.func04().func05();
//		apple.func04().func04().func05();	// Chaining
	}

}
