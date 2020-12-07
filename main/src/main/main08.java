package main;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class main08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		//ex35
		//우박수를 삼항 연산으로
//		System.out.print("숫자를 입력하세요: ");
//		int x = sc.nextInt();
//
//		while(true) {
//			x = ( x % 2 == 0 ? x/2 : x*3+1);
//			if( x == 1) {
//				System.out.println(x);
//				break;
//			}
//		}
//		System.out.println("탈출!");
		
		
		//ex36
		//다중(중첩) for문 
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.println(i + "," + j);
//			}			
//		}
		
		//다중 for문 정석코드 : 2차원(면)의 개념
//		for (int i = 0; i < 3; i++) { 
//			System.out.println();
//			for (int j = 0; j < 4; j++) {
//				System.out.print("[" + i + " " + j + "]");
//			}			
//		}
		
//		int k = 0;
//		for (int i = 0; i < 3; i++) { 
//			System.out.println();
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d " ,k);
//				k++;
//			}			
//		}
		
		//ex37
//		for (int i = 0, k = 0; i < 3; i++) {    //세로 반복 횟수
//			System.out.println();
//			for (int j = 0; j < 4; j++, k++) {   //가로 반복 횟수
//				System.out.printf("%02d " ,k);
//			}			
//		}
		
		//ex38
		//랜덤 인수로 이중for문화 하고 각 줄의 합 구하기 
//		int x;
//		int sum = 0;
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.println();
//			for (int j = 0; j < 4; j++) {
//				x = random.nextInt(10);
//				System.out.printf("%02d ", x);
//				sum = sum + x;
//			}
//		System.out.println(" 계: " + sum);
//		sum = 0;
//		}
		
		//ex39 Casting
//		System.out.println(65);
//		System.out.println((char)65);
//		System.out.println((int)'A');
		
//		for (int i = 0; i < 26; i++) {
//			System.out.println((char)('A' + i));
//			System.out.printf("%s ", (char)('A' + i));
//		}
		
		//ex40 : 랜덤 알파벳 뽑기
//		int x;
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.println();
//			for (int j = 0; j < 4; j++) {
//				x = random.nextInt(26);
//				System.out.printf("%s ", (char)('A' + x));
//			}
//			
//		}
		
		
		//ex41
		//자료구조 : CRUD
//		LinkedList<Integer> li = new LinkedList<Integer>(); //container의 속성을 정해줌(반드시 객체타입(클래스)만 넣을 수 있다.)
//		System.out.println(li.size());  //박스 안 갯수를 확인해 주는 함수
		
//		li.add(10);  //박스에 집어 넣는 함수(Insert)
//		li.add(20);
		
//		System.out.println(li.size());
		
//		for (int i = 0; i < 10; i++) {
//			li.add(i);			
//		}
//		System.out.println(li.size());
		
//		for (int i = 0; i < li.size(); i++) {
//			Integer data = li.get(i);	
//			System.out.print(data + " ");   // 데이터를 확인함(Reading)
//		}
		
//		for (int i = 0; i < li.size(); i++) {
//			System.out.print(li.get(i) + " ");
//		}
		
//		li.add(0, 77);	//0의 위치에 77을 넣게 된다.
//		li.add(3, 88);	//3의 위치에 88을 넣게 된다.
//				
//		for (int i = 0; i < li.size(); i++) {
//			System.out.print(li.get(i) + " ");
//		}System.out.println();
//		
//		li.remove(7);	//7에 위치한 값을 제거 한다(Delete)
//		
//		for (int i = 0; i < li.size(); i++) {
//			System.out.print(li.get(i) + " ");
//		}System.out.println();
//		
//		li.set(3, 99);	//3에 위치한 값을 99로 바꿔준다(Update)
//		
//		for (int i = 0; i < li.size(); i++) {
//			System.out.print(li.get(i) + " ");
//		}System.out.println();
//		
//		for (Integer data : li) {
//			System.out.print(data + " ");
//		} 	// for each : 데이터 값의 처음 부터 끝까지 모두 출력할 때
			
				
		
		
		
		//ex42
		class Apple {
			
			int x, y;
			
			Apple() {}
			Apple(int a, int b) {
				x = a;
				y = b;
			}
			
			void show() {
				System.out.println(x + " " + y);
			}
			
		}
		
		Apple a1 = new Apple();
		
//		a1.show();
		
		a1.x = 100;
		a1.y = 200;
		
//		a1.show();
		
		Apple a2 = new Apple(77, 88);
		
//		a2.show();
		
		//자료 구조
		LinkedList<Apple> oli = new LinkedList<Apple>();
		
		//Add 방법1
		oli.add(a1);
		oli.add(a2);
		
//		System.out.println(oli.size());
		
		//Add 방법2
		for (int i = 0; i < 5; i++) {
			Apple ta = new Apple();
			ta.x = i * 10;
			ta.y = i * 20;
			oli.add(ta);
		}
		
//		System.out.println(oli.size());
		
		//Add 방법3
		for (int i = 0; i < 5; i++) {
			Apple ta = new Apple(i * 30, i * 40);
			oli.add(ta);
		}
		
//		System.out.println(oli.size());
		
		//Add 방법4
		for (int i = 0; i < 5; i++) {
			oli.add(new Apple(i * 50, i * 60));
		}
		
//		System.out.println(oli.size());
		
		//Reading 방법1 : 출력코드 사용
		for (int i = 0; i < oli.size(); i++) {
			System.out.println(oli.get(i).x + " " + oli.get(i).y);
		}System.out.println();
		
		//Reading 방법2 : 클래스 내장함수(show) 사용 - show에 저장되어 있기에 가능함
		for (int i = 0; i < oli.size(); i++) {
			oli.get(i).show();
		}System.out.println();
		
		//Reading 방법3 : foreach 사용
		for (Apple data : oli) {
			data.show();
		}System.out.println();
		
		//Delete 방법 및 조회
		oli.remove(3);
		
		for (Apple data : oli) {
			data.show();
		}System.out.println();
		
		//Update 방법 및 조회
		oli.set(2, new Apple(777, 888));
		
		for (Apple data : oli) {
			data.show();
		}
	}
}
