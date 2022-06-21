package day07;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 15;
		while(i < 10) {
			System.out.println("홍길동");
			i = i + 1;	
			// i += 1; 	// 위 누적 연산자의 간단 버전
			// i++;		// 더 간단한 버전 ==> (증감 연산자)
			// 누적연산자 3가지 종류
		}
//		
		// while의 진정한 쓰임세(시스템이 종료될때까지 무한 반복, 식당 메뉴 키오스크)
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		// 5번 메뉴면 종료
//		while(menu <= 4) {
//			System.out.print("1 ~ 4번 메뉴를 선택하세요(종료는 5번)");
//			menu = sc.nextInt();
//			
//			if(menu <= 4) {
//				System.out.println(menu + "번 메뉴를 선택하셨습니다.");
//			} else {
//				System.out.println("시스템을 종료합니다.");
//			}
//			System.out.println("반복문의 마지막 줄입니다.");
//		}
//		
//		System.err.println("반복문의 종료 마지막 줄");
		
		// 무한 반복 while문
		while(true) {
			System.out.print("1 ~ 4번 메뉴를 선택하세요(종료는 5번)");
			menu = sc.nextInt();

			if(menu <= 4) {
				System.out.println(menu + "번 메뉴를 선택하셨습니다.");
			} else {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			System.out.println("반복문의 마지막 줄입니다.");
		}
		
		System.err.println("반복문의 종료 마지막 줄");
	}

}











